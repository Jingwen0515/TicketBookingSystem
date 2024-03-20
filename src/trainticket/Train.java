/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainticket;

import DBM.FileManager;
import User.Admin;
import User.Passenger;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import trainticket.TicketBooking.Booking;

/**
 *
 * @author jingwen
 */
public class Train {
    private String trainScheduleNumber;
    private String trainNumber;
    private String departureLocation;
    private String arrivalLocation;
    private String departureTime;
    private String arrivalTime;
//    private Passenger current_passenger;

    //Constructor for Admin
    public Train(String trainScheduleNumber, String trainNumber, String departureLocation, String arrivalLocation,
    String departureTime, String arrivalTime){
        this.trainScheduleNumber = trainScheduleNumber;
        this.trainNumber = trainNumber;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
    
    //Constructor for Passenger
    public Train(String[] savedData){
//        String [] savedData = searchForRespectiveTrain(trainScheduleNumber);
        this.trainScheduleNumber = savedData[0];
        this.trainNumber = savedData[1];
        this.departureLocation = savedData[2];
        this.arrivalLocation = savedData[3];
        this.departureTime = savedData[4];
        this.arrivalTime = savedData[5];     
//        this.current_passenger = currentPassenger;
//        Booking newBooking = new Booking(this, currentPassenger);
        
    }
    
    public String getTrainScheduleNumber(){
        return this.trainScheduleNumber;
    }
    
    public static String[] searchForRespectiveTrain(String trainScheduleNumber){
       FileManager file = new FileManager("/Assets/trainschedules.txt");
        ArrayList<String[]> allTrainSchedule = file.saveTo2DArrayList();
        String[] savedData = new String[6];
        boolean isFound = false;

        for(String[] data : allTrainSchedule){
            if(trainScheduleNumber.equals(data[0])){
                savedData = data;
                isFound = true;
                break;
            }
        }

        if(!isFound){
            savedData[3]="Not Found";
        }
        return savedData;
    }
}

