package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.logging.Logger;

public class CalculatorOfTwoNumbers {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String masStr[] = new String[2];

        Integer masInt[] = new Integer[masStr.length];

        try {
            System.out.println("Enter numbers and press <Enter> after each one: ");

            for (int i = 0; i < masStr.length; i++) {

                masStr[i] = bufferedReader.readLine();

                masInt[i] = Integer.parseInt(masStr[i]);

            }
            System.out.println("The sum of numbers: " + (masInt[0] + masInt[1]));

        } catch (IOException e) {
            System.out.println("Wrong format" + e);
        }
    }
}