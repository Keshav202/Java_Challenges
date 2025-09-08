import java.util.Scanner;
class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st No. : ");
        int a = scanner.nextInt();

        System.out.print("Enter 2nd No. : ");
        int b = scanner.nextByte();

        System.out.print("Enter 3rd No. : ");
        int c = scanner.nextInt();

        if (a > b && a > c){
            System.out.println(a + " is the Greatest Number");

        } else if (b > a && b > c) {
            System.out.println(b + " is the Greatest Number");

        } else {
            System.out.println(c + " is the Greatest Number");
        }

    }
}
