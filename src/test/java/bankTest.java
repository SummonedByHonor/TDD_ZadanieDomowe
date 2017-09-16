import Bank.Account;
import Bank.Bank;
import Bank.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Mateusz on 2017-09-15.
 */
public class bankTest {

    Client client;
    Bank bank;

    @Before
    public void setup() {
        client = new Client("klient Jacek");
        bank = new Bank();
    }


    @Test
    public void shouldReturnTrueIfAccountIsNotEmpty(){
        //given
        client = new Client("klient Jacek");
        client.getAccount().setAccountFunds(BigDecimal.valueOf(30.00));

        //when
        bank.checkAccountState(client);

        //then
        assertThat(client.getAccount().getAccountFunds()).isPositive();
    }

    @Test
    public void shouldWithdrawFromAccount() {
        //given
        client = new Client("klient Adam");
        client.getAccount().setAccountFunds(BigDecimal.valueOf(30.00));

        //when
        bank.withdrawFunds(client, BigDecimal.valueOf(15.00));

        //then
        assertThat(client.getAccount().getAccountFunds()).isEqualTo(BigDecimal.valueOf(15.00));
    }

    @Test
    public void shouldAddFundsToAccount(){
        //given
        client = new Client("klient Antoni");
        BigDecimal accountStateBeforeTransfer = client.getAccount().getAccountFunds();

        //when
        bank.addFundsToAccount(client, BigDecimal.valueOf(300));

        //then
        assertThat(client.getAccount().getAccountFunds()).isEqualTo(accountStateBeforeTransfer.add(BigDecimal.valueOf(300)));
    }
}
