import java.util.Scanner;

class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("Given Number is a Prime Number");
        }else {
            System.out.println("Given Number is NOT a Prime Number");
        }

    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i < num){
            if (num % 2 == 0){
                return false;
            }
            i++;
        }

        return true;
    }

}
