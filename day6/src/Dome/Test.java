package Dome;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        goldCard gold = new goldCard("张克山", "京A99999", 50000, "18888888888");
        System.out.println("尊敬的" + gold.getName() + "先生，欢迎您光临，您的基本信息如下：" + gold.getCarID() + "，余额是" + gold.getMoney() + "，手机号是" + gold.getPhone());
        pay(gold);

        silverCard silver = new silverCard("小平", "粤AA1949", 2000, "16666666666");
        System.out.println("尊敬的" + silver.getName() + "先生，欢迎您光临，您的基本信息如下：" + silver.getCarID() + "，余额是" + silver.getMoney() + "，手机号是" + silver.getPhone());
        pay(silver);


    }

    public static void pay(Card c) {
        System.out.println("请刷卡，输入消费金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);

        System.out.println("消费完成，是否需要充值？需要请按1，不需要请按0：");
        int choice = sc.nextInt();
        if (choice == 1) {
            deposit(c);
            System.out.println("感谢您的充值");
        } else {
            System.out.println("感谢您的消费，希望下次光临");
        }
    }


    public static void deposit(Card c) {
        System.out.println("请刷卡，输入充值金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.deposit(money);
        System.out.println("充值成功，余额是：" + c.getMoney());
    }
}

