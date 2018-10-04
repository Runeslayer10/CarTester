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
  int year, randomNum; 
  double price;
  
  public Car(){
      model = "Cherokee";
      make = "Jeep";
      year = 2016;
      price = 25500.50;
      randomNum = (int) (Math.random() * 3 + 1);
      if(randomNum==1){
          heatedSeats = "Heated Seats";
      }else if(randomNum==2){
          remoteStart = "Remote Starter";
      }else{
          heatedSeats = "Heated Seats!";
          remoteStart = "Remote Starter";
      } 
  }
  public Car(String _model,String _make, String _heatedSeats, String _remoteStart,
          int _year, int _randomNum, double _price){
      
      _make = "Dodge";
      _model = "Challenger";
      _year = 2018;
      _price = 30000.52;
       _randomNum = (int) (Math.random() * 3 + 1);
      if(randomNum==1){
          heatedSeats = "Heated Seats";
      }else if(randomNum==2){
          remoteStart = "Remote Starter";
      }else{
          heatedSeats = "Heated Seats!";
          remoteStart = "Remote Starter";
      }
  }
  
}
