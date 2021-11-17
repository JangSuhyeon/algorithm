package chap01;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println(min3(stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt()));

    }

    public static int min3(int a, int b, int c) {
        int min = a;
        if (b < min){ min = b; }
        if (c > min){ min = c; }
        return min;
    }
}
