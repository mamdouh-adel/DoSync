/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.at.mamdouh.main;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;
import ua.at.mamdouh.sync.LocalDirSync;


/**
 *
 * @author pipo
 */
public class FXMLDocumentController implements Initializable {
    
    private File file;
    private Image image;
    
    
    private BooleanProperty startBtnProps = new SimpleBooleanProperty(false);
    
    @FXML
    private ImageView runImage;
    
    @FXML
    private Label srcLbl, destLbl;
    
    @FXML
    private Button startBtn, srcFolderBtn, destFolderBtn;
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         file = new File("res/syncronise.gif");
         image = new Image(file.toURI().toString());
      
         startBtn.setDisable(true);
      
      //-------
      
      init_listener();
        
    }    
    
    private void init_listener(){
    
        srcFolderBtn.setOnAction((event) -> {
            
             DirectoryChooser directoryChooser = new DirectoryChooser();
                File selectedDirectory = 
                        directoryChooser.showDialog(null);
                 
                if(selectedDirectory == null){
                    srcLbl.setText("No Directory selected !");
                    
                    srcLbl.setTextFill(Color.valueOf("#C70039"));
                    
                }else{
                    srcLbl.setText(selectedDirectory.getAbsolutePath());
                    
                    srcLbl.setTextFill(Color.valueOf("#269a0f"));
                }
                
                startBtnProps.set(getDirsStatus());
                
            }
        );
        
        
           destFolderBtn.setOnAction((event) -> {
            
             DirectoryChooser directoryChooser = new DirectoryChooser();
                File selectedDirectory = 
                        directoryChooser.showDialog(null);
                 
                if(selectedDirectory == null){
                    destLbl.setText("No Directory selected !");
                    
                     destLbl.setTextFill(Color.valueOf("#C70039"));
                     
                }else{
                    destLbl.setText(selectedDirectory.getAbsolutePath());
                    
                    destLbl.setTextFill(Color.valueOf("#269a0f"));
                }
                
                startBtnProps.set(getDirsStatus());
            }
        );
           
           //----------- start button -----------------
           
           startBtn.setOnAction((event) -> {               
               
               if(startBtn.getText().equals("Start")){
               
                 startBtn.setText("Stop");
               
               startBtn.setTextFill(Color.valueOf("#C70039"));
               
                runImage.setImage(image);              
                
                LocalDirSync.getInstance().init(srcLbl.getText(), destLbl.getText(), 5, true);
                   
               }else{
                   
                       startBtn.setText("Start");
               
                      startBtn.setTextFill(Color.valueOf("#07750b"));
               
                      runImage.setImage(null);
               
                      LocalDirSync.getInstance().stop();
               }
           });
           
           
           //------------   start button Property --------------
           
           startBtnProps.addListener((observable, oldValue, newValue) -> {
               
               if(newValue == true){
               
                   startBtn.setDisable(false);
                   
               }else{
               
                   startBtn.setDisable(true);
               }
               
           });
    }    
    
    
    private boolean getDirsStatus(){
    
        File srcDir = new File(srcLbl.getText());
        File destDir = new File(destLbl.getText());
        
        if(srcDir.isDirectory() && destDir.isDirectory()){
        
            return true;
        }
        
        return false;
    }
}
