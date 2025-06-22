public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        /*
        * 字面量类型
        * 1、整数类型
        * 2、小数类型
        * 3、字符串类型：用双引号括起来的内容。例："HelloWorld"
        * 4、字符类型：用单引号括起来的内容，只能有一个。例：'A'，'我'
        * 5、布尔类型：true false
        * 6、空类型：null
        * */

        // 整数类型
        System.out.println(666);

        // 小数类型
        System.out.println(9.99);

        // 字符串类型
        System.out.println("Hello World");

        // 字符类型
        System.out.println('A');

        // 布尔类型
        System.out.println(true);

        // 空类型
        // null 是不能直接打印
        System.out.println("null");

        /*
        * 特殊字符
        * \t：制表符，指的是打印的时候，把前面字符串的长度补齐到8，或者8的整数倍。最少补一个空格，最多补8个空格。
        * */
        System.out.println("name" + '\t' + "age");
        System.out.println("tomy" + '\t' + "element");
    }
}