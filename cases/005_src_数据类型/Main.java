public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        // byte
        byte b = 10;
        System.out.println(b);

        // short
        short s = 10;
        System.out.println(s);

        // int
        int i = 1000;
        System.out.println(i);

        // long
        // 如果要定义 long 类型的变量
        // 在数据值的后面需要加一个 L 作为后缀
        // L 大小写都可以，建议使用大写
        long l = 9999999999L;
        System.out.println(l);

        // float
        // 如果要定义 float 类型的变量
        // 在数据值的后面需要加一个 F 作为后缀
        float f = 1.1F;
        System.out.println(f);

        // double
        double d = 10.1;
        System.out.println(d);

        // char
        char c = 'a';
        System.out.println(c);

        // boolean
        boolean bool = true;
        System.out.println(bool);

        // 案例1，定义基础信息
        String name = "LH";
        int age = 18;
        char gender = '男';
        double height = 180.1;
        boolean single = false;
        System.out.println(name + age + gender + height + single);
    }
}