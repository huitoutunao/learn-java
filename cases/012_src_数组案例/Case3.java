import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        int[] scores = getScores();
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        int maxVal = getScoreMax(scores);
        int minVal = getScoreMin(scores);
        int sumVal = getScoreSum(scores);
        int avg = (sumVal - maxVal - minVal) / (scores.length - 2);
        System.out.println("平均分"+avg);
    }

    public static int getScoreSum(int[] scores) {
        int sum = 0;
        for (int i = 1; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        return sum;
    }

    public static int getScoreMax(int[] scores) {
        int maxVal = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxVal) {
                maxVal = scores[i];
            }
        }

        return maxVal;
    }

    public static int getScoreMin(int[] scores) {
        int minVal = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > minVal) {
                minVal = scores[i];
            }
        }

        return minVal;
    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委打分：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，请重新录入，当前i为：" + i);
            }
        }
        return scores;
    }
}
