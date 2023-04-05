package practice.javaBasics.InterestCalculaor;
import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How much do you want to invest? ");
        float amount = input.nextInt();
        System.out.print("How many years are investing? ");
        int years = input.nextInt();
        System.out.print("What is the annual interest rate % growth? ");
        float annualInterestRate = input.nextInt();
        float quaterlyInterestRate = annualInterestRate/4;

        System.out.println("\nCalculating...");
        float totalForTheYear = amount;
        float earned;
        //loop for the total number of years
        for(int i = 1; i<= years; i++){
            //loop to calculate the interest
            for( int j = 0; j < 4; j++)
                totalForTheYear = (totalForTheYear*(1+(quaterlyInterestRate/100)));

            earned = (totalForTheYear-amount);
            System.out.printf("Year %d:\n",i);
            System.out.printf("Begin with $%.2f\n",amount);
            System.out.printf("Earned $%.2f\n",earned);
            System.out.printf("Ended with $%.2f\n\n",totalForTheYear);
            amount = totalForTheYear;
        }

    }
}

