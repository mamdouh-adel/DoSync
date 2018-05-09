/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.at.mamdouh.sync;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pipo
 */
public class LocalDirSync {
    
  private  File srcDir;
  private File destDir;
  private  int pollingInterval;
  private  Timer dirWatcher;
  private  long lastReadTimeStamp = 0L;
  
  private List<String> srcFilesNameList;
  
   private List<String> destFilesNameList;
  
   private boolean isTwoWays;
   
   Map<String, Long> leaderMap = new HashMap<>();
    private static final String SRC_KEY = "Source Dir";   
    private static final String DEST_KEY = "Destination Dir"; 
    private long srcLastAction;
    private long destLastAction;

    public Timer getDirWatcher() {
        return dirWatcher;
    }

    public void setDirWatcher(Timer dirWatcher) {
        this.dirWatcher = dirWatcher;
    }
    
    
    
    
    private LocalDirSync(){}
    
    private static LocalDirSync localDirSync;
     
    public static LocalDirSync getInstance(){
    
        if(localDirSync == null){
            
            localDirSync = new LocalDirSync();
        }
        
        return localDirSync;
    }
    
    public void stop(){
        
        dirWatcher.purge();
    
        dirWatcher.cancel();
        
        dirWatcher = null;
    }
   
  public  boolean init(String source_Dir, String destination_Dir, int _pollingInterval, boolean isTwoWays) {
      
    this.isTwoWays = isTwoWays;
      
    srcDir =  new File(source_Dir);
    
    destDir = new File(destination_Dir);
    
    pollingInterval = _pollingInterval; // In seconds

    watchLocalDir();

    return true;
  }

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
            
            srcFilesNameList = getFilesNameLevel_List(srcDir);
            
            destFilesNameList = getFilesNameLevel_List(destDir);
     
