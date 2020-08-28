public class if_else {
    public static void main(String[] args) {
        int firstNo = 13;
        int secondNo = 100;

        boolean warun = firstNo < secondNo;
        System.out.println(firstNo + " < " + secondNo);

        if (warun) {
            System.out.println("normalne");
        } else {
            System.out.println("dziwne");
        }
    }
}
