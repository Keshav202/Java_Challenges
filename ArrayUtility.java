import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the Size of an Array : ");
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

    public static int[][] input2DArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Row for 2D Array : ");
        int row = sc.nextInt();
        System.out.print("Enter Colum for 2D Array : ");
        int col = sc.nextInt();
        System.out.println();

        int[][] arr2D = new int[row][col];

        int i = 0;
        while (i < row){
            int j = 0;
            while (j < col){
                System.out.print("Enter element for [" + i + "][" + j + "] : ");
                arr2D[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        return arr2D;

    }

    public static void displayArray(int[] arr){
        int i = 0;
        System.out.print("[");
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i ++;
        }
        System.out.print("]\n");
    }

}
