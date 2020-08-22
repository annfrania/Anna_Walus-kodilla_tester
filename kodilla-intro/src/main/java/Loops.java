public class Loops {
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
//
//            int[] numbers = new int[]{5, 10, 15, 20};
//            int result = 0;
//            for (int x = 0; x < numbers.length; x++) {
//                result = result + numbers[x];
//            }
//            return result;
        }

}