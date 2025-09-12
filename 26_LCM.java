import java.util.Scanner;
class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lcm = findLCM(input);
        System.out.println("LCM of given Numbers = " + lcm);

    }
    public static int findLCM(Scanner input){
        System.out.print("Enter first Number : ");
        int a = input.nextInt();
        System.out.print("Enter second Number : ");
        int b = input.nextInt();

        int gcd = 1; // GCD = Greatest Common Diviser

        for (int i=1; i <= a && i <= b; i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        int lcm = (a * b) / gcd;

        return lcm;
    }
}
