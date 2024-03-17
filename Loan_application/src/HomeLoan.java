public class HomeLoan extends Loan{
    private String propertyAddress;

    public HomeLoan(double principle,double interestRate,int years, String propertyAddress){
        super(principle, interestRate, years);
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }
}
