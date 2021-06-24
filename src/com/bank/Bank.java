package com.bank;

import java.util.*;

public class Bank {
    static int AccountNo = 1000;
    public HashMap<Integer, Account> AccounList = new HashMap<Integer, Account>();;

    public void AccountOpen()
    {
        System.out.println("Please! provide following details enter details one by one");
        System.out.println("Name, Address, Aadhar, Deposite");

        Scanner sc= new Scanner(System.in);

        String Name= sc.nextLine();
        String Address= sc.nextLine();
        String AadharTemp= sc.nextLine();
        int Aadhar = Integer.parseInt(AadharTemp);
        String BalanceTemp= sc.nextLine();
        double Balance = Double.parseDouble(BalanceTemp);

        Account account = new Account(Name,Address,Aadhar, Balance);
        AccounList.put(AccountNo++, account);
        //System.out.println(account.getName()+" "+account.getAddress()+" "+account.getAadhar()+" "+account.getBalance()+" "+account.isStatus());
        System.out.println("Account added");
    }

    public void AccountClose()
    {
        System.out.println("Please! provide following account no");

        Scanner sc= new Scanner(System.in);
        String TempAccountNo= sc.nextLine();
        int AccountNo = Integer.parseInt(TempAccountNo);

        AccounList.remove(AccountNo);
        System.out.println("Account deleted");
    }

    public void AllCustomers()
    {
        for(Map.Entry<Integer, Account> entry:this.AccounList.entrySet()){
            int key=entry.getKey();
            Account b=entry.getValue();
            System.out.println("Account No : "+key);
            System.out.println("Name "+b.getName()+"\tAddress "+b.getAddress()+"\tAdhar "+b.getAadhar()+"\tBalance "+b.getBalance()+" "+b.isStatus());
        }
    }

    public void Deposite()
    {
        System.out.println("Please! provide account no");

        Scanner sc= new Scanner(System.in);
        //Get account no
        String TempAccountNo= sc.nextLine();
        int AccountNo = Integer.parseInt(TempAccountNo);
        //Get deposite amount
        String BalanceTemp= sc.nextLine();
        double Deposite = Double.parseDouble(BalanceTemp);

        //get account object from list
        Account account = AccounList.get(AccountNo);
        //deposite amount added to balance
        double Balance = account.getBalance() + Deposite;
        //set the balance in the object
        account.setBalance(Balance);

        System.out.println("Amount Deposited");

    }

    public void Withdrawn()
    {
        System.out.println("Please! provide account no");

        Scanner sc= new Scanner(System.in);
        //Get account no
        String TempAccountNo= sc.nextLine();
        int AccountNo = Integer.parseInt(TempAccountNo);
        //Get withdrawn amount
        String BalanceTemp= sc.nextLine();
        double Withdrawn = Double.parseDouble(BalanceTemp);

        //get account object from list
        Account account = AccounList.get(AccountNo);
        //check balance
        if (account.getBalance() >= Withdrawn )
        {
            //withdraw amount subracted from balance
            double Balance = account.getBalance() - Withdrawn;
            //set the balance in the object
            account.setBalance(Balance);
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void Transfer()
    {
        Scanner sc= new Scanner(System.in);
        //Get account no
        System.out.println("Please! provide account no");
        String TempAccountNo= sc.nextLine();
        int AccountNo = Integer.parseInt(TempAccountNo);
        System.out.println("Please! provide benifitiary account no");
        //benifitiary account no
        String TempBenAccountNo= sc.nextLine();
        int BenAccountNo = Integer.parseInt(TempBenAccountNo);
        System.out.println("Please! provide amount to transfer");
        //Get transfer amount
        String TransferAmount= sc.nextLine();
        double Trnasfer = Double.parseDouble(TransferAmount);

        //get account object from list
        Account account = AccounList.get(AccountNo);
        Account befAccount = AccounList.get(BenAccountNo);
        //check balance
        if (account.getBalance() >= Trnasfer )
        {
            //transfer amount subracted from balance
            double Balance = account.getBalance() - Trnasfer;
            //set new balance in the account
            account.setBalance(Balance);

            //transfer amount deposited
            double befBalance = befAccount.getBalance() + Trnasfer;
            befAccount.setBalance(befBalance);
            System.out.println("Amount Transfer from "+ AccountNo + " to " + BenAccountNo + "amount transfer");
        } else {
            System.out.println("Insufficient balance in "+ AccountNo);
        }
    }

    public void CheckBalance()
    {
        System.out.println("Please! provide account no");

        Scanner sc= new Scanner(System.in);
        //Get account no
        String TempAccountNo= sc.nextLine();
        int AccountNo = Integer.parseInt(TempAccountNo);
        //get account object from list
        Account account = AccounList.get(AccountNo);

        System.out.println("Balance in Account no " + AccountNo + " is " + account.getBalance());
    }
}

