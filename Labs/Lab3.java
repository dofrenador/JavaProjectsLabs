package Labs;

import java.util.*;
public class Lab3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int mpgRating;
        double tankCapacity;
        double percentageOfGas;

        System.out.print("Enter your car's MPG rating(miles/gallon) as a positive integer: ");
        mpgRating = input.nextInt();

        if(mpgRating <= 0)
        {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG.");
            return;
        }
        else
        {
            System.out.println("The MPG rating is: " + mpgRating);
        }

        System.out.print("Enter your car's tank capacity(gallons) as a positive decimal number: ");
        tankCapacity = input.nextDouble();

        if(tankCapacity <= 0)
        {
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }
        else
        {
            System.out.println("The tank capacity is: " +tankCapacity);
        }

        System.out.print("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        percentageOfGas = input.nextDouble();

        if(percentageOfGas < 0 || percentageOfGas > 100)
        {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE!!!)");
            return;
        }
        else
        {
            System.out.println("The percentage of the gas is: " +percentageOfGas);
        }

        double rawRange = mpgRating * tankCapacity *(percentageOfGas * 0.01);

        int milesLeft = (int) rawRange;

        if(rawRange <= 25)
        {
            System.out.println("Attention! Your current estimated range is running low: " + milesLeft + " miles left!!!");
            return;
        }
        else
        {
            System.out.println("Keep driving! Your current estimated range is: " + milesLeft + " miles!");
        }


    }
}


