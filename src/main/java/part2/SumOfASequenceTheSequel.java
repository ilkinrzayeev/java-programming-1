package part2;

import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperNumber, sum = 0;

        System.out.println("First Number?");
        int lowerNumber = scanner.nextInt();

        System.out.println("Last Number?");
        upperNumber = scanner.nextInt();

        for(int i = lowerNumber; lowerNumber <= upperNumber; lowerNumber++) {
            sum += lowerNumber;
        }

        System.out.println("The sum is " + sum);
    }
}
