package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Random;

@AllArgsConstructor
@Data()
@ToString()
public abstract class Account implements AccountActions {

    protected Integer agency;

    protected Integer number;

    protected Double balance;

    protected Client client;


    public Account() {
        Random random = new Random();
        this.agency = random.nextInt(1000);
        this.number = random.nextInt(3000);
    }

    @Override
    public void deposit(Double value) {
        this.setBalance(value);
    }

    @Override
    public void transfer(Double value, Account destinationAccount) {
        if (this.balance >= value) {
            this.setBalance(this.balance -= value);
            destinationAccount.setBalance(this.balance += value);
        } else {
            insufficientFundsMsg();
        }
    }

    @Override
    public void withdraw(Double value) {
        if (this.balance >= value) {
            this.setBalance(this.balance -= value);
        } else {
            insufficientFundsMsg();
        }
    }

    private void insufficientFundsMsg() {
        System.out.println("Insufficient balance for this operation.");
    }
}
