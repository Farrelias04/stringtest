import java.util.Scanner;

public class StringTest
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);

        // For user's input @ to type
        System.out.println("Enter a string:");
        String s = inputDevice.nextLine();

        // convert String s into lower and upper case
        String lower = s.toLowerCase();
        String upper = s.toUpperCase();

        System.out.println(lower);
        System.out.println(upper);

        // number of the characters, which includes spaces in between
        int n = s.length();

        System.out.println(n);
    }
}