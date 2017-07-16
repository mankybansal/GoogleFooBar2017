import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by mayankbansal on 7/15/17.
 */
public class solutionP2 {

    public static int convert(String[] parts) {
        if (parts.length == 3)
            return Integer.parseInt(parts[0]) * 1000000 + Integer.parseInt(parts[1]) * 1000 + Integer.parseInt(parts[2]);
        else if (parts.length == 2)
            return Integer.parseInt(parts[0]) * 1000000 + Integer.parseInt(parts[1]) * 1000;
        else
            return Integer.parseInt(parts[0]) * 1000000;
    }

    public static int versionCompare(String v1, String v2) {
        int v1Sum, v2Sum;
        String[] v1Parts = v1.split("[.]"), v2Parts = v2.split("[.]");
        v1Sum = convert(v1Parts);
        v2Sum = convert(v2Parts);
        if (v1Sum > v2Sum) return 1;
        else if (v1Sum == v2Sum) {
            if(v1Parts.length > v2Parts.length)
                return 1;
            else if(v1Parts.length == v2Parts.length)
                return 0;
            else return -1;
        }
        else return -1;
    }

    public static String[] answer(String[] l) {

        for (int i = 0; i < l.length; i++)
            for (int j = 0; j < l.length - 1; j++)
                if (versionCompare(l[j], l[j + 1]) == 1) {
                    String temp = l[j];
                    l[j] = l[j + 1];
                    l[j + 1] = temp;
                }
        return l;
    }

    public static void main(String args[]) {
        String x[] = {"1", "1.0.0", "1.0", "1.0.12", "1.0.2"};
        x = answer(x);

        for (String x1 : x)
            System.out.print(x1 + ", ");
    }

}
