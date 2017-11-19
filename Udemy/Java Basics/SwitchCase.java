package Challenges;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        System.out.println("Switch Case Challenge! Enter a character to begin from 'A', 'B', 'C', 'D', 'E'");

        Scanner inp = new Scanner(System.in);
        String inpText = inp.next().toUpperCase();

        char inpChar = inpText.charAt(0);

        switch (inpChar) {
            case 'A':
                System.out.println("Inside A");
                break;

            case 'B':
                System.out.println("Inside B");
                break;

            case 'C':
                System.out.println("Inside C");
                break;

            case 'D':
                System.out.println("Inside D");
                break;

            case 'E':
                System.out.println("Inside E");
                break;

            default:
                System.out.println("No Match");
        }
    }
}
