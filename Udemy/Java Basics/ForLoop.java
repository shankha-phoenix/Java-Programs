package Challenges;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("For Loop Challenge!");

        /* Interest calculation challenge */
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the time period for interest calculation");

        int time = inp.nextInt();
        int principal = 10000;

        for (int i = 2; i < 8; i++) {
            int interest = calculateInterest(principal, i, time);
            System.out.println("Interest for time period " +time +" and rate " +i +" is : "+interest);
        }

        /* Prime calculation challenge */
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter the number to identify if it is prime or not");

        int num = inputNum.nextInt();

        int primeCount = 0;
        boolean isPrime = isPrime(num);

        if(isPrime)
            System.out.println("Input number is prime!");
        else
            System.out.println("Input number is not prime");

    }

    private static int calculateInterest(int principal, int i, int time) {
        return (principal*i*time)/100;
    }

    private static boolean isPrime(int num) {
        int count = 0;
        for (int j = 1; j <= num; j++) {
            if(num % j == 0)
                count ++;
        }
        boolean flag = (count == 2 ? true : false);
        return flag;
    }


}
