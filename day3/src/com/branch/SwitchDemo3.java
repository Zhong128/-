package com.branch;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        test1();

    }
    public static void test1(){
        System.out.println("请输入性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();
        switch(sex){
            case "男":
                System.out.println("你是一个男性");
                break;
            case "女":
                System.out.println("你是一个女性");
                break;
            default:
                System.out.println("你的性别有误");
        }
    }
}


