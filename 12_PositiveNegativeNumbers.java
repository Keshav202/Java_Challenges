import java.util.Scanner;

class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a Number : ");
        int a = input.nextInt();

        if (a >= 1){
            System.out.println("The Number is Positive.");

        } else if (a < 0) {
            System.out.println("The Number is Negative.");

        } else if (a == 0){
            System.out.println("Number is Zero.");

        } else {
            System.out.println("Invalid Number.");

        }
    }
}
