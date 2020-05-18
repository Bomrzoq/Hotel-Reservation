/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author bomrz
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class HotelList  implements Serializable{
    
    
    ArrayList<Hotel> hotel_list=new ArrayList<>();
    Scanner in=new Scanner(System.in);
    
    public void add(Hotel hotel){
        hotel_list.add(hotel);
    }
    
    public void deleteHotel(String name){
        int counter=0;
        boolean checker=false;
        for(Hotel h:hotel_list){
            if(h.getName().equalsIgnoreCase(name)){
                hotel_list.remove(counter);
                System.out.println("Hotel has been removed succesfully!");
                checker=true;
                break;
            }
            counter++;
        }
        if(!checker){
            System.out.println("Hotel wanted don't exsit in the system ,please add it if needed");
        }
    }
    
    public void updateHotelDetails(String name){
        int counter=0;
        boolean checker=false;
        for(Hotel h:hotel_list){
            if(h.getName().equalsIgnoreCase(name)){
                System.out.print("What do you want to up date from this hotel\n1. Name\n2.  Location\n->:");
                switch(in.nextInt()){
                    case 1:
                        while(true){
                        System.out.print("Enter hotel new name :");
                        String old=h.getName();
                        h.setName(in.next());
                        in.nextLine();
                        System.out.print("Old Name :"+old+"\nNew Name :"+h.getName()+"\nAny problem?\n1. Yes\n2. No :->");
                       if(in.nextInt()>1){
                           break;
                       }
                }
                        
                        break;
                    case 2:
                        while(true){
                        System.out.print("Enter new location :");
                        String old=h.getLocation();
                        h.setLocation(in.next());
                        in.nextLine();
                        System.out.print("Old Location :"+old+"\nNew Location :"+h.getLocation()+"\nAny problem?\n1. Yes\n2. No :->");
                       if(in.nextInt()>1){
                           break;
                       }
                }
                        break;
                    
                }
            }
            counter++;
        }
        if(!checker){
            System.out.println("Hotel wanted don't exsit in the system ,please add it if needed");
        }
    }
    
    public void rateHotel(String name){
        
            for(Hotel h:hotel_list){
                if(h.getName().equalsIgnoreCase(name)){
                    System.out.println("Rate from 1 to 5 ( 1 as very bad , 5 as very good)\n->:");
                        double ratein=in.nextDouble();
                        h.setRating((h.getRating()+ratein)/2.00);
                }
            }
    
}
    
    
   public ArrayList<Hotel> getArrayList(){
       return this.hotel_list;
   } 
    
    public void diplay(){
        int counter=0;
        for(Hotel h:this.hotel_list){
            System.out.print(counter+ " ");h.display();
            counter++;
        }
    }
}



