import java.util.Scanner;
import java.util.Random;

public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        // for 循环
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        // 案例：回文数
        // 121 就是回文数，从左到右，从右到左读都一样
        int x = 121;
        int temp = x;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num == temp);

        // 跳过循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // continue; // 结束本次循环，继续下次循环
                break; // 跳出循环体
            }
            System.out.println(i);
        }

        // 随机数
        Random r = new Random();
        int number = r.nextInt(100) + 1; // 1~100
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字");
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("猜中了");
                break;
            } else if (guess > number) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }
    }
}