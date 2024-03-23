/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User.admin;

import DBM.FileManager;
import User.User;
import java.util.ArrayList;

/**
 *
 * @author jingwen
 */
public class Admin extends User{
    private String adminID;
    private String trainSCID;
    
    //Constructor to add new schedule to database
    public Admin(String trainNumber, String departureTime, String arrivalTime,
        String departureLocation, String arrivalLocation){
        this.trainSCID = searchForLatestTrainScheduleID();
        FileManager fileManager =new FileManager("src/Assets/trainschedules.txt");
        String[] newScheduleData = {trainSCID, trainNumber, departureTime, arrivalTime, departureLocation, arrivalLocation, "Pending"};
        fileManager.addToFile(newScheduleData);
    }
    
    //Constructor to modify data 
    public Admin(String[] newchanges){
        FileManager fileManager =new FileManager("src/Assets/trainschedules.txt");
        fileManager.editFileDataV2(newchanges[0], newchanges);
        
    }
    
    public String searchForLatestTrainScheduleID(){
        FileManager file = new FileManager("src/Assets/trainschedules.txt");
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
        String newBID = "TS" + String.format("%03d", newNo);
        return newBID;
    }
}
