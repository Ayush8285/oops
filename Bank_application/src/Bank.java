public class Bank implements MobileBankingUser,NetBankingUser,AtmUser {

    @Override
    public void recharge() {
        System.out.println("money deposit");
    }

    @Override
    public void creditCardBillPay(){
        System.out.println("Your bill");
    }

    @Override
    public void changePin() {
        System.out.println("Pin change");
    }

    

}
