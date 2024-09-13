package test;

import buisness.Account;
import buisness.AccountService;
import buisness.AccountServiceImpl;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
           start();
    }

    public static void start(){
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        AccountService service = new AccountServiceImpl() ;
        System.out.print("give the account code : ");
        int id = sc.nextInt();
        System.out.print("give the account balance : ");
        double balance = sc.nextDouble();
        account.setBalance(balance);
        account.setId(id);
        service.addAccount(account);

        while (true){
            System.out.print("your choice :  s to send money  / r to retrieve money / q to quit: ");
            String choice = sc.nextLine();
            if ("s".equals(choice)) {
                System.out.print("enter how much money you want to send : ");
                double money = sc.nextDouble();
                service.sendMoney(account , money);
            }
            else if ("r".equals(choice)) {
                System.out.print("how much money you want to retrieve money : ");
                double money = sc.nextDouble();
                service.retrieveMoney(account , money);
            }
            else if ("q".equals(choice)) {
                break;
            }
            System.out.println(account);
        }


    }


}
