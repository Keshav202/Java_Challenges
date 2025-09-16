import java.util.Scanner;
class MultiplicationTable {
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

    static class TableUsingWhileLoop {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("This is a Table....");
            int num = table(input);
            int table = table(input);
            System.out.println("Here is the table of " + num + " : \n" + table);

        }
        public static int table(Scanner input){
            System.out.print("Enter the Number : ");
            int num = input.nextInt();

            int table = 1;

            while (table <= 10){
                System.out.println(num*table);
                table++;
            }

            return table;
        }
    }
}
