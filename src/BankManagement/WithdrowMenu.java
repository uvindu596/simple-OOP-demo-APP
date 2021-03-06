package BankManagement;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class WithdrowMenu extends javax.swing.JDialog {

    private final Customer customer;

    /**
     * Creates new form DepositeMenu
     */
    public WithdrowMenu(java.awt.Frame parent, boolean modal,Customer customer) {
	super(parent, modal);
	initComponents();
	setLocationRelativeTo(parent);
	this.customer = customer;
	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WithdrowamnLable = new javax.swing.JLabel();
        WithdrowField = new javax.swing.JTextField();
        withdrowBtn = new javax.swing.JButton();
        Cancelbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Diposit Menu");
        getContentPane().setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        WithdrowamnLable.setText("Withdow Amount:");
        getContentPane().add(WithdrowamnLable);
        getContentPane().add(WithdrowField);

        withdrowBtn.setText("Withdrow");
        withdrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrowBtnActionPerformed(evt);
            }
        });
        getContentPane().add(withdrowBtn);

        Cancelbtn.setText("Cancel");
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelbtn);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelbtnActionPerformed

    private void withdrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrowBtnActionPerformed
       StringBuilder warnings= new StringBuilder();
       if(WithdrowField.getText().isEmpty())
       {
       warnings.append("Withdrow amount is Reqired");
       }
       else
       {
        double amount =0; 
        try
	{
	 amount=Double.parseDouble( WithdrowField.getText());
	 int result =JOptionPane.showConfirmDialog(this,"Withdow "+amount+"Rs"+" to the account?\nTransaction Fee:"+(customer.getAccount().getWithdrowFee() ));
	 if(result==JOptionPane.OK_OPTION){
	     
	     try {
		 customer.getAccount().withdrow(amount);
	         this.dispose();
	     } catch (InsufficientFundsException ex) {
		warnings.append("Insufficient Funds to Complete Transaction\n");
	     } 
	 }
	}
         catch(NumberFormatException ex)
	 {
	     warnings.append("Withdrow must be a Number\n");
	 }
	
	
	
       }
       
       if(warnings.length()>0)
       {
       JOptionPane.showMessageDialog(this, warnings.toString(),"Withdrow Warnings",JOptionPane.WARNING_MESSAGE);
       }       
       
    }//GEN-LAST:event_withdrowBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelbtn;
    private javax.swing.JTextField WithdrowField;
    private javax.swing.JLabel WithdrowamnLable;
    private javax.swing.JButton withdrowBtn;
    // End of variables declaration//GEN-END:variables
}
