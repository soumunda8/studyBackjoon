package step1;

import java.util.Scanner;

// 성공
public class Main10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int b1 = b / 100;
        int b2 = (b - (b1 * 100)) / 10;
        int b3 = (b - ((b1 * 100) + (b2 * 10)));

        System.out.println(a * b3);
        System.out.println(a * b2);
        System.out.println(a * b1);
        System.out.println(a * b3 + ((a * b2)*10) + ((a * b1)*100));

    }

}