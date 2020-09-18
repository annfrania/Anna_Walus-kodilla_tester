public class MyCourseClass {
    enum KodillaCourse {
        JD,  /* Java Developer */
        JDP, /* Java Developer Plus */
        TA,  /* Tester Automatyzujący */
        TAI  /* Tester Automatyzujący z egzaminem ISTQB */
    }
    public static void main(String[] args) {
        KodillaCourse myCourse = KodillaCourse.TA;

switch(myCourse) {
    case TA:
        System.out.println("Tester Automat.");
        break;
}
    }
}
