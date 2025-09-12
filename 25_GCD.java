import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gcd =findGCD(input);
        System.out.println("GCD (Greatest Common Divisor ) = " + gcd);
    }
    public static int findGCD(Scanner input){
        System.out.print("First Number = ");
        int a = input.nextInt();

        System.out.print("Second Number = ");
        int b = input.nextInt();

        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
