public class twoDarrays {
    public static void main(String[] args) {
        int [][] lotterycard = {{20, 15, 7},
                                {8, 7, 19},
                                {7, 13, 47}

        };
        // hard way to declare a 2d array
        int [][] lotterycard2 = new int[3][3];
        lotterycard2[0][0] = 20;
        lotterycard2[0][1] = 15;
        lotterycard2[0][2] = 15;
        lotterycard2[1][0] = 8;
        lotterycard2[1][1] = 7;
        lotterycard2[1][2] = 19;
        lotterycard2[2][0] = 7;
        lotterycard2[2][1] = 13;
        lotterycard2[2][2] = 47;

        System.out.println(lotterycard[0][1]);
        System.out.println(lotterycard2[2][2]);

        System.out.println("------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(lotterycard[i][i]);
        }

        System.out.println("-------------------------");

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.println(lotterycard[j][k]);
            }
        }
    }
}
