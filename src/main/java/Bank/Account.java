package Bank;

import java.math.BigDecimal;

/**
 * Created by Mateusz on 2017-09-15.
 */
public class Account {

    int number;

    BigDecimal accountFunds;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getAccountFunds() {
        return accountFunds;
    }

    public void setAccountFunds(BigDecimal accountFunds) {
        this.accountFunds = accountFunds;
    }
}
