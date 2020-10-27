package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        double[] numbers = new double[count];

        for (int index = 0; index < numbers.length; index++) 
        {
            numbers[index] = input.nextInt();
        }
        double max = numbers[0];

        for (int i = 0; i<numbers.length-1; i++)
        {
          if (numbers[i]<numbers[i+1])
          {
            max = numbers[i+1];
          }
        }
        
        System.out.println("Max number: "+max);
        

        //String numbersAsString = Arrays.toString(numbers);
        //System.out.println("Numbers: " + numbersAsString);
        //System.out.println("Last number: "+ numbers[numbers.length-1]);
    }

}