package BankManagement;


import java.io.Serializable;


public class Customer implements Serializable {

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    private final String firstName;
    private final String lastName;
    private final String ssn;
    private final Account account;

    Customer(String firstName, String lastName, String ssn, Account account) {
   this.firstName=firstName;
   this.lastName=lastName;
   this.ssn=ssn;
   this.account=account;
    }
 
    @Override
    public String toString(){
     return "\nCustomer Information!\n"+
            "First Name:"+getFirstName() + "\n"+
            "Last Name:"+getLastName()+"\n"+
            "SSN:"+ssn+"\n"+
             account;
    }
     public String basicInfo(){
     return " First Name:"+getFirstName() + "\n"+
            " Last Name:"+getLastName()+"\n"+
            " SSN:"+ssn+"\n"+
            " Account Number:"+account.getAccountNumber();
    }
        
     
    Account getAccount(){
    return account;}
}