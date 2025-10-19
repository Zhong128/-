package com.comment.Demo;

import java.util.Scanner;

public class AllTest {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身高：");
        double height = sc.nextDouble();
        System.out.println("请输入您的体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入您的性别：");
        String sex = sc.next();
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();

        // 调用BMI计算方法
        double bmi = calculateBMI(height, weight);
        System.out.println("您的BMI指数为：" + bmi);
        // 判断BMI指数是否正常
        if (bmi < 18.5) {
            System.out.println("您的BMI指数过低，请保持健康");
            return;

        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("您的BMI指数正常，请保持健康");
            return;
        } else {
            System.out.println("您的BMI指数过高，请减肥");
            return;
        }
    }

    // 添加BMI计算方法
    public static double calculateBMI(double height, double weight) {
        // BMI = 体重(kg) / 身高²(m)
        return weight / (height * height);
    }
}



