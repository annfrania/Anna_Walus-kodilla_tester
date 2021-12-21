public class Types {
    public static void main(String[] args) {
        System.out.println('a'+ 'B');
        System.out.println("Wynik to " + (1 + 2 + 3));
        System.out.println(1 + 2 + 3 + " to wynik ");

        String hello = "Witaj ";
        String world = "Świecie!";
        String powitanie = hello + world; //łączenie dwóch napisów
        System.out.println(powitanie);

        String czesc = powitanie.substring(0, 6) + "uczniu";
        System.out.println(czesc);

        int licznik = 20;

        do{
            System.out.println("To jest petla" + licznik);
            licznik++;
        }
        while(licznik<10);
        System.out.println("Koniec pętli");
    }
}
