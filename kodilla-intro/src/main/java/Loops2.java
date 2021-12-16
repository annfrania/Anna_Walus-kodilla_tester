public class Loops2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

}
//        public int sumNumbers(int[] numbers) {
//        int result = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            result = result + numbers[i];
//        }
//        return result;
//    }
//

//    public int sumUp (int[] numberss) {
//        int[] numbers = new int[]{5,10,21};
//        int number1 = numbers[0];
//        int number2 = numbers[1];
//        int number3 = numbers[2];
//
//        int result = number1 + number2 + number3;
//
//        return result;
//    }

