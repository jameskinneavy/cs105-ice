package edu.sbcc.cs105;

import java.util.Random;

import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Ex03 {
   
    void run(){

        // 1. U.S. fighter pilot must be no more than 77 inches standing
        int heightInInches = 76;
        boolean canBeFighterPilot = heightInInches <= 77;
        System.out.printf("Can be fighter pilot = %b%n", canBeFighterPilot);

        // 2. To be eligible to purchase an alcoholic beverage, you must be at least 21
        int age = 20;
        boolean canPurchaseAlcohol = age >= 21;
        System.out.printf("Can buy alcohol = %b%n", canPurchaseAlcohol);
        
        // 3.	If you earn more than 82,500 then you your tax rate will be 24% (don’t worry about the next higher tax bracket)
        int income = 83000;        
        double taxRate = .18;
        if (income > 82500){
            taxRate = .24;
        }
        System.out.printf("Tax rate = %.2f%%%n", taxRate);

        // 4.  You are not eligible to vote if you are less than 18 years of age
        boolean notEligbleToVote = age < 18;
        // -- Alternatively
        boolean eligibleToVote = age >= 18;
        System.out.printf("Is eligible to vote = %b%n", eligibleToVote);
        
        // 5.	You can apply for graduation if you have met the degree requirements
        boolean meetsDegreeRequirements = true;
        boolean canGraduate = meetsDegreeRequirements; // == true;
        System.out.printf("Can graduate = %b%n", canGraduate);
        
        // 6.	A resource cannot be found if the HTTP response code is 404  
        int statusCode = 200;
        boolean resourceNotFound = statusCode == 404;
        boolean resourceFound = statusCode != 404;

        System.out.printf("Resource found = %b%n", resourceFound);
        
    }

    
}
