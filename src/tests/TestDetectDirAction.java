/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author pipo
 */
public class TestDetectDirAction {
    
    private long lastReadTimeStamp = 0L;
    private File srcDir;
    private File destDir;
    private  int pollingInterval ;
    private  Timer dirWatcher;
    
    String source_Dir; 
    String destination_Dir;
    
    Map<String, String> leaderDir = new HashMap<>(); 
    private static final String LEADER_KEY = "leaderDir";
    
    public void test(String source_Dir, String destination_Dir, int pollingInterval){
        
            this.pollingInterval = pollingInterval;
            
            this.source_Dir = source_Dir;
            
            this.destination_Dir = destination_Dir;
        
            srcDir =  new File(source_Dir);
    
            destDir = new File(destination_Dir);
            
        //     dirs_ref.put(LEADER_KEY, source_Dir);
            
    
            watchLocalDir();
    }
    
      private void detectFilesList(String directoryName) {
      
        File directory = new File(directoryName);

        // get all the files from a directory
        
        File[] fList = directory.listFiles();
        
        for (File file : fList) {
            
             if(file.lastModified() > lastReadTimeStamp){
                 
                  System.out.println("Modify File: " + file.getAbsoluteFile());
                  
                  leaderDir.put(LEADER_KEY, directoryName);
                        
             }
            
         if (file.isDirectory()) {
                
              detectFilesList(file.getAbsolutePath());
                
            }
        }
          
    }
      
      //-------------
      
        private void watchLocalDir() {
      
    if ( null == dirWatcher ) {
        
      System.out.println("START");

      dirWatcher = new Timer();

      dirWatcher.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {
            
            if(!srcDir.isDirectory()) {
                
                 System.out.println("Source directory is not found!");
                
                dirWatcher.cancel();
            
        }else if (!destDir.isDirectory() ) {
                
                 System.out.println("Destination directory is not found!");
            
                dirWatcher.cancel();
                
            }else{
            
       
            //-----------------
            
            leaderDir();
            
         
            }

          lastReadTimeStamp = System.currentTimeMillis();
        }
      }, 0, 1000 * pollingInterval);
    }

  }
        
        //----------------- which Leader Dir now ---------------
        
        private void leaderDir(){
        
             detectFilesList(destination_Dir);     
             detectFilesList(source_Dir);
        
            System.out.println("The Leader is: " + leaderDir.get(LEADER_KEY));
            
        }
    
}
