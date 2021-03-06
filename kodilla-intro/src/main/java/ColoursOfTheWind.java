import java.util.Scanner;
public class ColoursOfTheWind {
    public enum KodillaCourse {
        B,
        R,
        P,
        G
    }
    public KodillaCourse selection() {
        String myColour = Colours.getLetter();


        switch (myColour) {
            case "B":
                System.out.println("blue");
                return KodillaCourse.B;
            case "R":
                System.out.println("red");
                return KodillaCourse.R;
            case "P":
                System.out.println("pink");
                return KodillaCourse.R;
            case "G":
                System.out.println("green");
                return KodillaCourse.R;
            default:
                System.out.println("No other colours.Try again.");
                return null;
        }
    }

}



