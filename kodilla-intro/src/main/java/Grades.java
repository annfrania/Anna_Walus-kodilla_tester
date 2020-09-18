public class Grades {
    private int[] grades; //obiekty??
    private int size;

    public Grades() { //konstruktor
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int returngrade() {
        int x = this.grades[this.size - 1 ];
        System.out.println(grades [this.size - 1 ]);
        return x;
        }
    public double average (){
        double result = 0;
        for (int i = 0; i < this.size; i++) {
            result = result + grades[i];
        }
        return result/this.size;// a to można tak??
        }
}
