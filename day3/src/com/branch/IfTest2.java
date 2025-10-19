package com.branch;

public class IfTest2 {
    public static void main(String[] args) {
    test1();
    }
    public static void test1(){
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        if (red) {
            System.out.println("红灯亮,tingxia");
        }else if (yellow) {
            System.out.println("黄灯亮,准备");
        }else if (green) {
            System.out.println("绿灯亮,开始");
        }else {
            System.out.println("灯泡故障");
        }
    }
}
