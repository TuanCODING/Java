/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccountList;

import BankAccount.Account;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class BankAccountList {
    ArrayList<Account> list;
    public BankAccountList()
    {
        list  = new ArrayList<>();
    }
    public void addAccount(Account x)
    {
        list.add(x);
    }
    public Account findAccount(String username, String password)
    {
        for (Account account : list) 
            if(account.getUsername().equals(username) && account.getPassword().equals(password))
                return account;
        return null;
    }
    public void displayAll()
    {
        for (Account products : list) {
            products.Output();
        }
    }
}
