import java.util.Scanner;
class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        RightHalfPyramid(num);
        ReverseRightHalfPyramid(num);
        LeftHalfPyramid(num);
        ReverseLeftHalfPyramid(num);

    }
    public static void RightHalfPyramid(int n1){
        System.out.println("Right Half Pyramid Pattern : ");
        for (int i = 1; i <= n1; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ReverseRightHalfPyramid(int n2) {
        System.out.println("Reverse Right Half Pyramid Pattern : ");
        for (int i = n2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void LeftHalfPyramid(int n3) {
        System.out.println("Left Half Pyramid Pattern : ");
        for (int i = 1; i <= n3; i++) {
            for (int j = i; j < n3; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ReverseLeftHalfPyramid(int n4){
        System.out.println("Reverse Left Half Pyramid : ");
        for (int i = n4; i >= 1; i--){
            for (int j = i; j < n4; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
