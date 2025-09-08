import java.util.Scanner;
public class AgeGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = scanner.nextInt();

        if (age <= 13){
            System.out.println("You are Child.");
            
        } else if (age <= 20) {
            System.out.println("You are Minor");
            
        } else if (age <= 60) {
            System.out.println("You are Adult");
            
        } else {
            System.out.println("Seniors");
        }
    }
}
