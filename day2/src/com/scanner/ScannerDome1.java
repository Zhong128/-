package com.scanner;

import java.util.Scanner;

public class ScannerDome1 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();

        System.out.println("欢迎" + name
        );
    }





}
