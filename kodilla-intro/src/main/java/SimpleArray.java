public class SimpleArray {
    public static void main(String[] args) {
String[] fruits = new String [5];
fruits [0] = "banan";
fruits [1] = "jabłko";
fruits [2] = "gruszka";
fruits [3] = "porzeczka";
fruits [4] = "ananas";

String fruit = fruits[3];
    System.out.println(fruit);

    int numberOfElements = fruits.length;
    System.out.println("Moja tablica zawiera "+numberOfElements+" elementów.");
    }
}
