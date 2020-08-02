package com.helloWorldApp;

import java.security.SecureRandom;

public class Craps
{
    //create secure random number generator for use in method rollDice
    private static final SecureRandom randomNubers = new SecureRandom();

    //enum type with constants that reprsent the game status
    private enum Status {CONTINUE, WON, LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args)
    {
        int myPoint = 0; //point if no win or lost on first roll
        Status gameStatus;  //can contain CONTINUE, WON or LOST

        int sumOfDice = rollDice(); //first roll of the dice

        switch (sumOfDice)
        {
            case SEVEN: //win with 7 on first roll
            case YO_LEVEN: //win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: //LOSE with 2 on first roll
            case TREY: //lose with 3 on first roll
            case BOX_CARS: //lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: //did not win or lose, so remember point
                gameStatus = Status.CONTINUE;  //game is not over
                myPoint = sumOfDice; //remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;


        }
        //whhile game is not complete
        while (gameStatus == Status.CONTINUE) //not won or lost
        {
            sumOfDice = rollDice(); //roll dice again

            //determine game status
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        }
        // Display won or lost message
        if (gameStatus == Status.WON)
        System.out.println("Player wins");
        else  System.out.println("Player loses");
    }
    //roll dice calculate sum and display result
    public static int rollDice()
    {
        int die1 = 1 + randomNubers.nextInt(6); //first dice roll
        int die2 = 1 + randomNubers.nextInt(6); //second dice roll

        int sum = die1 + die2;

        //display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}
