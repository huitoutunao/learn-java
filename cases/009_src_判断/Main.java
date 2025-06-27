import java.util.Scanner;

public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = sc.nextInt();
        if (n > 2) {
            System.out.println("小伙子不错哦");
        }

        String val = "拉面";
        switch(val) {
            case "面包":
                System.out.println("面包");
                break;
            case "拉面":
                System.out.println("拉面");
                break;
            default:
                System.out.println("汉堡包");
                break;
        }

        int count = 1;
        switch (count) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("default");
        }

        // 案例
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n2 = sc2.nextInt();
        switch (n2) {
            case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6,7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个日期");
                break;
        }
    }
}