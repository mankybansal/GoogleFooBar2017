public class solutionP1 {

    public static int answer(int total_lambs) {
        int powSum, powTwo, fibo[] = {
            1, 2, 4, 7, 12, 20, 33, 54, 88, 143, 232, 376, 609, 986, 1596, 2583, 4180, 6764,
            10945, 17710, 28656, 46367, 75024, 121392, 196417, 317810, 514228, 832039,
            1346268, 2178308, 3524577, 5702886, 9227464, 14930351, 24157816, 39088168,
            63245985, 102334154, 165580140, 267914295, 433494436, 701408732, 1000000001
        };

        powTwo = (int) Math.floor(Math.log(total_lambs) / Math.log(2));
        powSum = (int) Math.pow(2, powTwo) - 1;

        if ((total_lambs - powSum) >= (int) Math.pow(2, powTwo - 1) + (int) Math.pow(2, powTwo - 2))
            powTwo++;

        for (int i = 0; i < fibo.length; i++)
            if (fibo[i] > total_lambs)
                return (i - powTwo);
            else if (fibo[i] == total_lambs)
                return (i - powTwo + 1);

        return 0;
    }

    public static void main(String args[]) {
        System.out.println(answer(10));
    }

}
