package baitap.lms;

import java.util.Scanner;

    public class PhuongTrinhBacHai{
        private double a;
        private double b;
        private double c;

        public PhuongTrinhBacHai(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public  double getBacHai(){
            double delta;
            return delta = Math.pow(b,2)-4*a*c;
        }
        public double getRoot1(){
            double r1;
            return r1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
        }
        public  double getRoot2(){
            double r2;
            return r2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
        }
    }

