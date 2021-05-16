package akademia.pesel;

import java.util.Scanner;

public class Pesel {


    public static boolean check(String pesel) {
        //zakładamy tablice z wagami
        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

        //sprawdzamy długość
        if (pesel.length() != 11) {
            return false;
        }
        //zakładamy zmienną będącą sumą kontrolną
        int suma = 0;

        //liczymy w petli sumę kontrolną przemnażając odpowiednie cyfry pesel przez wagi
        for (int i = 0; i < 10 ; i++) {
            suma += Integer.parseInt(pesel.substring(i, i + 1)) * wagi[i];
        }
        //pobieramy do zmiennej wartosc ostatnie cyfry peselu
        int cyfraKontrolna = Integer.parseInt(pesel.substring(10,11));

        //obliczamy cyfrę kontrolną
        suma %= 10;
        suma = 10 - suma;
        suma %= 10;

        return suma == cyfraKontrolna;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj nr pesel: ");
        String pesel = sc.nextLine();
        boolean result = check(pesel);
        if(result) {
            System.out.println("Podałeś poprawny pesel.");
        } else {
            System.err.println("Niepoprawny pesel.");
        }
    }
}
