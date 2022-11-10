package chapters.chapter10.Exercise08;

public class Tax {
    public static int SINGlE_FILER = 0;
    public static int MARRIED_JOINTLY_QUALIFYING_WIDOWER = 1;
    public static int MARRIED_SEPARATELY = 2;
    public static int HEAD_OF_HOUSEHOLD = 3;


    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;


    public Tax() {
        this(SINGlE_FILER, new int[][]{
                        {8350, 33950, 82250, 171550, 372950},
                        {16700, 67900, 137050, 208850, 372950},
                        {8350, 33950, 68525, 104425, 186475},
                        {11950, 45500, 117450, 190200, 372950}},
                new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35},
                50000.0);
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;
        double incomeTaxed = 0;
        if (this.rates.length >= 2) {
            for (int i = this.rates.length - 2; i >= 0; i--) {
                if (this.taxableIncome > this.brackets[this.filingStatus][i]) {
                    tax += (incomeTaxed = this.taxableIncome - this.brackets[this.filingStatus][i]) * this.rates[i + 1];
                    this.taxableIncome -= incomeTaxed;
                }
            }
        }
        return tax += brackets[filingStatus][0] * rates[0];
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
