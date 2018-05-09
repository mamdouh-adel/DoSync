/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.dropbox;

import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxAuthFinish;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuth;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.WriteMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import ua.at.mamdouh.main.WebBrowser;

/**
 *
 * @author pipo
 */
public class DropBoxUtils {
    
     private DbxClientV2 auth() {
        
        System.out.println("Start--------------------------");
        
      //  String accessToken = "j1giBWExI0AAAAAAAAAAJNfMU2kkA5O0qPkVNLgy5y4HHAnDiR_8dkbt_cIQ64pJ";
      
      String accessToken = (String) Settings.getInstance().loadSettings("accessToken");
      
       if(accessToken == null){
           
               System.out.println("go to firstAuth method");
               
            try {
                
                return firstAuth();
                
            } catch (DbxException | IOException ex) {
                Logger.getLogger(DropBoxUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
        
     DbxRequestConfig requestConfig = new DbxRequestConfig("Do_Sync-authorize");
     
     DbxClientV2 client = new DbxClientV2(requestConfig, accessToken);
     
         try {
             
              System.out.println("Linked account: " + client.users().getCurrentAccount().getName().getDisplayName());
              
         } catch (DbxException ex) {
             Logger.getLogger(DropBoxUtils.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     return client;
        
    }
     
     
     //----------- first run ----------------
     
      private DbxClientV2 firstAuth() throws DbxException, IOException{
    
            // Get your app key and secret from the Dropbox developers website.
            
       /* final String APP_KEY = "8xp25qoxfouc1ys";
        final String APP_SECRET = "12r680r3rcjkzla";*/
        
      /*     final String APP_KEY = "wlro26zjla2fq10";
           final String APP_SECRET = "onhuqwdw8f46w9x";*/
        
      /*     final String APP_KEY = "07o1wdc9ahdsaua";
           final String APP_SECRET = "wrfbpekk6jlonyg";*/
           
       /*    final String APP_KEY = "j6mgl09w8nta2gx";
           final String APP_SECRET = "dak04ochwgu8w5i";*/
       
       
       //---------- mamdouh.elmallah@yahoo.com   Do_Sync
       
           final String APP_KEY = "29ugoi4e28hr1qc";
           final String APP_SECRET = "wpcihjtq079hiu4";

        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
        
         DbxRequestConfig requestConfig = new DbxRequestConfig("Do_Sync-authorize");
         
        DbxWebAuth webAuth = new DbxWebAuth(requestConfig, appInfo);
        
        DbxWebAuth.Request webAuthRequest = DbxWebAuth.newRequestBuilder().withNoRedirect() .build();

        String authorizeUrl = webAuth.authorize(webAuthRequest);

        WebBrowser.setWeb(authorizeUrl);
 
       Application.launch(WebBrowser.class);
 
      String code = WebBrowser.getKey();

      DbxAuthFinish authFinish = webAuth.finishFromCode(code);

      String accessToken = authFinish.getAccessToken();

      DbxClientV2 client = new DbxClientV2(requestConfig, accessToken);
 
     Settings.getInstance().saveSettings("accessToken", accessToken);

     System.out.println("Linked account: " + client.users().getCurrentAccount().getName().getDisplayName());
  
       return client;

    }
      
      //-------------- upload file -------------------------------
      
      public void uploadFile() {
          
          File inputFile = null;
          FileInputStream inputStream = null;
          
          DbxClientV2 client = auth();
    
          try{
                 inputFile = new File("working-draft.txt");
                 inputStream = new FileInputStream(inputFile);
          }catch(FileNotFoundException e){
          
              System.out.println("file not found");
          }
          
          //==========================
          
          try
        {

            client.files().uploadBuilder("/" + inputFile.getName()).withMode(WriteMode.OVERWRITE).uploadAndFinish(inputStream);
          
           System.out.println("Uploaded: " + inputFile.toString());
        }
        //exception handled
        catch (DbxException | IOException e)
        {
            //error message for uploading file to dropboxcloud
            
            Logger.getLogger(DropBoxUtils.class.getName()).log(Level.SEVERE, null, e);
        }
    }
      
      
      //--------- list files and dirs -------------------
      
      public void listFiles(){
          
          DbxClientV2 client = auth();
          
          ListFolderResult listFolders;
          
         
          
         try {
             
           listFolders = client.files().listFolder("");
           
         //    System.out.println("cursor: " + listFolders.getEntries().get(0).getName());
         
             System.out.println("Start...........");
         
         for(int i=0; i < listFolders.getEntries().size(); i++){
         
              System.out.println(listFolders.getEntries().get(i).getName());
              
        //      listFolders.getEntries().
         }
             
         } catch (DbxException ex) {
             Logger.getLogger(DropBoxUtils.class.getName()).log(Level.SEVERE, null, ex);
         }
          
      }
    
}
