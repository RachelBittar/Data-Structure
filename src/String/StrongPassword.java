package String;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

	
    static int minimumNumber(int n, String password) {
      
    	// Return the minimum number of characters to make the password strong
        int validCount = 4;
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_character = "!@#$%^&*()-+";
        
        boolean hasNumber = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;
        
        for (char c : password.toCharArray()) {
            if (numbers.indexOf(c) != -1 && hasNumber == false) {
                hasNumber = true;
                validCount--;
            }
            else if (lower_case.indexOf(c) != -1 && hasLowerCase == false) {
                hasLowerCase = true;
                validCount--;
            }
            else if (upper_case.indexOf(c) != -1 && hasUpperCase == false) {
                hasUpperCase = true;
                validCount--;
            }
            else if (special_character.indexOf(c) != -1 && hasSpecialChar == false) {
                hasSpecialChar = true;
                validCount--;
            }
        }
        
        return Math.max(6-password.length(), validCount);
    
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        //bufferedWriter.write(String.valueOf(answer));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
