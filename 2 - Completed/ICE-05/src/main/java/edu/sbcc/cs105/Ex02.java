package edu.sbcc.cs105;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
   
    void run(){

        String door = chooseDoor();

        /*
        if (door.equals("red")){
            System.out.println("You get the treasure!");
        }else if (door.equals("blue")){
            System.out.println("Monster eats your brain!");
        } else {
            System.out.println("Room is empty");
        }

        */

        System.out.println();
        switch (door){
           
            case "red" :
                System.out.println("You get the treasure!");
                break;
            case "blue" :
                System.out.println("You get the treasure!");
                break;            
            default:
                System.out.println("Room is empty");
        }
        System.out.println();
    }

    private String chooseDoor() {
        
        System.out.print("Choose a door (red, blue, or blue): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

    
}
