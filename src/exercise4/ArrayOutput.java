package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt(); 

        int[] numbers = new int[count];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) 
        {
            numbers[index] = input.nextInt();
        }
        
        String spazia ="";
        
        for (int i = 0; i < numbers.length; i++)
        {
          System.out.println(spazia + numbers[i]);
          spazia = spazia + " ";
        } 

        //String numbersAsString = Arrays.toString(numbers);
        //System.out.println("Numbers: " + numbersAsString);
    }

}
