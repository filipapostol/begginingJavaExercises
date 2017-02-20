public class Main {


    public static void main(String[] args) {
        //TEST Exercise 1 - Determine if is a triangle
        Exercise1 exercise1 = new Exercise1();
        System.out.println(exercise1.isATriangle(2,2,2)); //Should return true
        System.out.println(exercise1.isATriangle(9,1,1)); //Should return false

        //TEST Exercise 2 - Numbers from 1 to 10
        Exercise2 exercise2 = new Exercise2();
        int[] theArray = exercise2.countTo10();
        //iterating an array
        for (int i = 0; i < theArray.length; i++) {
            System.out.print(theArray[i] + " ");
        }

        System.out.println();
        //TEST Exercise 3 - Numbers from 10 to 1
        Exercise3 exercise3 = new Exercise3();
        System.out.println( exercise3.from10to0());
    }



}
