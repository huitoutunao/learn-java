import java.util.Scanner;

public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        // 算术运算符
        System.out.println(1 + 1);
        System.out.println(2 - 1);
        System.out.println(3 * 2);
        // 如果在计算的时候有小数参与
        // 在代码中，如果有小数参与计算，结果有可能不精确
        System.out.println(1.1 + 1.1); // 2.2
        System.out.println(1.1 + 1.01); // 2.1100000000000003
        System.out.println(1.1 - 1.01); // 0.09000000000000008
        System.out.println(1.1 * 1.01); // 1.1110000000000002
        // 除法
        // 结论1：整数参与技术，结果只能得到整数；
        // 结论2：小数参与计算，结果有可能不精确；
        System.out.println(10 / 2); // 5
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333333333333335
        // 取模或取余
        // 应用场景
        // A 是否可以被 B 整除；可以判断 A 是否为偶数；
        System.out.println(10 % 2);
        System.out.println(10 % 3);

        System.out.println("------------------------分割线---------------------------");
        // 案例1：控制台输入 123，分别打印 个 十 百 位的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();
        int g = number % 10;
        int s = number / 10 % 10;
        int b = number / 100 % 10;
        System.out.println("百位" + b + "十位" + s + "个位" + g);

        System.out.println("------------------------分割线---------------------------");
        // 隐式类型转换
        int i1 = 10;
        double d1 = 10.0;
        double res = i1 + d1; // 结果被转成 double 类型
        System.out.println(res);
        // 强制类型转换
        byte b1 = 10;
        byte b2 = 10;
        byte res2 = (byte) (b1 + b2);
        System.out.println(res2);

        byte b3 = 100;
        byte b4 = 100;
        byte res3 = (byte) (b3 + b4);
        System.out.println(res3); // 结果出现异常，因为超出了 byte 的取值范围

        char c3 = 'a'; // 运算时会提升 int 类型，对应 ASCII 码表对应的 97 值
        int res4 = c3 + 0;
        System.out.println(res4);

        // 自增自减
        int z = 10;
        int r = z++; // 先用后加
        System.out.println(r); // 10
        int z2 = 10;
        int r2 = ++z2; // 先加后用
        System.out.println(r2); // 11
    }
}