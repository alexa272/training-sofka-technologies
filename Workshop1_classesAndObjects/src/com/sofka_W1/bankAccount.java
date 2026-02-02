package com.sofka_W1;
/**
* Class designed to create bank account objects with attributes and 
* methods
*
* @version [1.0.0 2022-01-06, The class corresponds to version 1 of the system,
*               which has not undergone any refactoring during the version].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class bankAccount {
    
    /**
     * Definition of attribute name of bank account owner.
     */
    
    private String ownerName;
    
    /**
     * Definition of attribute Bank account owner's document number.
     */
    
    private int ownerDocNumber;
    
    /**
     * Definition of attribute total balance in the bank account.
     */
    
    private double balance;
    /**
     * Definition of attribute bank account number.
     */
    private int accountNumber;
    /**
     * Definition of attribute indicating bank account statement
     */
    private boolean activated;
    
    /**
     * Creation of bank account class constructor.
     * @param ownerName owner's name.
     * @param ownerDocNumber owner document number.
     * @param balance Balance available in the bank account.
     * @param accountNumber account number.
     * Active or inactive status of the account.
     */
    
    public bankAccount(String ownerName, int ownerDocNumber, double balance, int accountNumber, boolean activated) {
        this.ownerName = ownerName;
        this.ownerDocNumber = ownerDocNumber;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    /**
     * Method get Owner Name
     * @return  
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * Method set Owner Name
     * @param nameBook 
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    /**
     * Method get Owner Document Number
     * @return  
     */
    public int getOwnerDocNumber() {
        return ownerDocNumber;
    }
    /**
     * Method set Owner Document Number
     * @param nameBook 
     */
    public void setOwnerDocNumber(int ownerDocNumber) {
        this.ownerDocNumber = ownerDocNumber;
    }
    /**
     * Method get Balance
     * @return  
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Method set Balance
     * @param nameBook 
     */
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     * Method get Account Number
     * @return  
     */
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    /**
     * Method get Account Number
     * @param nameBook 
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * Method Get bank statement
     * @return  
     */
    public boolean isActivated() {
        return activated;
    }
    /**
     * Method bank statement
     * @param nameBook 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /**
     * Method enter Balance
     */
    public void enterBalance() {
       boolean enterBalance = true ;
    }
    
    /**
     * Method with draw Balance
     */
    public void withdrawBalance() {
        boolean withdrawBalance = true ;
    }
}