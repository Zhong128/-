package Dome;

public class silverCard extends  Card {
    public silverCard(String name, String carID, double money, String phone) {
        super(name, carID, money, phone);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前使用银卡消费金额:" + money);
        System.out.println("优惠后的价格是:" + money * 0.9);
        if(getMoney()< money * 0.9){
            System.out.println("您的余额是"+ getMoney()+"，余额不足，请充值！");
            return;
        }
        setMoney(getMoney() - money * 0.9);
    }
}
