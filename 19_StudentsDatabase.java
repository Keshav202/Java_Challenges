import java.util.Scanner;
class StudentsDetail {

    public static String getNames(Scanner input){
        System.out.print("Enter Student Name : ");
        String name = input.nextLine();
        return name;
    }

    public static int getAge(Scanner input){
        System.out.print("Enter the Age : ");
        int age = input.nextInt();
        input.nextLine();
        return age;
    }

    public static double getMarks(Scanner input){
        System.out.print("Enter the Marks :");
        double marks = input.nextDouble();
        input.nextLine();
        return marks;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total Number of Students in class : ");
        int no_of_students = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= no_of_students; i++){
            System.out.println("\nEnter Detail of Student " + i );

            String name = getNames(input);
            int age = getAge(input);
            double marks = getMarks(input);

            System.out.println(".....Here is the Details of Student " + i + ".....\n");
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Marks : " + marks);
        }
        input.close();
    }
}
