package BankManagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class InvaliedAmountException extends Exception {

    public InvaliedAmountException() {
	super("You have invalied amount for Transaction");
    }
    
}
