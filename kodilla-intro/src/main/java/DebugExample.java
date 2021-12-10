public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        boolean ifFirstNumber = firstNumber < 20;
        if (ifFirstNumber) {
            subtractAndDisplay(10, 15);
        } else {
            sumAndDisplay(8,12);
        }
    }
    private static void sumAndDisplay(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }

    private static void subtractAndDisplay(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }
}
