package bank;

import java.math.BigDecimal;

public class SmallAccount implements ibank.Account {
    private final String accountNumber;
    private final String accountOwner;
    private BigDecimal balance;
    private final BigDecimal credit;

    public SmallAccount(String accountNumber, String accountOwner, BigDecimal balance, BigDecimal credit) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
        this.credit = credit;
    }

    @Override
    public String getNumber() {
        return accountNumber;
    }

    @Override
    public String getHolderName() {
        return accountOwner;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(BigDecimal amount) {
        balance = balance.add(amount);
        return true;
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        BigDecimal max = balance.add(credit);

        if(amount.compareTo(max) > 0) {return false;}

        balance = balance.subtract(amount);

        return true;
    }
}
