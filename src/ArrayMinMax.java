import java.util.Random;

/**
 * Objective:
 *    Define the problem by constructing an algorithm using pseudocode
 *    Show a check of your solution with test data for at least two valid test cases
 *    Find the largest element of an array
 * In this example. the elements of an array are searched to determine which element is the largest.
 * The algorithm starts by putting the first element of the array into the variable called largest_element,
 * and then looks at the other elements of the array to see if a larger value exists.
 *
 * PSEUDOCODE
 *
 * DECLARE integer: counter
 * DECLARE integer: maxValue
 * DECLARE integer: minValue
 * DECLARE integer array: integerAry
 *
 * SET counter = 0
 * SET maxValue = integerAry[0]
 * SET minValue = integerAry[0]
 *
 * DOWHILE counter <= integerAry.length
 *      CHECK maxValue AND integerAry[counter]
 *      UPDATE maxValue IF maxValue < integerAry(counter)
 *      CHECK minValue AND integerAry[counter]
 *      UPDATE minValue IF minValue > integerAry(counter)
 * ENDWHILE
 * DISPLAY maxValue
 * DISPLAY minValue
 */

public class ArrayMinMax {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] integerAry = new int[arraySize];
        int maxValue;
        int minValue;
        Random rand = new Random();                             // chose to create the array using random values
        boolean test = true;                                    // boolean value to test the algorithm

        for (int i = 0; i < arraySize; i++) {                   // initializing the array
            integerAry[i] = rand.nextInt(100) + 1;       // chose array values between 1 and 100
        }

        maxValue = integerAry[0];                               // initializing the min and max variables.
        minValue = integerAry[0];

        for (int i = 1; i < arraySize; i++) {                   // NOTE: the index was set to 1 since the min and
            if ( maxValue < integerAry[i] ) {                   //       max values were assigned to element 0 of
                maxValue = integerAry[i];                       //       the array.
            }
            if ( minValue > integerAry[i] ) {
                minValue = integerAry[i];
            }
        }

        if (test ) {                                            // For testing purposes only.
            for (int i = 0; i < arraySize; i++) {
                System.out.println("Array element " + i + " array value: " + integerAry[i]);
            }
        }

        System.out.println("The maximum value is: " + maxValue);
        System.out.println("The minimum value is: " + minValue);

    }
}
