import java.util.Scanner;
    class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while(i <= 5){

            System.out.print("Enter a Number... : ");
            int num = scanner.nextInt();
            System.out.println("The No. is : " + num );
            i += 1;

        }
        System.out.println("End....");
    }
}
