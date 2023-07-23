package step1;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        /* 왜 틀리는 지 이해가 안됨....double 써써 그래요? */
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double result = Math.floor((a/b)*1000000000)/1000000000;

        System.out.println(result);

    }

}