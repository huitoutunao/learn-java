import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    // 这是 main 方法，表示程序的主入口
    public static void main(String[] args) {
        // 调用方法
        // playGame();
        sum(10, 20);
        getArea(2.14);
        int sum1 = getSum(10,20,30);
        System.out.println(sum1);
        compare(1, 2);



        /* System.out.println("abc"); // 先打印abc，再换行
        System.out.print("abc"); // 只打印abc，不换行
        System.out.println(); // 不打印，只做换行 */
        int [] arr = {10, 20, 30, 40, 50};
        printArr(arr);


        int max = getMax(arr);
        System.out.println(max);

        boolean isContains = contains(arr, 50);
        System.out.println(isContains);

        int[] copyArr = copyOfRange(arr, 1, 2);
        System.out.println(Arrays.toString(copyArr));
    }

    // 定义一个方法
    public static void playGame() {
        System.out.println("选人物");
        System.out.println("开局");
    }

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("求和" + sum);
    }

    // 圆面积
    public static void getArea(double r) {
        double result = r * r * 3.14159;
        System.out.println("圆的面积" + result);
    }

    // 定义返回值方法
    public static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // 定义方法重载
    public static void compare(byte b1, byte b2) {
        System.out.println(b1 == b2);
    }
    public static void compare(short b1, short b2) {
        System.out.println(b1 == b2);
    }
    public static void compare(long b1, long b2) {
        System.out.println(b1 == b2);
    }
    public static void compare(int b1, int b2) {
        System.out.println(b1 == b2);
    }

    public static void printArr(int [] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    public static int getMax(int [] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static boolean contains(int [] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] copy = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            copy[index++] = arr[i];
        }

        return copy;
    }
}