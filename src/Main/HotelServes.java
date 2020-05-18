/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DataIO.*;
import Hotel.*;
import User.*;

import java.util.Random;
import java.util.Scanner;

/*
 *
 * @author bomrz
 */
public class HotelServes  {
    
    static double discount=0;
    
    public static void main(String[]args){
          Scanner in=new Scanner(System.in);
          User user1=new User();
          HotelList hotellist=new HotelList();
          Hotel holderHotel=new Hotel();
          DataListOutput save=new DataListOutput();
          DataListInput upload=new DataListInput();
          
          hotellist=upload.importHotelData();
         
         int choise=0;
        boolean BigCHoise=true;
         while(BigCHoise){
             try{
          //this will take all the lines from the wanted path file and put it all inside of the line variable as String
          System.out.println("~~~~~~~ Welcome to Holin: The hotel reservation system ~~~~~~~");
          System.out.print("1. Admin\n2. User\n3. Recipt\n4. Exit\n->:");
          switch(in.nextInt()){
              case 1:
                  boolean exit=true;
                  while(exit){
                  System.out.print("1. Add hotel\n2. Update Hotel\n3. Exit\n->:");
                  switch(in.nextInt()){
                      case 1:
                          holderHotel=new Hotel();
                          System.out.print("Enter name of the hotel :");
                          holderHotel.setName(in.next());
                          System.out.print("Enter location of the hotel :");
                          holderHotel.setLocation(in.next());
                          hotellist.add(holderHotel);
                          break;
                      case 2:
                          hotellist.diplay();
                          System.out.print("Enter the name of the hotel :");
                          hotellist.updateHotelDetails(in.next());
                          
                          break;
                      case 3:
                          System.out.println("Admin has been signed out.");
                          exit=false;
                          break;
                  
                  }
                  }
                  break;
              case 2:
                  System.out.print("1. Reserve Hotel\n2. Rate Hotel\n3. Exit\n->:");
                  switch(in.nextInt()){
                      case 1:
                          hotellist.diplay();
                          System.out.print("- Enter the number of the hotel you want to reserve :");
                         String nameHotel= hotellist.getArrayList().get(in.nextInt()).getName();
                         System.out.print("~~~~~~~ What kind of reservation you want ~~~~~~~\n1. VIP\n2. Economic\n3. Normal\n->:");
          switch(in.nextInt()){
              case 1://vip
                  System.out.print("Welcome sir to the VIP section , what is your name?\n->:");
                  String nameUser=in.next();
                  in.nextLine();
                  user1.setName(nameUser);
                  Random n=new Random();
                  int x;
                  x=n.nextInt(50)+1;
                  if(40< x){
                    discount=0.10;
                      System.out.println("Hi,"+user1.getName()+" we in holin we care for out customer.and our system has gave you a discount with a random chance!\nwe will givae you a %10 discount on any kind of room you take :)");
                    }
                  
                  System.out.print("For reserving this kind of room it will cost you 250$ per day,accept?  1. No  2. Yes \n->:");
                  choise=in.nextInt();
                  if(choise==2){
                      System.out.print("for how many days?\n->:");
                      int days=in.nextInt();
                      System.out.println("Total price is :"+((250*days)-(250*discount)));
                      user1.setDebte(((250*days)-(250*discount)));
                      System.out.println("Room has been reserved for :"+user1.getName()+"\nPrice: "+user1.getDebte()+"\n Hotel reserved :"+nameHotel);
                      for(Hotel h:hotellist.getArrayList()){
                          if(h.getName().equalsIgnoreCase(nameHotel))
                              user1.addHotel(h);
                              }
                      user1.setReservedHotel(nameHotel);
                  }
                  else 
                      System.out.println("No worrys nothing have been registered, thank you");
                  break;
              case 2://economic
                  System.out.print("Welcome sir to the economical section , what is your name?\n->:");
                  String nameUser2=in.next();
                  in.nextLine();
                  user1.setName(nameUser2);
                  Random n2=new Random();
                  int x2;
                  x2=n2.nextInt(50)+1;
                  if(40< x2){
                    discount=0.10;
                      System.out.println("Hi,"+user1.getName()+" we in holin we care for out customer.and our system has gave you a discount with a random chance!\nwe will givae you a %10 discount on any kind of room you take :)");
                    }
                  
                  System.out.print("For reserving this kind of room it will cost you 20$ per day,accept?  1. No  2. Yes \n->:");
                  choise=in.nextInt();
                  if(choise==2){
                      System.out.print("for how many days?\n->:");
                      int days=in.nextInt();
                      System.out.println("Total price is :"+((20*days)-(20*discount)));
                      user1.setDebte(((20*days)-(20*discount)));
                      System.out.println("Room has been reserved for :"+user1.getName()+"\nPrice: "+user1.getDebte()+"\n Hotel reserved :"+nameHotel);
                      for(Hotel h:hotellist.getArrayList()){
                          if(h.getName().equalsIgnoreCase(nameHotel))
                              user1.addHotel(h);
                              }
                      user1.setReservedHotel(nameHotel);
                  }
                  else 
                      System.out.println("No worrys nothing have been registered, thank you");
                  break;
              case 3://normal
                  System.out.print("Welcome sir to the normal section , what is your name?\n->:");
                  String nameUser3=in.next();
                  in.nextLine();
                  user1.setName(nameUser3);
                  Random n3=new Random();
                  int x3;
                  x3=n3.nextInt(50)+1;
                  if(40< x3){
                    discount=0.10;
                      System.out.println("Hi,"+user1.getName()+" we in holin we care for out customer.and our system has gave you a discount with a random chance!\nwe will givae you a %10 discount on any kind of room you take :)");
                    }
                  
                  System.out.print("For reserving this kind of room it will cost you 100$ per day,accept?  1. No  2. Yes \n->:");
                  choise=in.nextInt();
                  if(choise==2){
                      System.out.print("for how many days?\n->:");
                      int days=in.nextInt();
                      System.out.println("Total price is :"+((100*days)-(100*discount)));
                      user1.setDebte(((100*days)-(100*discount)));
                      System.out.println("Room has been reserved for :"+user1.getName()+"\nPrice: "+user1.getDebte()+"\n Hotel reserved :"+nameHotel);
                      for(Hotel h:hotellist.getArrayList()){
                          if(h.getName().equalsIgnoreCase(nameHotel))
                              user1.addHotel(h);
                              }
                      user1.setReservedHotel(nameHotel);
                  }
                  else 
                      System.out.println("No worrys nothing have been registered, thank you");
                  break;
                        }
                          break;
                      case 2:
                          hotellist.diplay();
                          System.out.println("Enter the name of the hotel to rate :");
                          hotellist.rateHotel(in.next());
                          System.out.println("Rating is done successfuly!");
                          
                          break;
                      case 3:
                          System.out.println("Thank you for using our system , bye :)");
                          break;
                  }
                  break;
              case 3:
                  
                  System.out.println("============= Receipt =============");
                  user1.displayInfo();
                  break;
                  
              case 4:
                  System.out.println("GoodBye!");
                  BigCHoise=false;
                  break;
          }
    
         }catch(Exception ex){
    ex.getStackTrace();
         }
          /*
          int i=0;
          while(i<3){
              holderHotel=new Hotel();
              System.out.println("Enter hotel details:");
              System.out.print("Name: ");
              holderHotel.setName(in.next());
              in.nextLine();
              System.out.print("Location: ");
              holderHotel.setLocation(in.next());
              in.nextLine();
              hotellist.add(holderHotel);
              i++;
          }
*/          finally{
          save.saveHotelData(hotellist);

          
    }
        
}
    
  
    }
}
