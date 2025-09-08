import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//      In this challenge we take PRT as an input from the user. Where : P = Principle, R = Rate of interest and T = Time

        System.out.print("Please Enter the Principle((the initial amount of money borrowed or invested) : ");
        double P = scanner.nextDouble();

        System.out.print("Please Enter the Rate of Interest : ");
        double R = scanner.nextDouble();

        System.out.print("Please Enter the Time : ");
        double T = scanner.nextDouble();

        double SI = (P * T * R)/100;

        System.out.print("The SI (Simple Innterest) is : " + SI);


    }
}
