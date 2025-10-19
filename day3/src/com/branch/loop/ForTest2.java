package com.branch.loop;

public class ForTest2 {
    public static void main(String[] args) {
    System.out.println("1到10的奇数和是"+sum(10));
    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i+=2) {
            sum += i;
        }
        return sum;
    }


}
