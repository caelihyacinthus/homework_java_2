package bank;

import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class SmallBank implements Bank {
    private final HashSet<Account> accounts = new HashSet<>();

    @Override
    public int getNumberOfAccounts() {
        return accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return accounts.stream().map(Account::getBalance).reduce(new BigDecimal(0), BigDecimal::add);
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return accounts;
    }

    @Override
    public Account openDebitAccount(String accountHolderName) {
//        if (getAccountByHolderName(accountHolderName) != null) {
//            return null;
//        }
//        int number = (int) (Math.random() * 1000);
//        Account account = new SmallAccount(String.valueOf(number), accountHolderName, new BigDecimal(0));
//        accounts.add(account);
        return openCreditAccount(accountHolderName, new BigDecimal(0));
    }

    @Override
    public Account openCreditAccount(String accountHolderName, BigDecimal credit) {
        if (getAccountByHolderName(accountHolderName) != null) {
            return null;
        }
        int number = (int) (Math.random() * 1000);
        Account account = new SmallAccount(String.valueOf(number), accountHolderName, new BigDecimal(0), credit);
        accounts.add(account);
        return account;
    }

    @Override
    public Account getAccountByHolderName(String accountHolderName) {
//        for (Account acc : accounts) {
//            if (Objects.equals(acc.getHolderName(), accountHolderName)) return acc;
//        }
        return accounts.stream().filter(acc -> acc.getHolderName().equals(accountHolderName)).findFirst().orElse(null);
    }

    @Override
    public Account getAccountByNumber(String accountNumber) {
        return accounts.stream().filter(acc -> acc.getNumber().equals(accountNumber)).findFirst().orElse(null);
    }

    @Override
    public void closeAccount(Account account) {
        accounts.remove(account);
    }
}
