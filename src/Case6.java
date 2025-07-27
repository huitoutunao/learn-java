public class Case6 {
    public static void main(String[] args) {
        // 二维数组静态初始化
        // int[][] arr = new int[][] {{1,2},{3,4}};
        int[][] arr = {
            {1,2},
            {3,4}
        };

        System.out.println(arr[0][1]);

        // 二维数组动态初始化
        int[][] list = new int[3][5];
        list[0][0] = 10;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
