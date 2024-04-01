public class App extends Bank{
    public static void main(String[] args) throws Exception {
        AtmUser atmUser = new Bank();
        atmUser.changePin();

        NetBankingUser netBankUser = new Bank();
        netBankUser.creditCardBillPay();
        netBankUser.recharge();

        MobileBankingUser mobileBankUser = new Bank();
        mobileBankUser.recharge();
        
    }
}
