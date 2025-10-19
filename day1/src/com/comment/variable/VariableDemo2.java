package com.comment.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
    //帮我设计并打印一个字符串数据
        String name = "张三";
        System.out.println(name);
        System.out.println("张三");
    //帮我设计一个程序求任意两个数据的较大值
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        


    }
}
