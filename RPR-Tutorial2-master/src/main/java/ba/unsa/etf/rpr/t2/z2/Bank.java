package ba.unsa.etf.rpr.t2.z2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * class for Bank
 * @author Hana Mahmutović
 */
public class Bank {
    private Long accountNumber;

    private List<User> users;

    private List<Employee> employee;

    public Bank() {
        this.users = new ArrayList<User>();
        this.employee = new ArrayList<Employee>();
    }

    public User createNewUser(String name, String lastName){
        User k = new User(name, lastName);
        this.users.add(k);
        return k;
    }

    public Employee createNewEmployee(String name, String lastName){
        Employee u = new Employee(name, lastName);
        this.employee.add(u);
        return u;
    }

    public Account createAccountForUser(User k){
        Account r = null;
        for (int i = 0; i < this.users.size(); i++){
            if (this.users.get(i).equals(k)){ // equals method defined on class User
                Long accountNumber = (new Random()).nextLong(); // generate random number for accountNumber
                r = new Account(accountNumber, this.users.get(i));
                break;
            }
        }
        return r;
    }
}