           if(isTwoWays){
     
               twoWaysFunc();
                
           }else{
           
                 compareLists2(destFilesNameList, srcFilesNameList, srcDir, destDir);
               
           }

            }

          lastReadTimeStamp = System.currentTimeMillis();
        }
      }, 0, 1000 * pollingInterval);
    }

  }
  
  private  List<File> listf(String directoryName) {
      
        File directory = new File(directoryName);

        List<File> resultList = new ArrayList<>();

        // get all the files from a directory
        
        File[] fList = directory.listFiles();
        
        resultList.addAll(Arrays.asList(fList));
        
        for (File file : fList) {
            
         if (file.isDirectory()) {
                
                resultList.addAll(listf(file.getAbsolutePath()));
                
            }
        }
        return resultList;
    }
  
     //----------------- prepair Channel by nio ----------------------------
     
      private void fastChannelCopy(final ReadableByteChannel src, final WritableByteChannel dest) {
          
    final ByteBuffer buffer = ByteBuffer.allocateDirect(16 * 1024);
    
    try{
    
        while (src.read(buffer) != -1) {
      // prepare the buffer to be drained
      buffer.flip();
      // write to the channel, may block
      dest.write(buffer);
      // If partial transfer, shift remainder down
      // If buffer is empty, same as doing clear()
      buffer.compact();
    }
    // EOF will leave buffer in fill state
    buffer.flip();
    // make sure the buffer is fully drained.
    while (buffer.hasRemaining()) {
      dest.write(buffer);
    }
    
    }catch(IOException e){
        
    }
  }
      
      //------------- copy method -------------
      
      private void copyFile(File inputFile, File outputFile){      
          
          InputStream input = null;
         OutputStream output = null;
 
      try {
          
           input = new FileInputStream(inputFile);
           output = new FileOutputStream(outputFile); 
           
      } catch (FileNotFoundException ex) {
          Logger.getLogger(LocalDirSync.class.getName()).log(Level.SEVERE, null, ex);
          
          System.out.println("nul............................");
          
      }
      
// get an channel from the stream

final ReadableByteChannel inputChannel = Channels.newChannel(input);
final WritableByteChannel outputChannel = Channels.newChannel(output);

// copy the channels

fastChannelCopy(inputChannel, outputChannel);
      try {
          // closing the channels
          
          inputChannel.close();
          outputChannel.close();
          
      } catch (IOException ex) {
          Logger.getLogger(LocalDirSync.class.getName()).log(Level.SEVERE, null, ex);
      }
          
          }
         
 
      
      
      //----------------- delete method -------------------
      
      private void deleteFile(File file){
      
          file.delete();
      }
      
       //----------------- compareLevel method ---------------------
    
    private String compareLevel(File sFile, File srcFD, File destFD){
         
        String level = sFile.getParentFile().getAbsolutePath().replace(srcFD.getAbsolutePath(), "");
        
        level = level.replace("\\", "/");
        
        if(!level.isEmpty()){
        
            File newDir = new File(destFD.getAbsoluteFile() + level);
            
            if(!newDir.exists()){
            
                newDir.mkdirs();
            }
        }

        return level;
    }
    
    //-------------------- filesName prefix -----------------
    
    private List<String> getFilesNameLevel_List(File target){
        
        List<String> filesListName = new ArrayList<>();
        
        List<File> files = getFilesList(target);
        
        files.forEach((file)->{

             String level = file.getParentFile().getAbsolutePath().replace(target.getAbsolutePath(), "");
        
             level = level.replace("\\", "/");
             
                  filesListName.add(level + "/" + file.getName());
        });

        return filesListName;
    }
    
    
    //------------- list of files from dir -------------------
    
     private  List<File> getFilesList(File directory) {

        List<File> resultList = new ArrayList<>();

        // get all the files from a directory
        
        File[] fList = directory.listFiles();
        
        resultList.addAll(Arrays.asList(fList));
        
        for (File file : fList) {
            
          if (file.isDirectory()) {
              
                resultList.addAll(listf(file.getAbsolutePath())); 
            }
        }
       
        return resultList;
    }
     
     
      //---- new -compare lists ------------------------
  
     private void compareLists2(List<String> srcList, List<String> destList, File srcFD, File destFD) {
         
         List<File> srcFiles = getFilesList(srcFD);
             
         HashSet<String> similar = new HashSet<>( srcList );
          
          HashSet<String> newFiles = new HashSet<>();
          
          HashSet<String> deletedFiles = new HashSet<>();
          
          deletedFiles.addAll(srcList);
          newFiles.addAll(destList);

          similar.retainAll(destList );
          newFiles.removeAll( similar );
          
          newFiles.removeAll(srcList);
          deletedFiles.removeAll(similar);
         
          if(!deletedFiles.isEmpty()){
          
               System.out.println("Deleted Files: "  + deletedFiles);
               
               deletedFiles.forEach((fileLevel)->{
         
               deleteFile(new File(destFD + fileLevel));
                   
               });             
          }
        
         if(!newFiles.isEmpty()){
         
              System.out.println("Created Files: " + newFiles);
              
              newFiles.forEach((fileLevel) -> {
               
               File srcFile = new File(srcFD + fileLevel);
               
               File destFile = new File(destFD + fileLevel);
               
               if(srcFile.isDirectory()){
             
                   if(!destFile.exists()){
                   
                       destFile.mkdirs();
                   }
                   
               }else{
           
                   if(!destFile.getParentFile().exists()){
                   
                       destFile.getParentFile().mkdirs();
                   }
                   
                   copyFile(srcFile, new File(destFD + fileLevel));
               }       
             });
         }
         
         srcFiles.stream().filter((file) -> (file.isFile())).filter((file) -> ( file.lastModified() > lastReadTimeStamp )).map((file) -> {
        
             System.out.println("Modify File: " + file.getAbsoluteFile());
             
          return file;
      }).forEachOrdered((file) -> {
          copyFile(file, new File(destFD + compareLevel(file,srcFD, destFD) + "/" + file.getName()));
      });
        
          }
     
     
     //-------------- if two ways sync ----------------
     
     
     private void twoWaysFunc(){
         
         detectFilesList(srcDir, SRC_KEY);
         
         detectFilesList(destDir, DEST_KEY);
         
        if(isDestLeader()){
        
            compareLists2(srcFilesNameList, destFilesNameList, destDir, srcDir);
            
        }else{
        
            compareLists2(destFilesNameList, srcFilesNameList, srcDir, destDir);
        }      
         
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
     
     private boolean isDestLeader() {
     
        srcLastAction = leaderMap.get(SRC_KEY);
        
        destLastAction = leaderMap.get(DEST_KEY);
        
        if(srcLastAction < destLastAction){
        
            System.out.println("The Leader is: " + DEST_KEY );
            
           return true;       
        }
          
            System.out.println("The Leader is: " + SRC_KEY );
   
        return false;       
     }
    
}
