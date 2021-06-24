package com.bank;

public class Account {
    private String Name;
    private String Address;
    private int Aadhar;
    private boolean Status;

    public void setBalance(double balance) {
        Balance = balance;
    }

    private double Balance;

    public Account(String Name, String Address, int Aadhar, double Balance)
    {
        this.Name = Name;
        this.Address = Address;
        this.Aadhar = Aadhar;
        this.Balance = Balance;
        Status = true;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getAadhar() {
        return Aadhar;
    }

    public boolean isStatus() {
        return Status;
    }

    public double getBalance() {
        return Balance;
    }


}

