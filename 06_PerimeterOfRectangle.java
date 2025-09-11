import java.util.Scanner;
class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      We take Input from user which is the sides od rectangle and then find the perimeter
        System.out.println("Please enter the 1st Side of Rectangle (in cm)");
        int s_1 = scanner.nextInt();
        System.out.println("Please enter the 2nd Side of Rectangle (in cm)");
        int s_2 = scanner.nextInt();
        System.out.println("Please enter the 3rd Side of Rectangle (in cm)");
        int s_3 = scanner.nextInt();
        System.out.println("Please enter the 4th Side of Rectangle (in cm)");
        int s_4 = scanner.nextInt();

        int peri_of_rec = s_1 + s_2 + s_3 + s_4;

        System.out.println("Perimeter of Rectangle with Sides : " + s_1 + " " + s_2 + " " + s_3 + " " + s_4 + " is :");
        System.out.println(peri_of_rec);
    }

}
