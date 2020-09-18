import java.util.Scanner;

public class Colours {
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter:");
        String myColour = scanner.nextLine();
        return myColour;
    }
}