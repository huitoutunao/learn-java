import java.util.Random;

public class Case2 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII码表
            if (i <= 25) {
                // 小写字母
                chs[i] = (char)(97 + i);
            } else {
                // 大写字母
                chs[i] = (char)(65 + i - 26);
            }
        }

        // 随机抽取数组索引
        String result = "";
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            int count = rand.nextInt(chs.length);
            result = result + chs[count];
        }

        int number = rand.nextInt(10);
        result += number;

        System.out.println(result);
    }
}
