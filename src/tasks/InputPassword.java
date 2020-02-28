package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputPassword {
    public static void main(String[] args) {

        String password = "nikitashebin1990";

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.println("Enter your password and press <Enter>: ");

            String inputtedPassword = bufferedReader.readLine();

            if (inputtedPassword.equals(password)) {
                System.out.println("Password correct");
            } else {
                System.out.println("Wrong password");
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
