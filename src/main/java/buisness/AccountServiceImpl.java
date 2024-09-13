package buisness;

import java.util.HashMap;
import java.util.Map;

public class AccountServiceImpl implements AccountService {
    private Map<Integer, Account> accounts = new HashMap<>();
    @Override
    public void addAccount(Account account) {
        accounts.put(account.getId() , account) ;
    }

    @Override
    public void deleteAccount(Account account) {
        accounts.remove(account.getId());
    }

    @Override
    public void sendMoney(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void retrieveMoney(Account account, double amount) {
        account.setBalance(account.getBalance() - amount);
    }

    @Override
    public Account getAccount(int id) {
        return accounts.get(id);
    }
}
