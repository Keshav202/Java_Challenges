import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size of an Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];

        int i = 0;
        while(i < arr.length){

            System.out.print("Enter Element no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
}
