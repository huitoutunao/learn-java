import java.util.Scanner;
import java.util.Random;

public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        // 数组的静态初始化
        // 数据类型[] 数组名 = {元素1,元素2,元素3...}
        int[] studentAges = {12,13,14};
        String[] studentNames = {"张三","李四","王五"};
        double[] studentHeight = {168.98,170.8,180};
        // 数组元素的访问
        int age = studentAges[0];
        System.out.println(age);
        studentAges[2] = 100;
        System.out.println(studentAges[2]);
        // 数组遍历
        for (int i = 0; i < studentAges.length; i++) {
            System.out.println(studentAges[i]);
        }

        double sum = 0;
        for (int i = 0; i < studentHeight.length; i++) {
            sum = studentHeight[i] + sum;
        }
        System.out.println(sum);
    }
}