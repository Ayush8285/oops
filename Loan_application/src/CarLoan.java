public class CarLoan extends Loan{
    private String carModel;

    public CarLoan(double principle, double interestRate, int years, String carModel) {
        super(principle, interestRate, years);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

}
