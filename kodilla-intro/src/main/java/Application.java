public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) { //konstruktor
        this.name = name;
        this.age = age;
    }
    public void checkAgeAndHeight() {
        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        }
        else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }
}
