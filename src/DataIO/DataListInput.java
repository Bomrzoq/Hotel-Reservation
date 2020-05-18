/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataIO;

import Hotel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bomrz
 */
public class DataListInput  implements Serializable{
    
    
    
    
    public HotelList importHotelData() {
       HotelList holder=new HotelList();
        try {
            
            
            File folderpath = new File("C:\\Registered_Hotels");
            if(folderpath==null)
            folderpath.createNewFile();
            File[] paths=folderpath.listFiles();
            if(!(paths==null)){
            for(File a:paths){
                
            FileInputStream outputStream= new FileInputStream( a.getAbsoluteFile());
            ObjectInputStream in=new ObjectInputStream(outputStream);
            
            holder.add((Hotel)in.readObject());
           
                
         //   holder.display();
         //   hotellist.add(holder);
            in.close();
            outputStream.close();
            }
            }
            
            
            
            
            
         
    }  catch (FileNotFoundException ex) {
           Logger.getLogger(DataListInput.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException | ClassNotFoundException ex) {
           Logger.getLogger(DataListInput.class.getName()).log(Level.SEVERE, null, ex);
       
       
    
    
}
  return holder;
   }
   
}