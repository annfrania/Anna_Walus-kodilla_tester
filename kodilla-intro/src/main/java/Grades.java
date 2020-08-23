public class Grades {
    private int[] grades; //obiekty??
    private int size;
    private int values; // trzeba było dopisać?

    public Grades() { //konstruktor
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10){
            return;
        }
        this.values[this.size] = value;
        this.size++;
    }
    public void returngrade(int value) {
        String grade = grades [this.size--];
        return (this.size--);
        System.out.println(grades [this.size--]);
        }

    public void average (int value){
        String grade = grades [this.size,this.size--];
        // jak zrobić dodawanie i dzielenie?
        for (int grades = this.size; this size = 0; this.size--) {
            int result = this.grades [this.size] + this.grades [this.size--] / this.size;
            System.out.println(result);
        }
    }
}
