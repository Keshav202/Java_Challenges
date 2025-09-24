import java.util.Scanner;
class ReturnNewArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Arr = ArrayUtility.inputArray();

        System.out.print("Enter the No. you want to delete : ");
        int numToDel = input.nextInt();

        int[] returnArray = deleteNum(Arr, numToDel);
        System.out.println("Here is your New Array");
        ArrayUtility.displayArray(returnArray);

    }

    public static int[] deleteNum(int[] Arr, int numToDel){

        int count = 0;
        int i = 0;
        while(i < Arr.length ){
            if (Arr[i] == numToDel){
                count++;
            }
            i++;
        }

        if (count == 0){
            System.out.println("Number is not found in the Array.");
            return Arr;
        }

        int[] resultArray = new int[Arr.length - count];

        int j = 0;
        int k = 0;

        while(j < Arr.length){
            if (Arr[j] != numToDel){
                resultArray[k] = Arr[j];
                k++;
            }
            j++;
        }

        return resultArray;

    }

}
