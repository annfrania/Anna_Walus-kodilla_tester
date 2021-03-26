import java.util.Random;

public class RandomNumbers {

    public static int getNumbers(){

        int min = 15;
        int max = 16;
        int sum = 0;

        while(sum <= 5000){
            Random random = new Random();
            int value = random.nextInt(31);
            if(value < min)
                min = value;
            if(value > max)
                max = value;
            sum = sum + value;
        }
        System.out.println("The minimum number was: " + min);
        System.out.println("The maximum number was: " + max);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getNumbers());
    }

}
