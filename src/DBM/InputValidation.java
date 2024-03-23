package DBM;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Arrays;

public class InputValidation {
    public static boolean isValidTrainNo(String trainNo){
        String pattern = "T\\d{3}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(trainNo);
        return matcher.matches();
    }
    
    public static boolean isValidTime(String time){
        String pattern = "([01]?[0-9]|2[0-3])[0-5][0-9]";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(time);
        return matcher.matches();
    }
    
    public static boolean TimeCompare(String startTime, String endTime){
        int startTimeMin = convertToMinutes(startTime);
        int endTimeMin = convertToMinutes(endTime);
        return startTimeMin < endTimeMin;
    }
    
    private static int convertToMinutes(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(2));
        return hours * 60 + minutes;
    }
    
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String format03 = "^03\\d{8}$";
        String format01 = "^01\\d{8}$";
        return phoneNumber.matches(format03) || phoneNumber.matches(format01);
    }
}

