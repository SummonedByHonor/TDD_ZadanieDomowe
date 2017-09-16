package Bank;

import java.math.BigDecimal;

/**
 * Created by Mateusz on 2017-09-15.
 */
public class Client {
    Account account;

    String name;

    public Client(String name) {
        this.name = name;
        account = new Account();
        account.setAccountFunds(BigDecimal.ZERO);
    }

    public Account getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setAccount(Account account) {
        this.account = account;


    }
}
