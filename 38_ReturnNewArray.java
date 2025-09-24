import java.util.Scanner;
class ReturnNewArray {
    public static int[] deleteElement(int[] arr, int element) {
        int count = 0;

        // Count how many times element occurs
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }

        // If element not found, return original array
        if (count == 0) {
            System.out.println("Element not found in array.");
            return arr;
        }

        // Create new array with reduced size
        int[] newArr = new int[arr.length - count];
        int index = 0;

        // Copy only elements that are not equal to 'element'
        for (int num : arr) {
            if (num != element) {
                newArr[index++] = num;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to delete
        System.out.print("Enter element to delete: ");
        int element = sc.nextInt();

        // Call function
        int[] result = deleteElement(arr, element);

        // Print new array
        System.out.println("Array after deletion:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
