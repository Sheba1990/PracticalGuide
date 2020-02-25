import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStr {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        // there is an object of class InputStreamReader
        // System.in - object of class InputStreamReader waits for the stream to be inputted

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // parameter is a stream which was inputted

        // this is the block "try-catch" which works with exceptions
        try {// we will try to execute the method below
            System.out.println(
                    "Enter your name and press <Enter>: "
            );
            String name = bufferedReader.readLine();
            // method readLine reads inputted stream

            System.out.println("Hello, " + name);
        } catch (IOException e) {// if the method hasn't executed we catch exception
            System.out.println("input error" + e);
        }
    }
}
