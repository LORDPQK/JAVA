package text1;

import java.util.Scanner;

public class TicketCmd {
    public TicketCmd() {
    }

    public static void main(String[] args) {
        int price = 2;
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.SetPrice(price);
        Scanner scanner = new Scanner(System.in);

        while(true) {
            boolean Flag = false;
            System.out.println("===============欢迎使用自动售票机===============");
            System.out.println("本机销售固定票价 " + price + " 元的车票");

            while(true) {
                System.out.println("请选择服务...");
                System.out.println("1、投币");
                System.out.println("2、打印车票");
                System.out.println("3、找零");
                System.out.println("reset 重置");
                System.out.println("turn off 关机");
                String input = scanner.nextLine();
                int a = -1;
                switch(input.hashCode()) {
                    case 49:
                        if (input.equals("1")) {
                            a = 0;
                        }
                        break;
                    case 50:
                        if (input.equals("2")) {
                            a = 1;
                        }
                        break;
                    case 51:
                        if (input.equals("3")) {
                            a = 2;
                        }
                        break;
                    case 108404047:
                        if (input.equals("reset")) {
                            a = 3;
                        }
                        break;
                    case 132657996:
                        if (input.equals("turn off")) {
                            a = 4;
                        }
                }

                switch(a) {
                    case 0:
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        if (amount < 0) {
                            System.out.println("请正常投币...");
                        } else {
                            ticketMachine.InsertMoney(amount);
                        }

                        System.out.println("当前余额：" + ticketMachine.GetBalance() + " 元");
                        break;
                    case 1:
                        ticketMachine.print();
                        System.out.println("当前余额：" + ticketMachine.GetBalance() + " 元");
                        if (ticketMachine.GetBalance() == 0) {
                            Flag = true;
                        }
                        break;
                    case 2:
                        System.out.println("请收好找零 " + ticketMachine.refund() + " 元");
                        Flag = true;
                        break;
                    case 3:
                        System.out.println("本次运营总收入 " + ticketMachine.getTotal() + " 元");
                        ticketMachine.reset();
                        System.out.println("============本机被重置============");
                        Flag = true;
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("请输入正确的功能序号");
                }

                if (Flag) {
                    break;
                }
            }
        }
    }
}
