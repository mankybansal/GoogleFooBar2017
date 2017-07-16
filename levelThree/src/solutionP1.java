import java.math.BigInteger;

/**
 * Created by mayankbansal on 7/16/17.
 */
public class solutionP1 {

    public static int answer(String n) {
        BigInteger number = new BigInteger(n);
        int count = 0;

        while (!number.equals(BigInteger.valueOf(1))) {
            if ((number.mod(BigInteger.valueOf(2))).intValue() == 0)
                number = number.divide(BigInteger.valueOf(2));
            else {
                if (number.equals(BigInteger.valueOf(3)) || number.mod(BigInteger.valueOf(4)).intValue() == 1)
                    number = number.subtract(BigInteger.valueOf(1));
                else
                    number = number.add(BigInteger.valueOf(1));
            }
            count++;
        }

        return count;
    }

    public static void main(String args[]) {
        System.out.print(answer("23"));
    }


}