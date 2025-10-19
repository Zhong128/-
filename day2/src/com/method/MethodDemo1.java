package com.method;

public class MethodDemo1 {
    //写main方法
    public static void main(String[] args) {
        //获取一个指定位数的验证码返回
        String code = getCode(4);
        System.out.println(code);
        String code1 = getCode(5);
        System.out.println(code1);
    }

    // 定义获取验证码的方法
    public static String getCode(int length) {
        StringBuilder code = new StringBuilder();
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * chars.length());
            code.append(chars.charAt(index));
        }
        return code.toString();
    }
}
