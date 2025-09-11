import java.util.Scanner;
class FactorialCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fact = Factorial(scanner);

        System.out.println("Here is the Factorial value for given number : " + fact);

    }

    public static int Factorial(Scanner scanner){
        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();
        int fact = 1;

        for (int i=1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
}
