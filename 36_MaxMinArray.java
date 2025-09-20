class MaxMinArray {
    public static void main(String[] args) {

        System.out.println("...Finding Maximum and Minimum element from an Array...");
        int[] numArr = ArrayUtility.inputArray();

        int max = max(numArr);
        System.out.println("Maximum element of the array is : " + max);

        int min = min(numArr);
        System.out.println("Minimum element of the array is : " + min);

    }
    public static int max(int[] numArr){
        int i = 0;
        int max = numArr[0];

        while (i < numArr.length){
            if (numArr[i] > max){
                max = numArr[i];
            }
            i++;
        }

        return max;
    }

    public static int min(int[] numArr){
        int i = 0;
        int min = numArr[0];

        while (i < numArr.length){
            if (numArr[i] < min){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }
}
