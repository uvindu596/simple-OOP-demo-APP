package BankManagement;


import java.io.Serializable;


public abstract class Account implements Serializable {
    private double balance=0;
    private double interset=2;
    private double withdrowFee;
    private int accountNumber;
    private static int numberOfAccounts=1000000;
    
    
    Account(){
    accountNumber=getNextAccountNumber();
    }
    
    public static int getNextAccountNumber()
    {
    
    return ++numberOfAccounts;
    }
    
    public abstract String getAccountType();
    
    
    public double getBalance() {
        return balance;
    }

   
    public void setBalance(double balance) {
        this.balance = balance;
    }

   
    public double getInterset() {
        return interset;
    }
   
   
    public void setInterset(double interset) {
        this.interset = interset;
    }

   public double getWithdrowFee()
   {
   return withdrowFee;
   }
   
    public void setWithdrowFee(double withdrow) {
        this.withdrowFee=withdrow;
    }
   
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void withdrow(double amount) throws InsufficientFundsException{
    
    if(amount + 5>balance){
        throw new InsufficientFundsException();
    }
    else{
    balance-=amount+withdrowFee;
    checkInterset(0);
    
    
 }
    }
    
     public void deposite(double amount) throws InvaliedAmountException{
    if(amount<=0){
    throw new InvaliedAmountException();
   
    }
    checkInterset(amount);
    amount =amount+amount*interset/100;
    balance+= amount;
       
     }
    
     public void  checkInterset(double amount){
    if (balance+amount>10000){
    interset=5;
    }
    else{
    interset=2;
    }
    }

    void setAccountNumber(int accountNumber) {
     this.accountNumber =accountNumber;
    }

 
     
}
