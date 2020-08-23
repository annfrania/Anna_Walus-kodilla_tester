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
        System.out.println(user1.name + " " + user1.age);



        for (int i = 0; i < 5; i++ ) {
            return this.age ; //???
        }
    }
//        int result = (user1.age+user2.age+user3.age+user4.age+user5.age)/5;
//        System.out.println(result);
//
//        if (this.age < result) {
//            System.out.println(UserUser.name);
//        } else {
//                return;
//            }
//        }
//
//        for (int i = 0 ; i <= 4 ; i ++ ) {
//
//        System.out.println(UserUser.name[i]);
        }


}
