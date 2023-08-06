package step2;

import java.util.Scanner;

// 실패
public class Main06 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        String time = sc.nextLine();
        int cookTime = sc.nextInt();

        String[] strArr = time.split(" ");
        int h = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);

        m += cookTime;
        if(m > 59) {
            h += 1;
            m -= 60;
            if(m == 60) {
                h += 1;
                m = 0;
            }

            if(h >= 24) {
                h -= 24;
            }
        }

        System.out.println(h + " " + m);

    }

}
