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
String bigFruit = fruits[4];
    System.out.println(bigFruit);

    int numberOfElements = fruits.length;
    System.out.println("Moja tablica zawiera "+numberOfElements+" elementów.");
   for (int i = 0; i < 5; i++) {
       System.out.println(fruits[i]);
   }
       for (int i = fruits.length - 1; i >= 0; i--) {
           System.out.println(fruits[i]);
       }
    }
}
