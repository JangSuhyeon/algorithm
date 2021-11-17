package chap01;

import java.util.Scanner;

public class Min4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println(min4(stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt()));

    }

    public static int min4(int a, int b, int c, int d) {

        if (a >= b) {
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        } else {
            if(b <= c)
                return b;
            else if(a >= c)
                return a;
            else
                return c;
        }

    }
}
