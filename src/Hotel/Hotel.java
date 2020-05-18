/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.io.Serializable;

/**
 *
 * @author bomrz
 */
public class Hotel implements Serializable {
    private String name;
    private double rating=5;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void display(){
        System.out.println("-Name :["+this.name+"] -Location :["+this.location+"] -Rating :["+this.rating+"]");
    }
}
