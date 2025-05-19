package part2;

import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0, count = 0;

        while(true){
            count++; // this add 1 to count
            // count += 1, different of adding 1
            // count = count + 1

            System.out.println("Give a number:");
            input = scanner.nextInt();

            if(input == 0){
                break;
            }
        }// end of loop

        System.out.println("Number of numbers: " + (count - 1) );
    }// end of main
}