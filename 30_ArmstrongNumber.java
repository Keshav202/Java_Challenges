import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean result = checkArmstrong(input);
        if (result) {
            System.out.println("It is an Armstrong Number.");
        } else {
            System.out.println("It is NOT an Armstrong Number.");
        }
    }

    public static boolean checkArmstrong(Scanner input) {
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int originalNum = num;

        int sum = 0;
        int digits = String.valueOf(num).length();  // count digits

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits); // raise digit to power of total digits
            num /= 10;
        }

        return sum == originalNum;
    }
}
