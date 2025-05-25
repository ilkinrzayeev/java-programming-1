package part2;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 1;

        System.out.println("Give a number:");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++) {
            System.out.println("i " + i +"\n");
            System.out.println("num " + num +"\n");
            System.out.println("sum " + sum +"\n");

            sum *= i;
            System.out.println(sum);
        }

        System.out.println("Factorial: " + sum);
    }
}
