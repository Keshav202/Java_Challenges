import java.util.Scanner;
class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;

        System.out.println("Please Enter a Number : ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Given Number is EVEN.");
        } else {
            System.out.println("Given Number is ODD.");
        }

    }
}
