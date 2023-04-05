package practice.javaBasics.Factorizer;

import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int perfectNumber = 0;
        System.out.print("What number would you like to factor? ");
        //User Input
        int userInput = input.nextInt();

        System.out.println("The factors of "+ userInput + " are:");
        // Loop : to go through the number
        for(int i = 1; i < userInput; i++){
            // IF statement to go through numbers
            if((userInput%i) == 0) {
                System.out.print(i + " ");
                count++;
                perfectNumber = perfectNumber + i;
            }

        }
        System.out.print(userInput);
        System.out.println();
        System.out.println(userInput + " has "+ (count+1) + " factors.");
        // Check the perfect number
        if(perfectNumber == userInput)
            System.out.println(userInput + " is a perfect number");
        else
            System.out.println(userInput + " is not a perfect number");
        // Check the prime number
        if((count+1) == 2)
            System.out.println(userInput + " is a prime number");
        else
            System.out.println(userInput + " is not a prime number");
    }
}

// GOLDY ^_^