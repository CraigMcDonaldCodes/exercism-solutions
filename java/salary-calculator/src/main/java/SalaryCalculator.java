public class SalaryCalculator {

    private static final int BASE_PAY = 1_000;
    private static final int MAX_PAY = 2_000;

    public double multiplierPerDaysSkipped(int daysSkipped) {

        var percent = daysSkipped > 5 ? 0.85 : 1.0;

        return percent;
    }

    public int multiplierPerProductsSold(int productsSold) {
    
        var multiplier = productsSold > 20 ? 13 : 10;

        return multiplier;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {

        var pay = (BASE_PAY * multiplierPerDaysSkipped(daysSkipped)) + bonusForProductSold(productsSold);
        pay = pay > MAX_PAY ? MAX_PAY : pay;

        return pay;
    } 
}
