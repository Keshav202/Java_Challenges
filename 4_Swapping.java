import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 15;
//
//        int c = a;
//        a = b;
//        b = c;
//
//        System.out.println(a);
//        System.out.println(b);



        //Take Input Then Swap


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Two Number : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("After Swap : ");
        System.out.print(" First Number " + a + " ");
        System.out.println("Second Number "+b);

    }
}
