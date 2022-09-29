import baitap.lms.StopWatch;

import java.util.Scanner;

public class SetTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch st= new StopWatch();

        System.out.println("Bấm bắt đầu");
        String click = sc.nextLine();
        st.start();
        System.out.println("Bấm để kết thúc");
        String click2 = sc.nextLine();

        st.stop();
        System.out.println("Thời gian đã tính đc là :" + st.getElapsedTime() + "milisecon");
    }
}
