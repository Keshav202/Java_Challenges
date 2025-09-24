class isArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.displayArray(arr);
        isPalindrome(arr);

    }

    public static void isPalindrome(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            if (arr[start] != arr[end]){
                System.out.println("Array is NOT Palindrome.");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Array is Palindrome");
    }
}
