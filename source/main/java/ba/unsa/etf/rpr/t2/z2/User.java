package ba.unsa.etf.rpr.t2.z2;

import java.util.Objects;

/**
 * Class for user of bank account
 *
 * @author Hana Mahmutović
 */
public class User extends Person {

    private Account account;

    public User(String name, String lastName) {
        super(name, lastName);
    }

    public void addAccount(Account account){
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(account, user.account);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}