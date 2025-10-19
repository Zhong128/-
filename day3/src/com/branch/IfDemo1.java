package com.branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();

    }
    public static void test1(){
        int a = 2;
        if(a > 5){
            System.out.println("可以上网");
        }
        System.out.println("不可以上网");
    }
    public static void test2(){
        int a = 1;
        if(a > 5){
            System.out.println("可以上网");
        }else{
            System.out.println("不可以上网");
        }

    }
    public static void test3() {
       System.out.println("请输入员工分数");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90 && score <= 100){
            System.out.println("A+");
        }else if(score >= 80 && score < 90){
            System.out.println("良好");
        }else if(score >= 70 && score < 80){
            System.out.println("中等");
        }else if(score >= 60){
            System.out.println("及格");
        }else if (score < 60){
            System.out.println("不及格");
        }else {
            System.out.println("输入的分数有误");
        }


    }



}
