package cryptography;
//import java.io.*;
import java.util.*;
import java.security.MessageDigest;



public class SHA256 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        String message = in.nextLine();

        try 
        {
            MessageDigest messageDigest 
                = MessageDigest.getInstance("SHA-256");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) 
            {
                System.out.printf("%02x", b);
            }
        } 
        catch (Exception e) {
        	
        }

	}

}
