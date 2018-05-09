/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.dropbox;

// Include the Dropbox SDK.
import com.dropbox.core.*;
import java.awt.Desktop;
import java.io.*;
import java.net.URL;
import java.util.Locale;

public class DropTest1 implements Serializable{
    
    /*
    
  // DbxClient client ;
    
    public static void main(String[] args) throws DbxException, IOException {
    
      ////  firstAuth();
      
     auth();
    }
    
    static DbxClient auth() throws DbxException, IOException{
        
        System.out.println("Start--------------------------");

      //  String accessToken = "j1giBWExI0AAAAAAAAAAJNfMU2kkA5O0qPkVNLgy5y4HHAnDiR_8dkbt_cIQ64pJ";

           String accessToken = (String) Settings.getInstance().loadSettings("accessToken");
           
           if(accessToken == null){
           
               System.out.println("gfdsfgsdfsdxv");
               
               return firstAuth();
           }

     DbxRequestConfig config = new DbxRequestConfig("JavaTutorial/1.0", Locale.getDefault().toString());
     
     DbxClient client = new DbxClient(config, accessToken);
     
     System.out.println("Linked account: " + client.getAccountInfo().displayName);
     
     return client;
        
    }
    
    static DbxClient firstAuth() throws DbxException, IOException{
    
            // Get your app key and secret from the Dropbox developers website.
            
        final String APP_KEY = "8xp25qoxfouc1ys";
        final String APP_SECRET = "12r680r3rcjkzla";

        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);

        DbxRequestConfig config = new DbxRequestConfig("JavaTutorial/1.0", Locale.getDefault().toString());
        
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
        
        //------------------------------------------------------------
    
        // Have the user sign in and authorize your app.
        
String authorizeUrl = webAuth.start();
System.out.println("1. Go to: " + authorizeUrl);
System.out.println("2. Click \"Allow\" (you might have to log in first)");
System.out.println("3. Copy the authorization code.");

   try {
       
    Desktop.getDesktop().browse(new URL(authorizeUrl).toURI());
    
} catch (Exception e) {}
   
   
String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

DbxAuthFinish authFinish = webAuth.finish(code);

String accessToken = authFinish.accessToken;

 DbxClient client = new DbxClient(config, accessToken);
 
   Settings.getInstance().saveSettings("accessToken", accessToken);
 
  System.out.println("Linked account: " + client.getAccountInfo().displayName);
  
  return client;

    }
    
 /*   static void uploadFile() throws FileNotFoundException, IOException, DbxException{
    
        File inputFile = new File("working-draft.txt");
FileInputStream inputStream = new FileInputStream(inputFile);
try {
    DbxEntry.File uploadedFile = client.uploadFile("/magnum-opus.txt",
        DbxWriteMode.add(), inputFile.length(), inputStream);
    System.out.println("Uploaded: " + uploadedFile.toString());
} finally {
    inputStream.close();
}
    }*/
    
}
