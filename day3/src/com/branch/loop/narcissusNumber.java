package com.branch.loop;

public class narcissusNumber {
    public static void main(String[] args) {
        System.out.println("所有的水仙花数为：");

        // 遍历所有三位数（100-999）
        for (int i = 100; i <= 999; i++) {
            // 获取百位、十位、个位数字
            int hundreds = i / 100;        // 百位
            int tens = (i / 10) % 10;      // 十位
            int ones = i % 10;             // 个位

            // 计算各位数字的立方和
            int sumOfCubes = (hundreds * hundreds * hundreds) +
                    (tens * tens * tens) +
                    (ones * ones * ones);

            // 判断是否为水仙花数
            if (sumOfCubes == i) {
                System.out.println(i);
            }
        }
    }
}

