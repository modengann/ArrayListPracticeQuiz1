/**
 *  Setup: The code is setup to take integer input from the user. The input will be
 *  added to an ArrayList called "values" until the user enters -1.
 * 
 *  Your task:
 *  After the numbers have been collected, write code that will:
 *    1. Read an integer value from the user
 *    2. Find the sum of all numbers in the ArrayList values that are
 *       less than the number you collected in #1
 *    3. Print the sum from #2 one time
 * 
 *       For example:
 *       If the ArrayList contains [5, 4, 3] and the user enters 5 for #1, you should
 *       print "7" because 4 and 3 are both less than 5 and the sum of 4 + 3 is 7
 */


import java.util.*;


public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();


        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            values.add(input);
        }

        System.out.println("");
        //Write your code below here


    }
}
