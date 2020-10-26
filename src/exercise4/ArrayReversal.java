package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        char[] duma = new char[count];

        for (int index = duma.length+1; index < 0; index--) 
        {
            duma[index] = input.next().charAt(duma.length+1);
        }

        String dumasAsString = Arrays.toString(duma);
        System.out.println("Reversed symbols: " + dumasAsString);
    }

}