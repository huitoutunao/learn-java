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
    }
}
