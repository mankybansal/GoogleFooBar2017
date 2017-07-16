/**
 * Created by mayankbansal on 7/16/17.
 */
public class SolutionP2 {

    public static int answer(int n) {
        int[][] steps = new int[201][201];
        steps[1][1] = steps[2][2] = 1;

        for (int i = 3; i < 201; i++)
            for (int j = 1; j <= i; j++)
                if (i - j == 0)
                    steps[i][j] = 1 + steps[i][j - 1];
                else if (i - j > j)
                    steps[i][j] = steps[i - j][j - 1] + steps[i][j - 1];
                else if (i - j < j)
                    steps[i][j] = steps[i - j][i - j] + steps[i][j - 1];
                else if (i - j == j)
                    steps[i][j] = steps[j][j - 1] + steps[i][j - 1];

        return steps[n][n] - 1;
    }


    public static void main(String args[]) {
        System.out.print(answer(200));
    }

}
