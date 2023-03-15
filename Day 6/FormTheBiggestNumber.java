package dsaone;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

class FormTheBiggestNumber {
    // Given an array of numbers, program to
// arrange the numbers to form the
// largest number



        // The main function that prints the
        // arrangement with the largest value.
        // The function accepts a vector of strings
        static void printLargest(Vector<String> arr)
        {

            Collections.sort(arr, new Comparator<String>()
            {
                // A comparison function which is used by
                // sort() in printLargest()
                @Override public int compare(String X, String Y)
                {

                    // first append Y at the end of X
                    String XY = X + Y;

                    // then append X at the end of Y
                    String YX = Y + X;

                    // Now see which of the two
                    // formed numbers
                    // is greater
                    return XY.compareTo(YX) > 0 ? -1 : 1;
                }
            });

            Iterator it = arr.iterator();

            while (it.hasNext())
                System.out.print(it.next());
        }

        // Driver code
        public static void main(String[] args)
        {

            Vector<String> arr;
            arr = new Vector<>();

            // output should be 6054854654
            arr.add("54");
            arr.add("546");
            arr.add("548");
            arr.add("60");
            printLargest(arr);
        }
    }
// This code is contributed by Shubham Juneja



