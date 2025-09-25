class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] arr2 = ArrayUtility.input2DArray();

        int sum = sumOfDiagonal(arr2);
        System.out.print("\nSum of Diagonals : " + sum);
    }
    public static int sumOfDiagonal(int[][] arr2D){

        int i = 0;
        int sum = 0;
        while (i < arr2D.length){
            int j = 0;
            while (j < arr2D[i].length){
                if (i == j){
                    sum = sum + arr2D[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
