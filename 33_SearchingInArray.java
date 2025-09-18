import java.util.Scanner;
class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Arr = {3,6,12,24,48,96,192};

        System.out.print("Enter the Number You want to Find in Array : ");
        int num = input.nextInt();
        input.nextLine();

        String[] names = {"Keshav", "Madhav", "Gaurav", "Raja", "Raju", "Billu"};

        System.out.print("Enter the Name You want to Find in the List : ");
        String name = input.nextLine();

        boolean isFound = isFound(Arr, num);
        boolean isListed = isListed(names, name);

        if (isFound){
            System.out.println("Number is Found!");
        }
        else{
            System.out.println("Number is not Found!");
        }

        if (isListed){
            System.out.println("Name is Found!");
        }else {
            System.out.println("Name is not Listed!");
        }

    }
    public static boolean isFound(int[] Arr, int num){
        int index = 0;
        while(index < Arr.length){
            if (Arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }

    public static boolean isListed(String[] names, String name){
        int index = 0;
        while(index < names.length){
            if (names[index].equals(name)){
                return true;
            }
            index++;
        }
        return false;
    }
}
