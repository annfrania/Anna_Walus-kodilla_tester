public class Notebook {
    String weight; //atrybuty klasy
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        }
        else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        }
        else {
            System.out.println("This notebook is quite expensive.");
        }
    }
    public void checkWeight() {
        boolean islight = this.weight == "600g";
        boolean isheavy = this.weight == "2000g";
        if (islight) {
            System.out.println("This notebook is light.");
        }
        else if (isheavy) {
            System.out.println("This notebook is heavy.");
        }
        else {
            System.out.println("This notebook is quite heavy.");
        }
    }
    public void worthtobuy() {
        boolean price = this.price < 1500;
        boolean year = this.year > 2016;
        if (price && year) {
            System.out.println("This notebook is worth to buy.");
        }
        else if (price || year ) {
            System.out.println("This notebook is quite worth to buy.");
        }
        else {
            System.out.println("This notebook is not worth to buy.");
        }
    }
}
