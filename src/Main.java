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
    }
}