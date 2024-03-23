package DBM;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class FileManager {

    // Constructor
    private String fileName;
    public FileManager(String fileName) {
        this.fileName = fileName;
    }
    
    public ArrayList<String[]> saveTo2DArrayList(){
        ArrayList<String[]> ArrayList2D = new ArrayList();
        ArrayList<String> datalines = this.readFile();
        for (String line:datalines){
            String[] dataArray = line.trim().split("\\|");
            ArrayList2D.add(dataArray);
        }
        return ArrayList2D;
    }
    
    public void addToFile(String[] newObject){
        try{
            FileWriter file = new FileWriter(fileName,true);
            BufferedWriter writer = new BufferedWriter(file);
            String line = String.join("|", newObject);
            writer.append(line);
            writer.append("\n");
            writer.close();     
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public ArrayList<String[]> filterData(int index,String target){
        ArrayList<String> dataLine = this.readFile();
        ArrayList<String[]> result = new ArrayList<String[]>();
        for(int i = 0; i<dataLine.size();i++){
             String[] arrayData = dataLine.get(i).split("\\|");
             if(arrayData[index].equals(target)){
                 result.add(arrayData);
             }
         }
        return result;
    }
    
    public String[] searchByPrimaryKey(String primaryKey){
        ArrayList<String> dataLine = this.readFile();
        String[] result = {};
        int count = 0;
        for(int i = 0; i<dataLine.size();i++){
            String[] arrayData = dataLine.get(i).split("\\|");
            if(arrayData[0].equals(primaryKey)){
                count++;
                result = arrayData;
            }   
        }
        if(count >1){
            JOptionPane.showMessageDialog(null, "Not a PK");
        }
        return result;
    }
    
    public void editFileDataV2(String primaryKey, String[] newData) {
        ArrayList<String[]> dataLines = this.saveTo2DArrayList();
        boolean found = false;
        
        for (int i = 0; i < dataLines.size(); i++) {
            String[] currentLine = dataLines.get(i);
            if (currentLine.length > 0 && currentLine[0].equals(primaryKey)) {
                // Check if the new data has the same length as the current line
                if (newData.length == currentLine.length) {
                    // Update the current line with the new data
                    dataLines.set(i, newData);
                    found = true;
                    break; // No need to continue looping if the primary key is found and data changed
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid data length");
                    return; // Exit method if the data length is invalid
                }
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Primary key not found");
            return; // Exit method if primary key is not found
        }

        try {
            FileWriter file = new FileWriter("src/Assets/trainschedules.txt");
            BufferedWriter writer = new BufferedWriter(file);
            
            for (String[] data : dataLines) {
                String line = String.join("|", data);
                writer.write(line + "\n");
            }
            writer.flush();
            writer.close(); // Close the writer after writing data
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
          }
    }
   
    
    public ArrayList<String> readFile() {
        ArrayList<String> object = new ArrayList<String>();
        try{
            FileReader file = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null){
                object.add(line);
            }
            reader.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return object;
    }
}