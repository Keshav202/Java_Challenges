import java.util.Scanner;
class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr2D = ArrayUtility.input2DArray();

        System.out.print("\nEnter the Element of Array, you want to Search : ");
        int num = input.nextInt();

        boolean isFound = searchIn2DArray(arr2D, num);
        if (isFound){
            System.out.println();
        }else {
            System.out.println("Number is not Found in the Array.");
        }

    }

    public static boolean searchIn2DArray(int[][] arr2D, int num){

        int i = 0;
        while (i < arr2D.length){
            int j = 0;
            while (j < arr2D[i].length){
                if (arr2D[i][j] == num){
                    System.out.println("Number is Found at the Position [" + i + "] [" + j + "]");
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
