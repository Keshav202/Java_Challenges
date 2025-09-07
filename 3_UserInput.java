import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter your Age : ");
        int age = scanner.nextInt();
        System.out.println("Welcome to the Java World! " + name + "\nYour age is " + age);

    }
}
