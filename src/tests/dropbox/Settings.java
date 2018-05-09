/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.dropbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pipo
 */
public class Settings {
    
    private static Settings settings ;
    
    Map<String, Object> settingsMap ;
    
    private FileInputStream fis;
    private ObjectInputStream ois;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    
    private Settings(){
    
        settingsMap = new HashMap<>();
    
        settingsMap = initSettingsMap();
    }
    
    public static Settings getInstance(){
    
        if(settings == null){
        
            settings = new Settings();
            
        }
        
        return settings;
    }
    
    public void saveSettings(String key, Object obj){
    
        settingsMap.put(key, obj);
        
        try {
            
            fos = new FileOutputStream("app.settings");
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(settingsMap);
            
            oos.flush();
            fos.flush();
            
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Object loadSettings(String key){
        
        Map<String, Object> map = null;
        
        try {
            
            fis = new FileInputStream("app.settings");
            ois = new ObjectInputStream(fis);
            
            map = (Map<String, Object>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return map.get(key);
    }
    
    
    private Map<String, Object> initSettingsMap(){
        
        Map<String, Object> map = null;
        
        try {
            
           FileInputStream fis = new FileInputStream("app.settings");
            ois = new ObjectInputStream(fis);
            
            map = (Map<String, Object>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            
            map = new HashMap<>();
            
            saveSettings("first run date", LocalDateTime.now());
            
            return map;
            
         //   Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return map;
    }
    
}
