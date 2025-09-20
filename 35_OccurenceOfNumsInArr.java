import java.util.Scanner;
class OccurenceOfNumsInArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int size = input.nextInt();

        System.out.println("Enter Array Elements : ");
        int[] arr = new int[size];

        int i = 0;
        while(i < arr.length){
            System.out.print("Enter Element " + (i+1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }

        boolean[] isVisited = new boolean[size];

        int j = 0;
        while (j < arr.length){
            if (!isVisited[j]){
                int count = 1;
                int k = j + 1;
                while ( k < arr.length){
                    if (arr[j] == arr[k]){
                        count++;
                        isVisited[k] = true;
                    }
                    k++;
                }
                System.out.println(arr[j] + " Occurs " + count + " times.");
            }
            j++;
        }

    }
}
