/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainticket.TicketBooking;

import DBM.FileManager;
import User.Passenger;
import java.util.ArrayList;
import trainticket.Train;

/**
 *
 * @author jingwen
 */
public class Booking {
    private String bookingID;
    private String bookingTime;
    private Train bookedTrain;
    private boolean paymentStatus;
    private double totalCost;
    private String inChargePassengerID;
    private Train instance;
    
    public Booking(Train bookedTrain, Passenger currentPassenger){
        this.instance = bookedTrain;
        this.inChargePassengerID = currentPassenger.getPassengerID();
    }
    
    public static int searchForLatestbookingID(){
        FileManager file = new FileManager("/Assets/Bookings.txt");
        ArrayList<String[]> bookings = file.saveTo2DArrayList();
        int count = 0;

        for(String[] data : bookings){
            count++;
        }
        return count;
    }
    
}
