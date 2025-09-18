class _2DArray {
    public static void main(String[] args) {

//        Declaration of Array : Method 1
        int myArr[][] = new int[3][3];
        myArr[0][0] = 2;
        myArr[0][1] = 4;
        myArr[0][2] = 6;
        myArr[1][0] = 3;
        myArr[1][1] = 6;
        myArr[1][2] = 9;
        myArr[2][0] = 4;
        myArr[2][1] = 8;
        myArr[2][2] = 12;

//        Declaration Method 2 :

        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};


        int i = 0;
        while(i < myArr.length){
            int j = 0;
            while (j < myArr[i].length){
                System.out.print(myArr[i][j] + "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
