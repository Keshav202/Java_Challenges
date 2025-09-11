import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        int sum = Sum(num);
        System.out.println("Sum of Digits = " + sum);
    }

    public static int Sum(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;

    }

}
