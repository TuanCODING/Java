/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import BankAccount.Account;
import BankAccountList.BankAccountList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Testing {

    public static void mainMenu() {
        System.out.println("1. Add a new bank account");
        System.out.println("2. Get back the money");
        System.out.println("3. Display all bank accounts");
        System.out.println("4. Exit");
        System.out.println("Enter choice: ");
    }

    public static void main(String[] args) {
        int choice;
        boolean ok = true;
        BankAccountList lst = new BankAccountList();
        do {
            Scanner sc = new Scanner(System.in);
            try {
                mainMenu();
                choice = sc.nextInt();
                System.out.println(choice);
                if (choice < 0) {
                    throw new Exception();
                }
                ok = false;
                switch (choice) {
                    case 1:
                        ok = true;
                        Account acc = new Account();
                        acc.LoginInput();
                        lst.addAccount(acc);
                        break;
                    case 2:
                        ok = true;
                        System.out.println("1. Login");
                        System.out.println("2. Back the main menu");
                        System.out.println("Enter choice: ");
                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("Enter username: ");
                                sc = new Scanner(System.in);
                                String username = sc.nextLine();
                                System.out.println("Enter password: ");
                                sc = new Scanner(System.in);
                                String password = sc.nextLine();
                                Account kq = lst.findAccount(username, password);
                                if (kq == null) {
                                    System.out.println("Not find the account you type in");
                                } else {
                                    System.out.println("=====LOADING=====");
                                        kq.SubMenuExchangingMoney();
                                }
                                break;
                            case 2:
                                mainMenu();
                                choice = sc.nextInt();
                                break;
                            default:
                                System.out.println("Over Number");
                                break;
                        }
                        break;
                    case 3:
                        ok = true;
                        lst.displayAll();
                        break;
                    case 4:
                        ok = true;
                        System.exit(0);
                        break;
                    default:
                        ok = true;
                        System.out.println("Please Type It Again");
                        break;
                }
            } catch (InputMismatchException ee) {
                System.out.println("Wrong Input");
                ok = true;
            } catch (Exception eeer) {
                System.out.println("Please Choice Must Be Larger than 0");
                ok = true;
            }
        } while (ok);
    }
}
