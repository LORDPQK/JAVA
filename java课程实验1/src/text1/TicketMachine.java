package text1;

public class TicketMachine {
    private int price;
    private int balance;
    private int total;

    public TicketMachine (){}//构造函数

    void SetPrice(int price)//设置票价
    {
        this.price = price ;
    }

    void InsertMoney(int amount)//投币金额
    {
        this.balance += amount ;
    }

    int  GetBalance()//查询余额
    {
        return this.balance;
    }

    void print()
    {
        System.out.println("==============================");
        System.out.println("This is a ticket");
        System.out.println("price : " + this.price);
        System.out.println("==============================");
        this.balance -= this.price;
        this.total += this.price;
    }

    int refund()
    {
        int result = this.balance;
        this.balance = 0;
        return result;
    }

    int getTotal()
    {
        return this.total;
    }

    void reset() {
        this.balance = 0;
        this.total = 0;
    }

    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.SetPrice(2);
        ticketMachine.InsertMoney(-10);
        System.out.println("balance : " + ticketMachine.GetBalance());
        ticketMachine.print();
        ticketMachine.print();
        System.out.println("balance : " + ticketMachine.GetBalance());
        System.out.println("refund : " + ticketMachine.refund());
        System.out.println("total : " + ticketMachine.getTotal());
    }


}
