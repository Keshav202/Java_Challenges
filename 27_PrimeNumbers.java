import java.util.Scanner;
class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = checkPRIMEnumber(input);

    }
    public static int checkPRIMEnumber(Scanner input){
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        boolean isPrime = true;
        if (num <= 1){
            isPrime = false;

        }else {
            for (int i=2; i <= num / 2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("The Given Number is Prime Number...");
        }else {
            System.out.println("Not a Prime Number");
        }
        return num;
    }
}
