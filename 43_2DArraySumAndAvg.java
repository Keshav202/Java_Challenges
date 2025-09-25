class SumAndAvg {
    public static void main(String[] args) {
        int[][] arr2D = ArrayUtility.input2DArray();
        System.out.println("\nThe size of this 2D Array is : " + arr2D.length);

        int sum = sum(arr2D);
        System.out.print("\nSum of All elements in array is : " + sum);

        int avg = sum / arr2D.length;
        System.out.print("\nAverage is : " + avg);

    }

    public static int sum(int[][] arr2D){

        int i = 0;
        int sum = 0;
        while (i < arr2D.length){
            int j = 0;
            while (j < arr2D[i].length){
                sum = sum + arr2D[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
