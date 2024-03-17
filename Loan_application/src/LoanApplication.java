import java.util.Scanner;

public class LoanApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[5];

        people[0] = new Person("John", 35, true, false);
        people[1] = new Person("Jack", 45, false, false);
        people[2] = new Person("Jacky", 55, true, false);
        people[3] = new Person("Billy", 70, true, false);
        people[4] = new Person("David", 25, true, false);

        for (Person person : people) {
            System.out.println(person.getName() + ", do you want to take a loan? (yes/no)");
            String wantsLoanInput = sc.nextLine();
            boolean wantsLoan = wantsLoanInput.equalsIgnoreCase("yes");

            System.out.println("Checking eligibility for " + person.getName() + ":");
            if (person.getAge() <= 80 && person.isGraduate() && wantsLoan) {
                System.out.println("Eligible for Loan :");

                if (person.getName().equals("John") || person.getName().equals("Jacky")) {
                    // home loan
                    HomeLoan homeLoan = new HomeLoan(2000000, 4.5, 20, "Delhi");
                    double homeTotalPayment = homeLoan.calculateTotalPayment();
                    System.out.println("Total payment for the home loan: $" + homeTotalPayment);
                    System.out.println("Property Address: " + homeLoan.getPropertyAddress());
                } else {
                    // Car loan
                    CarLoan carLoan = new CarLoan(25000, 6.0, 5, "Audi");
                    double carTotalPayment = carLoan.calculateTotalPayment();
                    System.out.println("Total Payment for the car loan: $" + carTotalPayment);
                    System.out.println("Car model: " + carLoan.getCarModel());
                }
            }else{
                System.out.println("Not Eligible for loan or doesn't want a loan. ");
            }
            System.out.println();
        }
        sc.close();

    }
}
