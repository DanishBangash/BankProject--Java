
/**
 */
package bank3;

/**
 *
 * @author Danish Bangash
 */
public class OverDraft {

    private int balance;
    private int IBAN;
    private String name;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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

    public OverDraft(String name, int IBAN) {
        this.IBAN = IBAN;
        this.name = name;
        int balance = 0;
        this.balance = balance;
    }

    public void deposit(int money) {

        this.balance = this.balance + money; /////// fixed cuz it show minus the money withdrwn form the total balance 

    }
    public void withDraw(int money) {

        if (this.balance > -2000) {

            if (this.balance - money < -2000) {

                System.out.println("No Enough Balance");


            } else {

                this.balance = this.balance - money;

            }
        } else {

            System.out.println("No Balance");
        }

    }
}
