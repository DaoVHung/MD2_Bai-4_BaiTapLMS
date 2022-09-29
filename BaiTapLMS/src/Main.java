import baitap.lms.PhuongTrinhBacHai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax2 + bx + c = 0");
        System.out.println("Nhap vao a, b, c để tính phương trình:");
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai(a,b,c);
        System.out.println("Phương trình có delta = : ");
        pt.getBacHai();
        if(pt.getBacHai()>=0){
            System.out.println("Phương trình có 2 nghiệm là: ");
            System.out.println(pt.getRoot1());
            System.out.println(pt.getRoot2());
        }else if (pt.getBacHai()==0){
            System.out.println("Phương trình có 1 nghiệm :");
            System.out.println(pt.getRoot1());

        }else {
            System.out.println("Phương trình vô nghiệm");
        }

 }
}