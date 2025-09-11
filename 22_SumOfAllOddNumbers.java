import java.util.Scanner;
class SumOfAllOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = sumOfOdds(input);
        System.out.println("Sum of Odd Numbers = " + sum);

    }

    public static int sumOfOdds (Scanner input){

        System.out.println("Enter the limit : ");
        int num = input.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
}
