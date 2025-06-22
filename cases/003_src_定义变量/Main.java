public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        // 定义变量
        // 数据类型 变量名 = 数据值
        // 数据类型：限定了变量能存储数据的类型
        // int(整数) double(小数)
        // 变量名：就是存储空间的名字
        // 作用：方便以后使用
        // 数据值：真正存在变量中的数据
        // 等号：赋值。把右边的数据赋值给左边的变量。

        int a = 6;
        System.out.println(a);

        String b = "Hello World";
        System.out.println(b);

        int c1 = 1;
        int c2 = 2;
        System.out.println(c1 + c2);

        String d = "Hello";
        d = "Hello Two";
        System.out.println(d);

        // 注意事项
        // 在一条语句中，可以定义多个变量
        int e = 100, f = 200, g = 300; // 不推荐这么写
        System.out.println(e + f + g);

        // 变量在使用之前，一定要赋值
        int h = 400;
        System.out.println(h);

        // 公交车乘客案例
        int count = 0;
        count += 1;
        System.out.println("公交车乘客数量" + count);
    }
}