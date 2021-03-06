public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g",1100,2017);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.worthtobuy();

        Notebook heavynotebook = new Notebook("2000g",1500,2015);
        System.out.print(heavynotebook.weight + " " + heavynotebook.price+ " " + heavynotebook.year);
        heavynotebook.checkPrice();
        heavynotebook.checkWeight();
        heavynotebook.worthtobuy();

        Notebook oldnotebook = new Notebook("1200g",500,2008);
        System.out.print(oldnotebook.weight + " " + oldnotebook.price + " " + oldnotebook.year);
        oldnotebook.checkPrice();
        oldnotebook.checkWeight();
        oldnotebook.worthtobuy();

    }
}