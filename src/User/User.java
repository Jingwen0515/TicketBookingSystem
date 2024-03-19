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
    
    public static String[] validateLogin(String targetUsername,String targetPassword){
        FileManager file = new FileManager("/Assets/userdata.txt");
        ArrayList<String[]> userData = file.saveTo2DArrayList();
        String[] savedData = new String[8];
        boolean isFound = false;

        for(String[] data : userData){
            if(targetUsername.equals(data[1]) && targetPassword.equals(data[2])){
                savedData = data;
                isFound = true;
                break;
            }
        }

        if(!isFound){
            savedData[4]="Not Found";
        }
        return savedData;
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
