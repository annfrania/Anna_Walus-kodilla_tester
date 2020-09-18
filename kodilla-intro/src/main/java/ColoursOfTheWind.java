import java.util.Scanner;
public class ColoursOfTheWind {
    public enum KodillaCourse {
        B,
        R,
        P,
        G
    }
    public String selection() {
        String myColour = Colours.getLetter();

//    public static String () {
//        KodillaCourse myColour = KodillaCourse.B;

        switch (myColour) {
            case B:
                System.out.println("blue");
                break;
            case R:
                System.out.println("red");
                break;
            case P:
                System.out.println("pink");
                break;
            case G:
                System.out.println("green");
                break;
            default:
                System.out.println("No other colours.Try again.");
        }
    }

}



