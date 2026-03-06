package application.domain;

import java.util.List;

public class Bedroom {

   private int id;
   private String room;
   private String roomType;
   private double price;
   private boolean state;



   //constructors


    public Bedroom(){}

     public Bedroom(int id, String room, String roomType, double price,boolean state){


         this.id = id;
         this.room = room;
         this.roomType = roomType;
         this.price = price;
         this.state = state;

     }
         //geters and setters

          public int getId() {

              return id;


          }

          public void setId(int id){
              this.id=id;

              }

              public String getRoom(){
                  return room;

              }

              public void setRoom(String Room){

                      this.room=room;


              }


              public double getprice(){
              return price;

              }


              public void setPrice(double price){
                this.price = price;

              }

              public boolean getState(){
               return state;

              }

              public void setState(double State){
                  this.state=state;

              }


              //class methods

    public Bedroom createUser(Bedroom bedroom){


        return bedroom;
    }


    public Bedroom updateUser(Bedroom bedroom){


        return bedroom;
    }

    public List<Bedroom> getbetroom(){
        return null;
    }

    public Bedroom getbedroomById(int id){
        return null;
    }

    public void deleteBedroom(int id){

    }





}






