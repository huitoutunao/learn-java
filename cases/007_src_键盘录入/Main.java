// 导包
import java.util.Scanner;

public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        // 创建对象，表示我现在准备要用 Scanner 类
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数1：");
        // 接收键盘录入的数据
        int i = sc.nextInt();
        System.out.println("请输入整数2：");
        int n = sc.nextInt();
        System.out.println(i + n);
    }
}