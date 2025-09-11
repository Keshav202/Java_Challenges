import java.util.Scanner;
class Arithmatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Integer Operation

        System.out.println("Here we do Arithmatic Operation of Two Integers...");
        System.out.print("Please Enter First Integer Number : ");
        int a = scanner.nextInt();
        System.out.print("Please Enter Second Integer Number : ");
        int b = scanner.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("Addition : " + a + " + " + b + " = " + add);
        System.out.println("Subtraction : " + a + " - " + b + " = " + sub);
        System.out.println("Multiplication : " + a + " * " + b + " = " + mul);
        System.out.println("Division : " + a + " / " + b + " = " + div);
        System.out.println("Modulus : " + a + " % " + b + " = " + mod);
        System.out.println("\n");

//        Floating Operation

        System.out.println("\n");
        System.out.println("Enter 1st No. For Flating Operation : ");
        double d = scanner.nextDouble();
        System.out.println("Enter second Number for Floating Operation : ");
        double e = scanner.nextDouble();

        double f_add = d + e;
        double f_sub = d - e;
        double f_mul = d * e;
        double f_div = d / e;
        // Modulus of Float value is NA

        System.out.println(d + " + " + e + " = " + f_add );
        System.out.println(d + " - " + e + " = " + f_sub );
        System.out.println(d + " * " + e + " = " + f_mul );
        System.out.println(d + " / " + e + " = " + f_div );


//        Order of Operation. Java follows BODMAS

        System.out.println();
        System.out.println();
        System.out.println((2+4)*12/6-1);

    }

}
