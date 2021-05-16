package akademia.operatory;

public class Main {
    public static void main(String[] args) {

        int result = 8745 + 9862;
        System.out.println(result);

        int finalResult = result + 2167;
        System.out.println(finalResult);

        long longNumber = 327873625637L;
        System.out.println(longNumber);

        //operatory przypisania: = += -= *= /= %=

        int number1 = 10;
        number1 += 5;
        System.out.println(number1);

        //bonus: ++ --
        int number2 = number1++;
        System.out.println(number2);

        // operatory porównania: == != < > <= >=

        //operatory logiczne: && || !
    }
}
