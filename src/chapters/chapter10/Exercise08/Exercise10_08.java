package chapters.chapter10.Exercise08;

public class Exercise10_08 {
    public static void main(String[] args) {
        int[][] bracket_2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
        };
        int[][] bracket_2009 = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };


        double[] rate_2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        double[] rate_2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        Tax tax1 = new Tax(0, bracket_2001, rate_2001, 50000);
        Tax tax2 = new Tax(0, bracket_2009, rate_2009, 50000);


        print(tax1, 2001);
        System.out.println();
        print(tax2, 2009);
    }

    public static void print(Tax t, int year) {
        System.out.println("                       " + year + " Taxes" + "                       ");
        System.out.println("Income    Status 0     Status 1     Status 2     " + "Status 3");
        System.out.println("---------------------------------------------------------------");

        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%-10d", i);
            for (int j = 0; j < 4; j++) {
                t.setTaxableIncome(i);
                t.setFilingStatus(j);
                System.out.printf("%-8.2f     ", t.getTax());
            }
            System.out.println();
        }
    }
}
