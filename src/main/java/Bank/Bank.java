package Bank;

import java.math.BigDecimal;

/**
 * Created by Mateusz on 2017-09-15.
 */
public class Bank {

    public boolean checkAccountState(Client client) {
        if (client.getAccount().getAccountFunds() != null) {
            return true;
        }
        return false;
    }

    public void addFundsToAccount(Client client, BigDecimal funds){
        client.getAccount().setAccountFunds(client.getAccount().getAccountFunds().add(funds));
    }

    public void withdrawFunds(Client client, BigDecimal bigDecimal) {
        client.getAccount().setAccountFunds(client.getAccount().getAccountFunds().subtract(bigDecimal));

    }
}
