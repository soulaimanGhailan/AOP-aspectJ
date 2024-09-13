package buisness;

public interface AccountService {
    void addAccount(Account account);
    void deleteAccount(Account account);
    void sendMoney(Account account, double amount);
    void retrieveMoney(Account account , double amount);
    Account getAccount(int id);
}
