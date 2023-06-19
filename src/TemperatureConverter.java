import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Celsius = 0.0;
        double Fahrenheit = 0.0;
        String trash = ""; // use for bad input (string instead of double)
        boolean done = false;
        do {
            System.out.println("Enter the temperature in Celsius: ");
            if(in.hasNextDouble()) {
                Celsius = in.nextDouble();// Ok to read in double
                in.nextLine();//clear the newline from the buffer
                done = true; // we got a valid Celsius input, we end the loop
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter a valid temperature in Celsius!");
            }}
        while (!done);//  !done is not false, which is true, we loop until is set to True by the test above
        Fahrenheit = (Celsius * 9 / 5) + 32;
        System.out.println("Equivalent temperature in Fahrenheit is: " + Fahrenheit);
    }
}