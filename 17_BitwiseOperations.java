import java.util.Scanner;

class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st No. : ");
        int a = scanner.nextInt();

        System.out.print("Enter 2nd No. : ");
        int b = scanner.nextInt();

        int and_result = a & b;
        int or_result = a | b;
        int xor_result = a ^ b;


        System.out.println("Bitwise AND Operation of " + a + " and " + b + " is : " + and_result);
        System.out.println("Bitwise OR Operation of " + a + " and " + b + " is : " + or_result);
        System.out.println("Bitwise XOR Operation of " + a + " and " + b + " is : " + xor_result);

        System.out.println("\n\n Here the Bitwise Compliment of Numbber.....");
        System.out.print("Enter the Number : ");
        int num = scanner.nextInt();

        int comp_result = ~num;

        System.out.println("Bitwise Compliment of Number " + num + " is " + comp_result);


    }
}
