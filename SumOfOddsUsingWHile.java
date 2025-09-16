import java.util.Scanner;
public class SumOfOddsUsingWHile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of Odd Numbers Using While Loop : ");
        int num = input.nextInt();
        int sum = func1(num);

        System.out.println("Sum of odds till Number " + num + " is " + sum);
    }
    public static int func1(int num){

        int i = 1;
        int sum = 0;

        while (i <= num ){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
