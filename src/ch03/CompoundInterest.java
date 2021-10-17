package ch03;

public class CompoundInterest {

    public static void main(String[] args) {
        // 10 years X 6 kinds of rates 2D array
        final double STARTRATE = 10;        // the baseline interest rate is 10%
        final int NRATES = 6;       // 6 types of interest rates
        final int NYEARS = 10;      // 10 years to save money

        double[] interestRate = new double[NRATES];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i] = (STARTRATE + i) / 100.0;
        }

        double[][] balances = new double[NYEARS][NRATES];

        for (int i = 0; i < balances[0].length; i++) {
            balances[0][i] = 10000;
        }

        for (int i = 0; i < balances[0].length; i++) {
            for (int j = 1; j < balances.length; j++) {
                balances[j][i] = balances[j - 1][i] * (1 + interestRate[i]);
            }
        }

        for (int i = 0; i < interestRate.length; i++) {
            System.out.printf("%9.0f%%", 100 * interestRate[i]);
        }
        System.out.println();

        for (double[] row: balances) {
            for (double balance : row) {
                System.out.printf("%10.2f", balance);
            }
            System.out.println();
        }

    }
}
