/*
In this task you are required to create an algorith that will return an arrag if integers containg the numbers from 1 to 10
- To do this task, study how to create Java arrays and add values to them
- Learn about how to print values from an array so that in Main.java you can show the data this function will return
*/
public class Exercise2 {

    public int[] countTo10() {  //method starts here

        int[] anArray; //creating an array of type integer called 'anArray'
        anArray = new int[10]; //initialising the array to capacity 10(no values yet added, at this point each index has a value of 0)

        //assigning values to indexes in array
        anArray[0] = 1;
        anArray[1] = 2;
        anArray[2] = 3;
        anArray[3] = 4;
        anArray[4] = 5;
        anArray[5] = 6;
        anArray[6] = 7;
        anArray[7] = 8;
        anArray[8] = 9;
        anArray[9] = 10;

        //returning the array containing the values
        return anArray;
    }


}



