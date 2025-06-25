import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // 赋值运算符
        int a = 10;
        int b = 20;
        a += b;
        System.out.println(a);
        System.out.println(b);

        // 细节：+=、-=、*=、/=、%= 底层隐藏了个「强制类型转换」
        short s = 1;
        s += 1; // 等同于 s = (short)(s + 1)
        System.out.println(s);

        // 关系运算符
        int a2 = 10;
        int b2 = 10;
        System.out.println(a2 == b2);

        // 逻辑运算符
        System.out.println(true & true);
        System.out.println(true | false);
        System.out.println(false ^ true); // true
        System.out.println(true ^ true); // false
        System.out.println(!false); // true
        System.out.println(true && false); // false
        System.out.println(true || false); // true

        int r1 = 10;
        int r2 = 10;
        boolean res2 = ++r1 < 5 && ++r2 < 5;
        System.out.println(res2);
        System.out.println(r1);
        System.out.println(r2);

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数: ");
        int num1 = sc.nextInt();
        System.out.print("请输入另一个整数: ");
        int num2 = sc.nextInt();
        System.out.println(num1 == 6 || num2 == 6 || (num1+num2) % 6 == 0);

        int count1 = 10;
        int count2 = 20;
        int max = count1 > count2 ? count1 : count2;
        System.out.println(max);
    }
}
