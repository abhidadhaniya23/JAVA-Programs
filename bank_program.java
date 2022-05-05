import java.util.*;
/*
Write a program for creating a Bank class, which is used to manage the bank
account of customers. Class has two methods, Deposit () and withdraw (). Deposit
method display old balance and new balance after depositing the specified amount.
Withdrew method display old balance and new balance after withdrawing. If
balance is not enough to withdraw the money, it throws ArithmeticException and
if balance is less than 500rs after withdrawing then it throw custom exception,
NotEnoughMoneyException.
*/

class NotEnoughMoneyException extends Exception {
    String msg;

    NotEnoughMoneyException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}

class bank extends Exception {
    String name;
    float balance;

    bank(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(float amount) {
        System.out.println("Your old balance is " + balance);
        balance = balance + amount;
        System.out.println("Your new balance is " + balance);
    }

    void withdraw(float amount) {
        System.out.println("your old balance is " + balance);
        balance = balance - amount;

        try {
            if (amount > balance) {
                ArithmeticException exc = new ArithmeticException("Insufficient balance!");
                throw exc;
            } else {
                System.out.println("your new balance is " + balance);
                try {
                    if (balance < 500) {
                        NotEnoughMoneyException exc = new NotEnoughMoneyException("Balance < 500");
                        throw exc;
                    }
                } catch (NotEnoughMoneyException exc) {
                    System.out.println(exc);
                }
            }
        } catch (ArithmeticException exc) {
            System.out.println(exc);
        }

    }

}

public class bank_program {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        bank b = new bank("MBIT", 2000);
        b.withdraw(1900);

    }
}
