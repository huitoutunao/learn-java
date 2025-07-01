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

        // 数组动态初始化
        String[] arr = new String[10];
        arr[0] = "lisi";
        arr[1] = "zhangsan";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        // 数组默认初始化值的规律
        // 整数类型：默认初始化值0
        // 小数类型：默认初始化值0.0
        // 字符类型：默认初始化值 '/u0000'-空格
        // 布尔类型：默认初始化值 false
        // 引用类型：默认初始化值 null


        // 案例1：数组最大值
        int[] list1 = {33,30,2,50,99,20};
        int max = list1[0];
        for (int i = 1; i < list1.length; i++) {
            if (max < list1[i]) {
                max = list1[i];
            }
        }
        System.out.println("最大值：" + max);

        // 案例2：求和
        int[] list2 = {1,2,3,4,5};
        int sum2 = 0;
        for (int i = 0; i < list2.length; i++) {
            sum2 = list2[i] + sum2;
        }
        System.out.println("求和" + sum2);

        // 案例2：将数组中0索引和最大索引的值进行交换
        int[] list3 = {1,2,3,4,5};
        for (int i = 0, j = list3.length - 1; i < j; i++,j--) {
            int temp = list3[i];
            list3[i] = list3[j];
            list3[j] = temp;
        }

    }
}