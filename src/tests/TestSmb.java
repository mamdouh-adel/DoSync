/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileOutputStream;
 

/**
 *
 * @author pipo
 */
public class TestSmb {
    
     static final String USER_NAME = "douha";
    static final String PASSWORD = "pipo300";
    //e.g. Assuming your network folder is: \my.myserver.netsharedpublicphotos
    static final String NETWORK_FOLDER = "smb://10.0.0.10/douha_cifs/";
 
    public static void main(String args[]) {
        String fileContent = "This is a test file";
 
        new TestSmb().copyFiles(fileContent, "testFile.txt");
    }
 
    public boolean copyFiles(String fileContent, String fileName) {
        boolean successful = false;
         try{
                String user = USER_NAME + ":" + PASSWORD;
                System.out.println("User: " + user);
 
                NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(user);
                String path = NETWORK_FOLDER + fileName;
                System.out.println("Path: " +path);
 
                SmbFile sFile = new SmbFile(path, auth);
                SmbFileOutputStream sfos = new SmbFileOutputStream(sFile);
                sfos.write(fileContent.getBytes());
 
                successful = true;
                System.out.println("Successful" + successful);
            } catch (Exception e) {
                successful = false;
                e.printStackTrace();
            }
        return successful;
    }
    
}
