/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author pipo
 */
public class Test2 {
    
    static Timer dirwatcher;
    
    static long lastReadTimeStamp = 0L;
    
    static File source = new File("F:\\Mamdouh\\TestSync1\\src3");
    
     static File destination = new File("F:\\Mamdouh\\TestSync1\\dest3");
     
     static Test2 instance = new Test2();
     
    Map<String, Long> leaderMap = new HashMap<>();
    private static final String SRC_KEY = "Source Dir";   
    private static final String DEST_KEY = "Destination Dir"; 
    private long srcLastAction;
    private long destLastAction;
     
     private void watch(){
     
         dirwatcher = new Timer();
         
         dirwatcher.scheduleAtFixedRate(new TimerTask() {
             @Override
             public void run() {
          
                 
                            instance.detectFilesList(source, SRC_KEY); 
                            instance.detectFilesList(destination, DEST_KEY);
         
                            instance.leaderDetector();
                 
                 lastReadTimeStamp = System.currentTimeMillis();
                 
                 
             }
         }, 0, 5000);
         
     }
     
          //--------------------- detect dir leader if two ways ----------------
     
     private void detectFilesList(File directory, String key) {
        
        File[] fList = directory.listFiles();      
             
               if(directory.lastModified() > lastReadTimeStamp){
                 
           //     System.out.println("Modify Main File: " + directory.getAbsoluteFile());
          
                leaderMap.put(key, System.currentTimeMillis());
               
               }   
        
        for (File file : fList) {
            
             if(file.lastModified() > lastReadTimeStamp){
                 
              //     System.out.println("Modify File: " + file.getAbsoluteFile());
                 
                  leaderMap.put(key, System.currentTimeMillis());                  
             }
             
                 if (file.isDirectory()) {
                
              detectFilesList(file,key);
                
            }     
        
        }
      
    }
     
     //----------- detect the Leader ----------------
     
     private void leaderDetector(){
     
        srcLastAction = leaderMap.get(SRC_KEY);
        
        destLastAction = leaderMap.get(DEST_KEY);
        
        if(srcLastAction > destLastAction){
        
            System.out.println("The Leader is: " + SRC_KEY );
            
        }else{
        
            System.out.println("The Leader is: " + DEST_KEY );
            
        }
         
     }

    
    public static void main(String[] args) {
        
      instance.watch();
        
    }
    
}
