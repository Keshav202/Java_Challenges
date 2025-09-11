public class Parameter {
    public static void main(String[] args) {

        int add = sumOfNums(5, 8);
        System.out.println("Sum is : " + add);

    }
    public static int sumOfNums(int a , int b){
        System.out.println("Name is : " + a);
        System.out.println("Second Number is : " + b);

        int sum = a + b;

        return sum;
    }
}
