package com.bank;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc= new Scanner(System.in);

        while(true)
        {
            System.out.println("Input 11 to see option");
            String str= sc.nextLine();
            switch(Integer.parseInt(str))
            {
                case 1:
                    bank.AccountOpen();
                    break;
                case 2:
                    bank.AccountClose();
                    break;
                case 3:
                    bank.Deposite();
                    break;
                case 4:
                    bank.Withdrawn();
                    break;
                case 5:
                    bank.Transfer();
                    break;
                case 6:
                    bank.CheckBalance();
                    break;
                case 8:
                    bank.AllCustomers();
                    break;
                case 0:
                    exit(0);
                    break;
                case 11:
                    System.out.println("Input option");
                    System.out.println("1. Open Account");
                    System.out.println("2. Close Account");
                    System.out.println("3. Deposite");
                    System.out.println("4. Withdrawn");
                    System.out.println("5. Transfer");
                    System.out.println("6. Balance Check");
                    System.out.println("7. Statement");
                    System.out.println("8. All customers");
                    System.out.println("9. Active customers");
                    System.out.println("0. Exit");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
}
