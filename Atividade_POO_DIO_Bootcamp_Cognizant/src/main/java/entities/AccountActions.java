package entities;

public interface AccountActions {

    void deposit(Double value);

    void transfer(Double value, Account destinationAccount);

    void withdraw(Double value);
}
