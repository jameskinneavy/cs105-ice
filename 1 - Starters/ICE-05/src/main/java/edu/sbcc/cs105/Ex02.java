package edu.sbcc.cs105;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
   
    void run(){

        String door = chooseDoor();

       // TODO: Put your parallel if here

        System.out.println();
        
        // TODO: Put your switch statement here
        
        System.out.println();
    }

    private String chooseDoor() {
        
        System.out.print("Choose a door (red, blue, or blue): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

    
}
