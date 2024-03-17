public class Account {
    private int accNum;
    private int bal;

    Account(int acc_num,int bal){
        this.accNum=acc_num;
        this.bal=bal;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public int getAccNum() {
        return accNum;
    }

    public int getBal() {
        return bal;
    }

    // public String showDetails(){
    // return "Account :" + this.accNum + " , Bal: "+ this.bal;
    // }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Account [acc_num =" + accNum + ", bal= "+ bal +" ]";
        }
}
