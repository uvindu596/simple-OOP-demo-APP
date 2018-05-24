package BankManagement;


import java.io.Serializable;
import java.util.ArrayList;


 public class Bank implements Serializable{
 private ArrayList<Customer>customers=new ArrayList<Customer>();
    
 
 void addCustomer(Customer customer) {
    if(accountExists(customer.getAccount().getAccountNumber()))
    {
    customer.getAccount().setAccountNumber(findValiedAccountNumber());
    }
    
      customers.add(customer);
    }
 
 private int findValiedAccountNumber()
 {
  int accountNumber=0;
  do{
   accountNumber= Account.getNextAccountNumber();
    }
   while(accountExists(accountNumber));
  return accountNumber;
    }
 
 
 
 private boolean accountExists(int accountNumber)
 {
 for(Customer c: customers)
    {
    if(c.getAccount().getAccountNumber() == accountNumber)
    {
    return true;
    }
    }
 return false;
 }

  Customer getCustomer(int account) {
  return customers.get(account);
    }
 

    ArrayList<Customer> getCustomers() {
    return customers;
    }

    Customer getCustomerByAccoountNumber(int accountNumber) {
      Customer customer=null;
      for(Customer c : customers){
      if(c.getAccount().getAccountNumber()==accountNumber){
      customer=c;
      break;
      }
      
      }
return customer;      
    }

    void removeCustomer(Customer customer) {
      customers.remove(customer);
    }

 }
