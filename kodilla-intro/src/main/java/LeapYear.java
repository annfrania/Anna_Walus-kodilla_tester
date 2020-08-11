public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Czy ten rok jest przestępny?");
        int rok = 2013;
        System.out.println(rok);
        if (rok%4 ==0 && rok%100 != 0){
            System.out.println("Tak, jest!");
        }
        else {System.out.println("Ojej, nie jest.");}
    }
}