import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        printFibonacci(input);
    }

    public static void printFibonacci(Scanner input) {
        System.out.print("Enter how many terms you want: ");
        int n = input.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");   // print current term
            int next = first + second;      // calculate next term
            first = second;                 // move forward
            second = next;
        }
        System.out.println();
    }
}
