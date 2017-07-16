/**
 * Created by mayankbansal on 6/22/17.
 */
public class SolutionP1 {
    public static String answer(String plaintext) {
        String braille = "";

        String[] translate = {
                "000001", "100000", "110000", "100100",
                "100110", "100010", "110100", "110110",
                "110010", "010100", "010110", "101000",
                "111000", "101100", "101110", "101010",
                "111100", "111110", "111010", "011100",
                "011110", "101001", "111001", "010111",
                "101101", "101111", "101011", "000000"
        };


        for (char x : plaintext.toCharArray()) {
            if ((int) x == 32)
                braille += translate[27];
            else if (((int) x - 96) > 0)
                braille += translate[(int) x - 96];
            else
                braille += translate[0] + translate[(int) x - 96 + 32];
        }

        return braille;
    }

    public static void main(String args[]) {
        System.out.print(answer("The quick brown fox jumped over the lazy dog"));
    }
}
