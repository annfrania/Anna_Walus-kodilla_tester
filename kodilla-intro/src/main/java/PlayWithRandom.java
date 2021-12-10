import java.util.Random;

public class PlayWithRandom {

    public static void main(String[] args) {
        getCountOfRandomNumber(40);
    }

    private static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int numberOfDraws = 0;
        int sum = 0;
        while (max - sum >= 9) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            System.out.println("temp " + numberOfDraws + " = " + temp);
            System.out.println("sum " + numberOfDraws + " = " + sum);
            numberOfDraws ++;
        }
        System.out.println("Number of draws is " + numberOfDraws);
        return numberOfDraws;
    }
}
