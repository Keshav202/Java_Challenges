import java.util.Scanner;
class GradesBasedOnMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Marks : ");
        double marks = scanner.nextDouble();

        if (marks >= 90 ){
            System.out.println("You Got Grade : \"A\"");

        } else if (marks < 90 && marks >= 75) {
            System.out.println("You Got Grade : \"B\"");

        } else if (marks >= 60 && marks < 75) {
            System.out.println("You Got Grade : \"C\"");

        } else if (marks >= 30 && marks < 60) {
            System.out.println("You Got Grade : \"D\"");
        } else {
            System.out.println("Your are Fail...");
        }

    }
}
