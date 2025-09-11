import java.util.Scanner;
public class Return {
    public static void main(String[] args) {
        int first = SumOfTwoNums();
        int second = SumOfTwoNums();

        int sum = first + second;
        System.out.print("Sum of These Numbers are : " + sum);
    }

    public static int SumOfTwoNums(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scanner.nextInt();
        return num;
    }
}
