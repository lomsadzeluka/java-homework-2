package Project3;

import java.util.Random;
import java.util.Scanner;

public class A {
    private int[] m = new int[10];

    public void setMManual() {
        m = new int[10]; // clear previous values
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; ++i) {
            System.out.println("\n Enter number: ");
            int num = Integer.parseInt(input.nextLine());
            m[i] = num;
        }
    }

    public void setMRandom() {
        m = new int[10]; // clear previous values
        Random randomGenerator = new Random();
        for (int i = 0; i < 10; i++) {
            int num = randomGenerator.nextInt(10) + 1;
            m[i] = num;
        }
    }


    public int getSumOfLess() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = m[i];
            if (num < i) {
                sum += num;
            }
        }
        return sum;
    }

    public int getProductOfHigher() {
        int prod = 1;
        for (int i = 0; i < 10; i++) {
            int num = m[i];
            if (num > i) {
                prod *= num;
            }
        }
        return prod;
    }
}
