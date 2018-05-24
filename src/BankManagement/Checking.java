package BankManagement;


public  class Checking extends Account{
    
    private static String accountType="Checking";

Checking(double initialDeposite){

super();
this.setBalance(initialDeposite);
this.checkInterset(0);
this.setWithdrowFee(5);
}

@Override
public String toString(){

return "Account Type:"+accountType +"account\n"+
        "Account Number:"+this.getAccountNumber()+"\n"+
        "Account Balance:"+this.getBalance()+"\n"+
        "Interest Rate:"+this.getInterset()+"\n";
        
        }

    @Override
    public String getAccountType() {
	return accountType;
    }

} 







