import java.util.Scanner;
class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int reversed = reverseNumber(input);  // call function
        System.out.println("Reversed Number = " + reversed);
    }

    public static int reverseNumber(Scanner input) {
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;           // take last digit
            reversed = reversed * 10 + digit; // append digit
            num /= 10;                       // remove last digit
        }

        return reversed;
    }
}

