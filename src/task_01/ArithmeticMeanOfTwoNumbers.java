package task_01;

public class ArithmeticMeanOfTwoNumbers {

    public static void main(String[] args) {

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double average = (num1 + num2) / 2;
        System.out.println("The average of " + num1 + " to add " + num2
                                     + " is " +average);
    }
}
