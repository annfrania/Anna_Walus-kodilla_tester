public class UserUser {
    String name; //atrybuty klasy
    int age;

    public UserUser(String name, int age) { //konstruktor
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        UserUser user1 = new UserUser("Alex", 25);
        UserUser user2 = new UserUser("Chris", 18);
        UserUser user3 = new UserUser("Julia", 37);
        UserUser user4 = new UserUser("Monica", 20);
        UserUser user5 = new UserUser("Ben", 40);
        UserUser[] users = {user1, user2, user3, user4, user5};

        int sumAge = 0;

        for (int i = 0; i < users.length; i++) {
            UserUser u = users[i];
            sumAge = sumAge + u.age;
        }
        double averageAge = sumAge / users.length; //w którym miejscu tą średnią??

        for (int i = 0; i < users.length; i++) {
            UserUser u = users[i];
            if (u.age < averageAge) {
                System.out.println(u.name);
            }
        }
    }
}
