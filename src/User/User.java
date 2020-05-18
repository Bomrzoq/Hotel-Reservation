/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Hotel.*;


/**
 *
 * @author bomrz
 */
public class User {
    private String name;
    private int nationalID;
    private int userNumber;
    private String reservedHotel;
    private double debte;
    private HotelList hotellist=new HotelList();

    public String getReservedHotel() {
        return reservedHotel;
    }

    public void setReservedHotel(String reservedHotel) {
        this.reservedHotel = reservedHotel;
    }

    public double getDebte() {
        return debte;
    }

    public void setDebte(double debte) {
        this.debte += debte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void generateUserNumber() {
        this.userNumber +=1;
    }

    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }
    
    public void addHotel(Hotel hotel){
        this.hotellist.add(hotel);
    }
    
    public void displayInfo(){
        System.out.println("All Reserved hotels:\n-------------------");
        for(Hotel h:hotellist.getArrayList()){
            
        System.out.println(h.getName());
    
       
        }
        System.out.println("-------------------");
        System.out.println("::"+this.name+"::");
        System.out.println("Total Price: "+this.debte);
        System.out.println("===========================");
        }
    
    
}
