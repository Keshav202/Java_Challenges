class Merge_Two_SortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        if (!isSorted(arr1) || !isSorted(arr2)){
            System.out.println("Array is Not Sorted. Please Enter a Sorted Array!");
        }else {
            int[] MergeArray = NewMergeArr(arr1, arr2);
            System.out.println("\nHere is the New Merged Array");
            ArrayUtility.displayArray(MergeArray);
        }

    }

    public static boolean isSorted(int[] arr){
        int i = 0;
        while (i < arr.length-1){
            if (arr[i] > arr[i+1]){
                return false;
            }
            i++;
        }

        return true;
    }

    public static int[] NewMergeArr(int[] arr1, int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] MergeArray = new int[n1 + n2];

        int i =0, j = 0, k = 0;

        while (i < n1 && j < n2){
            if (arr1[i] <= arr2[j]){
                MergeArray[k] = arr1[i];
                i++;
            }else {
                MergeArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            MergeArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2){
            MergeArray[k] = arr2[j];
            j++;
            k++;
        }


        return MergeArray;
    }
}
