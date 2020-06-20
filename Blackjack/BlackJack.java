package Blackjack;

import java.util.Random;
import java.util.Scanner;

public class BlackJack
{
    public static void main(String[] args)
    {
        //VARIABLES
        int input = 0;
        int gameNum = 1;
        int myCard;
        int myHand = 0;
        int numOfWon = 0;
        int numOfLost = 0;
        int numOfTie = 0;
        boolean currentGame = true;
//boolean flag = false;
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        //PROGRAM CODE
        do
        {
            if(currentGame)
            {
                System.out.println("START GAME #" + gameNum + "\n");
            }
            myCard = r.nextInt(12) + 1;
            if(myCard == 1)
            {
                System.out.println("Your card is an ACE!");
            }
            else if(myCard == 11)
            {
                System.out.println("Your card is a JACK!");
                myCard = 10;
            }
            else if(myCard == 12)
            {
                System.out.println("Your card is a QUEEN!");
                myCard = 10;
            }
            else if(myCard == 13)
            {
                System.out.println("Your card is a KING!");
                myCard = 10;
            }
            else
            {
                System.out.println("Your card is a " + myCard + "!");
            }
            myHand = myHand + myCard;
            System.out.println("Your hand is: " + myHand + "\n");
            System.out.println("1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit\n");
            if(myHand == 21)
            {
                System.out.println("BLACJACK! You win!\n");
                numOfWon++;
                myHand = 0;
                gameNum++;
                currentGame = true;
                input = 0;
            }
            else if(myHand > 21)
            {
                System.out.println("You exceeded 21! You lose :(\n");
                numOfLost++;
                myHand = 0;
                gameNum++;
                currentGame = true;
                input = 0;
            }
            else
            {
                System.out.print("Choose an option:");
                input = scan.nextInt();
                System.out.println();
            }
            if(input == 1)
            {
                currentGame = false;
            }
            else if(input == 2)
            {
                int dealerHand = 16 + r.nextInt(10);
                System.out.println("Dealer's hand: " + dealerHand);
                System.out.println("Your hand is: " + myHand + "\n");
                if(dealerHand > 21 || myHand > dealerHand)
                {
                    System.out.println("You win!\n");
                    numOfWon++;
                }
                else if (myHand == dealerHand)
                {
                    System.out.println("It's a tie! No one wins!\n");
                    numOfTie++;
                }
                else
                {
                    System.out.println("Dealer wins!\n");
                    numOfLost++;
                }
                myHand = 0;
                gameNum++;
                currentGame = true;
            }
            else if(input == 3)
            {
                System.out.println("Number of Player wins: " + numOfWon);
                System.out.println("Number of Dealer wins: " + numOfLost);
                System.out.println("Number of tie games: " + numOfTie);
                System.out.println("Total # of games played is: " + (gameNum - 1) );
                System.out.println("Percentage of Player wins: " + 100.0 * numOfWon / (gameNum - 1)  + " %");
            }
            else
            {
            }
        }while(input != 4);
        scan.close();
    }

}



