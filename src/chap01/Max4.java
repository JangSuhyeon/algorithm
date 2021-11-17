package chap01;

import java.util.Scanner;

public class Max4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println(max4(stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt()));

    }

    public static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max){ max = b; }
        if (c > max){ max = c; }
        if (d > max){ max = d; }
        return max;
    }
}
