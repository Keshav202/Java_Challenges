class Merge_Two_SortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        int[] MergeArray = isSorted(arr1, arr2);
        System.out.println("\nHere is the New Merged Array");
        ArrayUtility.displayArray(MergeArray);

    }
    public static int[] isSorted(int[] arr1, int[] arr2){

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
