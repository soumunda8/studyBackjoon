package step2;

import java.util.Scanner;

// 성공
public class Main05 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        m -= 45;
        if(m < 0){
            m += 60;
            h -= 1;
            if(h < 0) {
                h += 24;
            }
        }

        System.out.println(h + " " + m);

    }

}
