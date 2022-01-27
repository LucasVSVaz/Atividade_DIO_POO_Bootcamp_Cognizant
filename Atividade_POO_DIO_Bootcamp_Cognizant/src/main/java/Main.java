import entities.Account;
import entities.AccountCC;
import entities.Client;

public class Main {
    public static void main(String[] args) {


        Account accountCC = new AccountCC();
        accountCC.setClient(new Client("Lucas"));
        accountCC.deposit(200.0);

        System.out.println(accountCC);



        Account accountCP = new AccountCC();
        accountCP.setClient(new Client("Marilene"));
        accountCP.deposit(50.0);

        System.out.println(accountCP);



        System.out.println("------------------------");

//        accountCC.withdraw(100.0);

        accountCC.withdraw(10.0);
        System.out.println(accountCC);

        System.out.println(accountCP);
    }
}
