/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author pipo
 */
public class Test3 {
    
    public static void main(String[] args) {
        
       /*Collection<String> listOne = Arrays.asList("milan","iga",
                                                    "dingo","iga",
                                                    "elpha","iga",
                                                    "hafil","iga",
                                                    "meat","iga", 
                                                    "neeta.peeta","iga");

          Collection<String> listTwo = Arrays.asList("hafil",
                                                     "iga",
                                                     "binga", 
                                                     "mike", 
                                                     "dingo","dingo","dingo");*/
       
         Collection<String> OldList = Arrays.asList("fileX","fileZ","del");

          Collection<String> newList = Arrays.asList("fileY","fileZ","myFile");

          Collection<String> similar = new HashSet<String>( OldList );
          
          Collection<String> newFiles = new HashSet<String>();
          
          Collection<String> deletedFiles = new HashSet<String>();
          
          deletedFiles.addAll( OldList );
          newFiles.addAll( newList );

          similar.retainAll( newList );
          newFiles.removeAll( similar );
          
          newFiles.removeAll(OldList);
          deletedFiles.removeAll(similar);
        

         // System.out.printf("One:%s%nTwo:%s%nSimilar:%s%nDifferent:%s%n", listOne, listTwo, similar, different);
         
         System.out.println("Deleted Files: "  + deletedFiles);
         
         System.out.println("Created Files: " + newFiles);
    }
    
}
