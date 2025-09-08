import java.util.Scanner;
class TempratureUnitChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Here we change the Unit of Temprature, Fahrenheit to celsius
        System.out.print("Enter the Temprature in Farhenheit : ");
        double F = scanner.nextDouble();

        double C = (F-32)*5/9;

        System.out.print("If Temprature is " + F + " Degree Farhenheit then in Celsius it will be : " + C + " Degree Celsius" );

    }
}
