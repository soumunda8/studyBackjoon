package step2;

import java.util.Scanner;

// 성공
public class Main01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2) {
            System.out.println("==");
        } else if(num1 > num2) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }

    }

}
