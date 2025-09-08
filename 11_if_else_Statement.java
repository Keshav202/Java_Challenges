import java.util.Scanner;
class if_else_Statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Your Name : ");
        String name = scanner.nextLine();

        System.out.print("Are you a Female [type 'true' for True & 'false' for False]: ");
        boolean isFemale = scanner.nextBoolean();

        System.out.print("Please Enter Your Age : ");
        int age = scanner.nextInt();

        boolean gotDiscount = false;

        if (age < 5){
            System.out.println("Hello  " + name + "\nYou are a minor! You got 75% Discount!");
            gotDiscount = true;

        } if (isFemale) {
            System.out.println( "Hello "+ name + "\nYou are a Female! You got 50% Discount!");
            gotDiscount = true;

        } if (age > 60){
            System.out.println("Hello "+ name + "\nYou are a senior citizen you will get 25% Discount! ");

        } else if (!gotDiscount) {
            System.out.println("No Discount!");

        }

    }
}
