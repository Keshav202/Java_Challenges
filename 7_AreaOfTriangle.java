import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Valur of 'Base' of the Triangle : ");
        double base = scanner.nextDouble();
        System.out.print("Enter the Valur of 'Height' of the Triangle : ");
        double height = scanner.nextDouble();

        double area_of_triangle = (base * height) / 2;

        System.out.print("Area of Triangle is : " + area_of_triangle);

    }
}
