public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        // 二进制前缀 0b
        // 十进制前缀 无
        // 八进制前缀 0
        // 十六进制前缀 0x
        System.out.println(0b10); // 二进制
        System.out.println(16); // 十进制
        // System.out.println(016); // 八进制
        System.out.println(0x123); // 十六进制

        // 任意进制转十进制
        // 公式：系数 * 基数的权次幂 相加
        // 系数：就是每一位上的数
        // 基数：当前进制数
        // 权：从右往左的下标值，依次是 0,1,2,3...

        // 十进制转任意进制
        // 除基取余法
        // 即不断的除以基数（几进制，基数是几）得到余数，直到商为0，再将余数倒着拼接起来
    }
}