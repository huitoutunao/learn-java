import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票的原价: ");
        int ticket = sc.nextInt();
        System.out.print("请输入当前月份: ");
        int month =  sc.nextInt();
        System.out.print("请输入当前购买舱位 0 头等舱 1 经济舱: ");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
            // 旺季
            ticket = computedTicket(seat, ticket, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // 淡季
            ticket = computedTicket(seat, ticket, 0.7, 0.65);
        } else {
            System.out.println("键盘录入的月份不合法。");
        }

        System.out.print("最终机票价" + ticket);
    }

    public static int computedTicket(int seat, int ticket, double v0, double v1) {
        if (seat == 0) {
            // 头等舱
            ticket = (int)(ticket * v0);
        } else if (seat == 1) {
            // 经济舱
            ticket = (int)(ticket * v1);
        } else {
            System.out.println("没有这个舱位。");
        }

        return ticket;
    }
}
