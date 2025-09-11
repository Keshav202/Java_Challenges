import java.util.Scanner;
class SumOf2Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the Second Number : ");
        int seconfNumber = scanner.nextInt();

        int sum = firstNumber + seconfNumber;

        System.out.println("The sum of " + firstNumber + " and " + seconfNumber + " is " + sum );
    }
}
