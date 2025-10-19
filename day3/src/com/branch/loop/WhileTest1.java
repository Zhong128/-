package com.branch.loop;

public class WhileTest1 {
    public static void main(String[] args) {
    System .out.println("需要多少次:"+cale());
    }
    public static int cale(){
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while(peakHeight > paperThickness){
            paperThickness*= 2;
            count++;
        }
        return count;
    }
}
