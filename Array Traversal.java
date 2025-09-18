class Array {
    public static void main(String[] args) {

//        Array Traversal

        int[] myArr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int index = 0;
        System.out.println("Index  Element");
        while (index < myArr.length){
            System.out.println(index + "   -   " + myArr[index]);
            index++;
        }
    }
}
