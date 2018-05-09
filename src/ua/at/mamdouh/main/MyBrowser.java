/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.at.mamdouh.main;

import java.io.OutputStreamWriter;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.event.ChangeListener;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

/**
 *
 * @author pipo
 */
public class MyBrowser extends Application{
    
    public void start(Stage primaryStage) {
    
     WebView webview = new WebView();
    final WebEngine webengine = webview.getEngine();
    
    webengine.getLoadWorker().stateProperty().addListener(new javafx.beans.value.ChangeListener<State>(){
         @Override
         public void changed(ObservableValue<? extends State> observable, State oldState, State newState) {
             
                if (newState == Worker.State.SUCCEEDED) {
                        Document doc = webengine.getDocument();
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
                    }
         }
  
    });
   
    webengine.load("http://stackoverflow.com");
    primaryStage.setScene(new Scene(webview, 800, 800));
    primaryStage.show();
}
    
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
