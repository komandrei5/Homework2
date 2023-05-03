package task_02;

public class AverageCalculator {
    public static void main(String[] args) {
        double sum = 0;
        double average;
        int count = 1;
        System.out.println("input array size : " + args.length);
        for (String str : args) {
            System.out.println(count++ + "- num is " + str);
            double num1 = Double.parseDouble(str);
            sum +=num1;
        }
        average = sum / args.length;
        System.out.println("-------------------------------------");
        System.out.println("result : " + average);

    }
}
