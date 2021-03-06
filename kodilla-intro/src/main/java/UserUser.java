public class UserUser {
    String name; //atrybuty klasy
    int age;
    double average;

    public UserUser(String name, int age) { //konstruktor
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return this.name + " " + this.age;
    }
    public static void main(String[] args) {
        UserUser user1 = new UserUser("Alex", 25);
        UserUser user2 = new UserUser("Chris", 18);
        UserUser user3 = new UserUser("Julia", 37);
        UserUser user4 = new UserUser("Monica", 20);
        UserUser user5 = new UserUser("Ben", 40);
        System.out.println(user1.name + " " + user1.age);

        UserUser[] users = {user1, user2, user3, user4, user5};

      double average = (age [0]+ age [1] + age [2] + age [3] + age [4] + age[5]) /users.length;

      for (int i = 0; i < users.length; i++ ) {
            UserUser u = users[i];
            if(this.age < average)
            System.out.println(u);
        }

    }

}
