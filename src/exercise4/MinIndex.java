package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        double[] numbers = new double[count];

        for (int index = 0; index < numbers.length; index++) 
        {
            numbers[index] = input.nextInt();
        }

        double min = numbers[0];
        for (int i = 0; i<numbers.length; i++)
        {
          if (numbers[i]<min)
          {
            min = numbers[i];
          }
        }

        for (int j = 0; j<numbers.length-1; j++)
        {
          if (min == numbers[j])
          {
            System.out.println("Min index: " + j);
          }
        }
        
        
    }

}