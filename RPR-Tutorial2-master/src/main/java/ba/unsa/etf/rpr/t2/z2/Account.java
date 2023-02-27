package ba.unsa.etf.rpr.t2.z2;

/**
 * Class for Bank account
 * @author Hana Mahmutović
 */
public class Account {

    private Long accountNumber;
    private Person accountUser;
    private boolean overdraftApproval;
    private Double accountBalance;
    private Double overrun;

    public Account(Long accountNumber, Person accountUser){
        this.accountNumber = accountNumber;
        this.accountUser = accountUser;
    }

    public boolean checkOverdraftApproval(Double amount){
        return this.overrun > amount;
    }

    public boolean receivePayment(Double amount){
        this.accountBalance += amount;
        return true;
    }

    public boolean makePayment(Double amount){
        if (this.accountBalance + this.overrun < amount){
            return false;
        }else{
            this.accountBalance -= amount;
            return true;
        }
    }

    public void allowOverrun(Double amount){
        this.overrun = amount;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Person getAccountUser() {
        return accountUser;
    }

    public void setAccountUser(Person accountUser) {
        this.accountUser = accountUser;
    }

    public boolean isOverdraftApproval() {
        return overdraftApproval;
    }

    public void setOverdraftApproval(boolean overdraftApproval) {
        this.overdraftApproval = overdraftApproval;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Double getOverrun() {
        return overrun;
    }

    public void setOverrun(Double overrun) {
        this.overrun = overrun;
    }
}