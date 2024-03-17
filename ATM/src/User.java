public class User {
    String name;
    Account acc;

    public User(String name, Account acc) {
        this.name = name;
        this.acc = acc;
    }

    public void debit(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
            // System.out.println(this.name + " Your Balance is:  " + acc.getBal());
        } else {
            int bal = acc.getBal();
            int remBal = bal - amount;
            acc.setBal(remBal);
            // System.out.println(this.name + " Your Remainig balance is " + remBal);
        }
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
            // System.out.println(this.name + " Your Balance is:  " + acc.getBal());
        } else {
            int totalBal = acc.getBal();
            int remBal = totalBal + amount;
            acc.setBal(remBal);
            // System.out.println(this.name + " Your Balance is:  " + acc.getBal());
        }
    }

    public void showdetails(){
        System.out.println(this.name + " your Account number is "+acc.getAccNum()+ "\n your balance is "+ acc.getBal());
    }

    public Account getAcc() {
        return acc;
    }
}
