/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import DBM.FileManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;



/**
 *
 * @author jingwen
 */
public class User {
    private String userName;
    private String userPassword;
    private String emailAddress;
    private String role;
    private String firstName;
    private String lastName;
    
    

    public User() {
        
    }
    
    public String getUsername(){
        return this.userName;
    }
    
    public String getUserPassword(){
        return this.userPassword;
    }
    
    public boolean validateLogin(InputStream inputStream, String targetUsername, String targetPassword) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line by commas
            String[] parts = line.split(",");
            if (parts.length == 6 && parts[0].equals(targetUsername) && parts[1].equals(targetPassword)) {
                // If the username and password match the target username and password, return true
                this.userName = parts[0];
                this.userPassword = parts[1];
                this.emailAddress = parts[2];
                this.role = parts[3];
                this.firstName = parts[4];
                this.lastName = parts[5];
                return true;
            }
        }
    } 
    catch (IOException e) {
        e.printStackTrace(); // Handle or log the exception
    }
    return false; // If no match found or an exception occurs, return false
    }
    
//    public static String[] loginAccess(String loginUserID,String loginPassword){
//        FileManager file = new FileManager("User.txt");
//        ArrayList<String> userData = file.readFile();
//        String[] savedData = new String[7];
//        int count = 0; 
//
//        for(int i=0 ; i< userData.size();i++){
//            String line = userData.get(i);
//            String[] data = line.split("\|");
//
//            if (loginUserID.equals(data[0]) && loginPassword.equals(data[1])){
//                savedData = data;
//                count++;
//            }
//        }
//
//        if (count == 0){
//            savedData[5] = "fail";
//            return savedData;
//        }
//        else if (count == 1){
//            return savedData;
//        }
//        else{
//            savedData[5] = "fail";
//            return savedData;
//        }
//    }
    
    public String getUserRole(){
        return this.role;
    }
}
