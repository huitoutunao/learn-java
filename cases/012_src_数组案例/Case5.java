import java.util.Random;

public class Case5 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int [] newArr = new int[arr.length];
        Random random = new Random();
        for (int i = 0; i < 5;) {
            int randomIndex = random.nextInt(arr.length);
            int prize = arr[randomIndex];
            if (!contains(newArr, prize)) {
                newArr[i] = prize;
                i++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
