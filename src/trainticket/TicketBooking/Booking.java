/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainticket.TicketBooking;

import DBM.FileManager;
import User.Passenger;
import java.util.ArrayList;
import javax.swing.JLabel;
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
    private String seatsSelectedLabel;
    
    public Booking(Train bookedTrain, Passenger currentPassenger, JLabel seatsSelectedLabel){
        this.instance = bookedTrain;
        this.inChargePassengerID = currentPassenger.getPassengerID();
        this.seatsSelectedLabel = seatsSelectedLabel.getText();
        createBookings();
    }
    
//    public static int searchForLatestbookingID(){
//        FileManager file = new FileManager("/Assets/Bookings.txt");
//        ArrayList<String[]> bookings = file.saveTo2DArrayList();
//        int count = 0;
//
//        for(String[] data : bookings){
//            count++;
//        }
//        count++;
//        return count;
//    }
    
    public String searchForLatestBookingID(){
        FileManager file = new FileManager("/Assets/Bookings.txt");
        ArrayList<String> BData = file.readFile();
        int newNo=0;
        if(BData.size() ==0){
            newNo=1;
        }
        else{
            String lastRow = BData.get( BData.size()-1);
            String[] data = lastRow.trim().split("\\|");
            String lastBID = data[0];
            newNo = Integer.parseInt(lastBID.substring(2))+1;
        }
        String newBID = "BO" + String.format("%03d", newNo);
        return newBID;
    }
    
    public void createBookings(){
        String bookingID = searchForLatestBookingID();
        String[] bookingDetails = { bookingID, inChargePassengerID, instance.trainScheduleNumber, seatsSelectedLabel
        };
        
        FileManager fileManager = new FileManager("src/Assets/Bookings.txt");
        fileManager.addToFile(bookingDetails);
    
    }
}
