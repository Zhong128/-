package Dome;

public class goldCard extends  Card{
    public goldCard(String name, String carID, double money, String phone) {
        super(name, carID, money, phone);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前使用金卡消费金额:"+ money);
        System.out.println("优惠后的价格是:"+ money*0.8);
        //判断余额是否充足
        if(getMoney()< money * 0.8){
            System.out.println("您的余额是"+ getMoney()+"，余额不足，请充值！");
            return;
        }
        //更新金卡余额(注意此时不能直接.money,因为此方法在父类中，不能直接使用)
        setMoney(getMoney()-money*0.8);
        System.out.println("您当前金卡余额是:"+ getMoney());
        if (money * 0.8 >=200){
            printTicket();
        }else {
            System.out.println("您消费未满200，不能免费洗车！");
        }

    }

    public void printTicket(){
        System.out.println("您消费已满200，可前往打印洗车票!");
    }
}
