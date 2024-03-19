/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author jingwen
 */
public class Passenger extends User{
    private String passengerID;
    
    public Passenger(String passengerID){
        this.passengerID = passengerID;
    }
    
    public String getPassengerID(){
        return this.passengerID;
    }
}
