/**
 * Created by mayankbansal on 7/16/17.
 */
public class SolutionP3 {

    public static int answer(int start, int length) {
        int xor = 0;
        for (int i = 0, k = start, l = length; i < length; i++, l--)
            for (int j = 0; j < length; j++, k++)
                if (j < l)
                    xor = xor ^ k;
        return xor;
    }

    public static void main(String args[]) {
        System.out.println(answer(0, 3));
    }
}
