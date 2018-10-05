/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;



/**
 *
 * @author blhad3491
 */
public class Car{
    
  String model, make, heatedSeats, remoteStart;
  int year, randomNum, randomNum2; 
  double price;
  
  public Car(){
      
      model = "Cherokee";
      make = "Jeep";
      year = 2016;
      price = 25495.99;
      
      randomNum = (int) (Math.random() * 3 + 1);
      
      if(randomNum==1){
          heatedSeats = "Yes";
          remoteStart = "No";
      }else if(randomNum==2){
          remoteStart = "Yes";
          heatedSeats = "No";
      }else{
          heatedSeats = "Yes";
          remoteStart = "Yes";
      } 
  }
  public Car(String _model, String _make, String _heatedSeats, String _remoteStart,
          int _year, double _price){
      
      make = _make;
      model =_model;
      year = _year;
      price = _price;
      heatedSeats = _heatedSeats;
      remoteStart = _remoteStart;
  }
  public Car (String model3, String make3){
      
      make = make3;
      model = model3;
      year = 2019;
      price = 97755.99;
      
      randomNum2 = (int) (Math.random() * 3 + 1);
      if(randomNum2==1){
          heatedSeats = "Yes";
          remoteStart = "No";
      }else if(randomNum2==2){
          remoteStart = "Yes";
          heatedSeats = "No";
      }else{
          heatedSeats = "Yes";
          remoteStart = "Yes";
      }   
  }
  
  public void honkTheHorn(){
    System.out.println("HONK! HONK!");
}
  public void littleHorn(){
      System.out.println("Meep! Meep!");
  }
      
  
  public String toString() {
      
      String output = "Make: " + make + "\n" +
              "Model: "+ model + "\n" +
              "Year: " + year + "\n" +
              "HeatedSeats: " + heatedSeats + "\n" +
              "Remote Starter: " + remoteStart + "\n" +
              "Price: $" + price;
      return output;
  }
  
}
