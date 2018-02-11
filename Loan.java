/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank3;

/**
 *
 * @author Danish Bangash
 */
public class Loan {

    private int balance;
    private int IBAN;
    private String name;
    Deposit deposit1;

    public int getBalance() {
        return balance;
    }

    public void setBanlance(int loan) {
        this.balance = loan;
    }

    public int getIBAN() {
        return IBAN;
    }

    public void setIBAN(int IBAN) {
        this.IBAN = IBAN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Loan(String name, int IBAN) {
        this.IBAN = IBAN;
        this.name = name;
        int balance = 0;
        this.balance = balance;
    }

    public void deposit(int money) {
                
           
        this.balance = this.balance + money; /////// fixed cuz it show minus the money withdrwn form the total balance 
    }
}

    
