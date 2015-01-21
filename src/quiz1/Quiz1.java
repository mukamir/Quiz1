package quiz1;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in); 
        System.out.println ("Enter your username");
              
        String username, password;
        username = keyboard.next ();        
        
        System.out.println ("Enter your password");
        password = keyboard.next();
                
        System.out.println("Hello " + username + ", Welcome to CSC200 class! and Your password is " + password);

        
    }
    
}
