/*
In this exercise you have to call the function you created in Exercise2, reverse and return the array of integers you created
*/
public class Exercise3 {
    public String from10to0 () {            //formula starts here, countdown from 10 to 1
        String result = "";                 // x
        // Loop through 0, 1, 2, 3 and 4.
        for (int i = 10; i >=0; i--) {      // conditions for int, starts with 10 -1
            result += i + " ";              //space between the results
        }
        return result;
    }
}


