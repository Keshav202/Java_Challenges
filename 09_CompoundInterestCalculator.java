import java.util.Scanner;

class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter P (Principle) : ");
        double P = scanner.nextDouble();

        System.out.print("Please Enter R (Rate of Interest) : ");
        double R = scanner.nextDouble();

        System.out.print("Please Enter T (Time) : ");
        double T = scanner.nextDouble();

        double C_I = P * ( 1 + R / 100) * T;

        System.out.println("Compound Interest is : " + C_I);

    }
}
