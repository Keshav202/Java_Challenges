import java.util.Scanner;
class AverageOfSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int size = input.nextInt();

        System.out.println("Enter the Elements : ");
        int[] arr = new int[size];

        int sum = sumOfArr(size, arr, input);
        int avg = sum / size;

        System.out.println("Here is the Sum of Array : " + sum);
        System.out.println("Average of Sum of Array Elements " + avg);

    }

    public static int sumOfArr(int size, int[] arr, Scanner input){
        int i = 0;
        int sum = 0;
        while (i < arr.length){
            System.out.print("Enter Element " + (i+1) + " : ");
            arr[i] = input.nextInt();
            sum += arr[i];
            i++;
        }
        return sum;
    }
}
