public class Loan {
    protected double principle;
    protected double interestRate;
    protected int years;

    public Loan(double principle , double interestRate , int years){
        this.principle=principle;
        this.interestRate=interestRate;
        this.years=years;
    }

    public double calculateTotalPayment(){
        double monthlyInterestRate = interestRate / 12 / 100;
        int numberOfPayments = years * 12 ;
        double monthlyPayment = (principle * monthlyInterestRate) / (1 - Math.pow(monthlyInterestRate, numberOfPayments));
        return monthlyPayment * numberOfPayments;
    }
}
