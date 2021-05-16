package akademia.warunki_aplikacje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kliencie, podaj swój wiek: ");
        int wiek = scanner.nextInt();
        System.out.println("Przyjąłęm, że twój wiek to:" + wiek);
        if(wiek >= 18){
            System.out.println("Możesz kupić wódeczkę!");
        }else {
            System.out.println("Nie możesz kupić alko!");
        }
        System.out.println("Następny!");
    }
}
