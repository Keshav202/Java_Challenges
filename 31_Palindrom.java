import java.util.Scanner;
class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        boolean isPalindrom = isPalindrom(num);
        if (isPalindrom){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }

    public static boolean isPalindrom(int num){
        return num == reverseNumber(num);
    }

    public static int reverseNumber(int input) {
        System.out.print("Enter an integer: ");
        int num = input;

        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;           // take last digit
            reversed = reversed * 10 + digit; // append digit
            num /= 10;                       // remove last digit
        }

        return reversed;
    }
}
