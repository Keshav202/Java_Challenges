import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        table(input);

    }
    public static int table(Scanner input){
        System.out.println("Enter the number : ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
        return num;

    }
}
