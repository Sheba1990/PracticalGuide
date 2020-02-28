package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//#8
public class ConsoleStringToInt {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // buffering of the inputted stream

        String masStr[] = new String[3];
        // this is massive of String variables, it consists of 3 elements

        int masInt[] = new int[3];
        // this is massive of Integer variables, it consists of 3 elements

        try {
            System.out.println("Enter 3 integers, ");
            System.out.println("press Enter after each one ->");
            for (int i = 0; i < 3; i++) {
                //cycle which works until it reaches less than 3

                masStr[i] = bufferedReader.readLine();
                //on each cycle it reads inputted stream

                masInt[i] = Integer.valueOf(masStr[i]).intValue();
                // converts inputted strings from the stream to the Integer value

            }
            System.out.print("massive: ");// prints out all in console in one row

            for (int i = 0; i < 3; i++) {
                //cycle which works until it reaches less than 3

                System.out.print(masInt[i] + ", ");
                //on each cycle it prints out integer variables in console
            }
        } catch (IOException e) {
            System.out.println("input error " + e);
        } catch (NumberFormatException e) {
            System.out.println("wrong format of number " + e);
        }
    }
}
