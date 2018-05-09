/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.at.mamdouh.main;

import java.io.OutputStreamWriter;
import java.io.StringWriter;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

 
 
public class WebBrowser extends Application {
    
    private static String web;
    
    private static String key;
    
    private Scene scene;
    
    private static Stage myStage;
    
    @Override public void start(Stage stage) {
        
        myStage = stage;
        
        // create the scene
        stage.setTitle("Dropbox Authentication");
        scene = new Scene(new Browser(),550,550, Color.web("#666970"));
        stage.setScene(scene);
    //    scene.getStylesheets().add("webviewsample/BrowserToolbar.css");        
        stage.show();
    }
    
    public static String getWeb(){
    
        return web;
    }
    
    public static void setWeb(String str){
    
        web = str;
    }
    
    
    public static String getKey(){
        
        System.out.println("The key: " + key);
    
    return key;
    }
    
    public static void setKey(String nkey){
    
        key = nkey;
    }
 
    public static void main(String[] args){
        
            WebBrowser.setWeb("https://www.goodsync.com/features");

       //    launch(args);
       
       WebBrowser.launch(args);
    }
    
    public static void close(){
    
        myStage.close();
    }
    
    
}
class Browser extends Region {
 
    final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();
    
    String firstSplit = "data-token=\"";
    
    String lastSplit = "\"";
     
    public Browser() {
        //apply the styles
        getStyleClass().add("browser");
        // load the web page
     //   webEngine.load("https://www.dropbox.com/developers-v1/core/start/java");
     
     //---------------------- load source ----------------
      webEngine.getLoadWorker().stateProperty().addListener((ObservableValue<? extends State> observable, State oldState, State newState) -> {
          if (newState == Worker.State.SUCCEEDED) {
              Document doc = webEngine.getDocument();
              try {
                  Transformer transformer = TransformerFactory.newInstance().newTransformer();
                  transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
                  transformer.setOutputProperty(OutputKeys.METHOD, "xml");
                  transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                  transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                  transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
                  
                  transformer.transform(new DOMSource(doc),
                          new StreamResult(new OutputStreamWriter(System.out, "UTF-8")));
              } catch (Exception ex) {
                  ex.printStackTrace();
              }
              
           System.out.println("====================================");
          
           try{
           
          String source = getStringFromDocument(doc);
          
          String[] s1 = source.split(firstSplit);
          
          String[] s2 = s1[1].split(lastSplit);
          
      //    String key = s2[0].replaceAll("\"", "");
          
          String key = s2[0];
          
              System.out.println("supose key: " + key);
              
              if(key.length() > 0){
              
                  WebBrowser.close();
              }
              
              WebBrowser.setKey(key);
           
           }catch(ArrayIndexOutOfBoundsException e){}
          
          }
        });
     //--------------------------------------------------------
     
          webEngine.load(WebBrowser.getWeb());

        //add the web view to the scene
        getChildren().add(browser);
      
 
    }
    
    
    private String getStringFromDocument(Document doc)
{
    try
    {
       DOMSource domSource = new DOMSource(doc);
       StringWriter writer = new StringWriter();
       StreamResult result = new StreamResult(writer);
       TransformerFactory tf = TransformerFactory.newInstance();
       Transformer transformer = tf.newTransformer();
       transformer.transform(domSource, result);
       
       return writer.toString();
    }
    catch(TransformerException ex)
    {
       ex.printStackTrace();
       return null;
    }
} 
    private Node createSpacer() {
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        return spacer;
    }
 
    @Override protected void layoutChildren() {
        double w = getWidth();
        double h = getHeight();
        layoutInArea(browser,0,0,w,h,0, HPos.CENTER, VPos.CENTER);
    }
 
    @Override protected double computePrefWidth(double height) {
        return 550;
    }
 
    @Override protected double computePrefHeight(double width) {
        return 550;
    }
}
