public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g",1000);
        System.out.print(notebook.weight);
        System.out.print(notebook.price);

        Notebook heavynotebook = new Notebook("2000g",1500);
        System.out.print(heavynotebook.weight);
        System.out.print(notebook.price);

        Notebook oldnotebook = new Notebook("1200g",700);
        System.out.print(oldnotebook.weight);
        System.out.print(notebook.price);

        System.out.println(notebook.weight + notebook.price);
        System.out.println(notebook.weight + " " + notebook.price);

        boolean ischeap = (notebook.price <900);
        if (ischeap) {
            System.out.println("This notebook is cheap.");
        }
        else {
            System.out.println("This notebook is quite expensive.");

        }
    }
}