import java.util.Scanner;

public class Atm_machine {
    public static void main(String[] args) throws Exception {
        int[] accounts = { 1234, 2345, 2345, 7665 };

        User[] users = {
                new User("ram", new Account(accounts[0], 2000)),
                new User("shyam", new Account(accounts[1], 3000)),
                new User("den", new Account(accounts[2], 4000)),
                new User("rohan", new Account(accounts[3], 5000)),
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number ");
        int user_acc = sc.nextInt();
        User user = null;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == user_acc) {
                user = users[i];
                break;
            }

        }
        if(user == null){
            System.out.println("Invalid user  ");
        }

        if (user != null) {
            System.out.println("Enter amount for debit from account: " + user.getAcc().getAccNum());
            int debit = sc.nextInt();
            user.debit(debit);
        }
        if (user != null) {
            System.out.println("Enter amount for deposit from account: " + user.getAcc().getAccNum());
            int deposit = sc.nextInt();
            user.deposit(deposit);
        }
    

        sc.close();
    }
}
