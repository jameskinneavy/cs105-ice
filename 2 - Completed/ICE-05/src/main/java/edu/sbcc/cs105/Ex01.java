package edu.sbcc.cs105;

import java.util.Random;

public class Ex01 {
   
    void run(){

        int lotteryTicket = buyLotteryTicket();
        int winner = checkDrawingResults();

        System.out.printf("Your pick is %d. Winner is %d%n", lotteryTicket, winner);
        if (lotteryTicket == winner){
            System.out.println("Winner!");
        } else{
            System.out.println("Try again");
        }
    }

    private int checkDrawingResults() {
        return (new Random()).nextInt(10) + 1;
    }

    private int buyLotteryTicket() {
       
        return (new Random()).nextInt(10) + 1;
    }
}
