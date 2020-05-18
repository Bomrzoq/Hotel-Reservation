/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataIO;

import Hotel.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bomrz
 */
public class DataListOutput implements Serializable{
    
    public void saveHotelData(HotelList hotellist ){
        try {
            File creatore=new File("C:\\Registered_Hotels");
            
            creatore.mkdir();
            for(Hotel h:hotellist.getArrayList()){
                File file=new File("C:\\Registered_Hotels\\Hotel_"+h.getName()+".txt");
             FileOutputStream outputStream= new FileOutputStream(file);
            ObjectOutputStream out=new ObjectOutputStream(outputStream);
            out.writeObject(h);
            out.close();
            outputStream.close();
            }
            System.out.println("Hotels has been saved !");
            } catch (FileNotFoundException ex) {
            Logger.getLogger(DataListOutput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotSerializableException ex) {
            Logger.getLogger(DataListOutput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataListOutput.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
    
   
}
