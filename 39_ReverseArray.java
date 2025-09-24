class ReverseArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        reverseArray(array);
        System.out.println("Here is your Reverse Array");
        ArrayUtility.displayArray(array);

    }

    public static void reverseArray(int[] array){

        int start = 0;
        int end = array.length - 1;

        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

    }
}
