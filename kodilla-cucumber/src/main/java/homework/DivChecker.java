package homework;

public class DivChecker {

    public String checkIfDivisible(Integer number) {
        Boolean divByThree = number % 3 == 0;
        Boolean divByFive = number % 5 == 0;
        if (divByThree && divByFive)
            return "FizzBuzz";
        else if (divByFive)
            return "Buzz";
        else if (divByThree)
            return "Fizz";
        return "None";
    }

}
