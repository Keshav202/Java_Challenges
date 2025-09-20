class CheckSortedArray {
    public static void main(String[] args) {
        System.out.println("\n... Checking Array is Sorted or Not...\n");
        int[] arr = ArrayUtility.inputArray();

        boolean inc = isIncreasing(arr);
        boolean dic = isDecreasing(arr);

        if (inc || dic){
            System.out.println("Given Array is Sorted.");
        }else {
            System.out.println("Array is not Sorted.");
        }

    }
    public static boolean isIncreasing(int[] arr){
        int i = 1;
        while (i < arr.length){
            if ( arr[i] <= arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr){
        int i = 1;
        while (i < arr.length){
            if ( arr[i-1] <= arr[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
