/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Account {

    public int ID;
    public String Username;
    public String Password;
    public int Phonenumber;
    public String Email;
    public double Balance;

    public Account(int ID, String Username, String Password, int Phonenumber, String Email, double Balance) {
        this.ID = ID;
        this.Username = Username;
        this.Phonenumber = Phonenumber;
        this.Email = Email;
        this.Balance = Balance;
        this.Password = Password;
    }

    public Account() {
        ID = 0;
        Username = " ";
        Phonenumber = 0;
        Email = " ";
        Balance = 50000;
        Password = " ";
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public int getPhonenumber() {
        return Phonenumber;
    }

    public String getEmail() {
        return Email;
    }

    public double getBalance() {
        return Balance;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhonenumber(int Phonenumber) {
        this.Phonenumber = Phonenumber;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public boolean deposit(double money) {
        if (money > 0) {
            Balance = Balance + money;
            System.out.println("The balance: " + Balance);
            return true;
        } else {
            System.out.println("==LOADING==");
            return false;
        }
    }
    public boolean withdraw(double money)
    {
        if(money < Balance && money >0)
        {
            Balance = Balance - money;
            System.out.println("The balance: "+ Balance);
            return true;
        }
        else
        {
            System.out.println("Balance must be larger than the money u withdraw");
            return false;
        }  
    }

    public void LoginInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID bank account: ");
        ID = sc.nextInt();
        System.out.println("Enter phonenumber: ");
        Phonenumber = sc.nextInt();
        System.out.println("Enter username: ");
        sc = new Scanner(System.in);
        Username = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        Password = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Enter email: ");
        sc = new Scanner(System.in);
        Email = sc.nextLine();
        System.out.println("Enter balance: ");
        double balanced = sc.nextFloat();
        Balance = Balance + balanced;
    }

    public void Output() {
        System.out.println("Username: " + Username + "-- Password: " + Password + "-- Phonenumber: " + Phonenumber + "-- Email: " + Email + "-- Balance: " + Balance);
    }

    public void SubMenuExchangingMoney() {
        int choice;
        System.out.println("====LOGIN ACCOUNT====");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Exit");
        System.out.println("Enter Choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the money u want to withdraw: ");
                double removemoney;
                removemoney = sc.nextDouble();
                if (withdraw(removemoney) == true) {
                    System.out.println("===LOADING===");
                } else {
                    System.out.println("Balance has to be larger than the money u deposit");
                }
                break;

            case 2:
                System.out.println("Enter the money u want to deposit: ");
                double addmoney;
                addmoney = sc.nextDouble();
                if (deposit(addmoney) == true) {
                    System.out.println("===LOADING===");
                } else {
                    System.out.println("Balance has to be larger than the money u deposit");
                }
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }

    @Override
    public String toString() {
        return "Account{" + "ID= " + ID + ", Username= " + Username + ", Password= " + Password + ", Phonenumber= " + Phonenumber + ", Email= " + Email + ", Balance= " + Balance + '}';
    }

}
