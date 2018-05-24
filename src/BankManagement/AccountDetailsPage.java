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
public class AccountDetailsPage extends javax.swing.JDialog {

    /**
     * Creates new form AccountDetailsPage
     */
    public AccountDetailsPage(java.awt.Frame parent, boolean modal,Customer customer) {
	super(parent, modal);
	initComponents();
	setLocationRelativeTo(parent);
	
	setTitle(String.format("Account details:- %s %s",customer.getFirstName(),customer.getLastName()));
	FnameFL.setText(customer.getFirstName());
	LnameFL.setText(customer.getLastName());
	AccTypeFL.setText(customer.getAccount().getAccountType());
	AccNumberFL.setText(String.valueOf(customer.getAccount().getAccountNumber()));
	BalanceFL.setText(String.valueOf(customer.getAccount().getBalance()));
	InterestRateFL.setText(String.valueOf(customer.getAccount().getInterset()));
	TransactionfeeFL.setText(String.valueOf(customer.getAccount().getWithdrowFee()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FnameLbl = new javax.swing.JLabel();
        FnameFL = new javax.swing.JLabel();
        LnameLBL = new javax.swing.JLabel();
        LnameFL = new javax.swing.JLabel();
        AccTypeLBL = new javax.swing.JLabel();
        AccTypeFL = new javax.swing.JLabel();
        AccNumberLBL = new javax.swing.JLabel();
        AccNumberFL = new javax.swing.JLabel();
        BalanceLBL = new javax.swing.JLabel();
        BalanceFL = new javax.swing.JLabel();
        InterestRateLBL = new javax.swing.JLabel();
        InterestRateFL = new javax.swing.JLabel();
        TransactionfeeLBL = new javax.swing.JLabel();
        TransactionfeeFL = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(8, 2, 5, 5));

        FnameLbl.setText("First Name:");
        getContentPane().add(FnameLbl);
        getContentPane().add(FnameFL);

        LnameLBL.setText("Last Name:");
        getContentPane().add(LnameLBL);
        getContentPane().add(LnameFL);

        AccTypeLBL.setText("Account Type:");
        getContentPane().add(AccTypeLBL);
        getContentPane().add(AccTypeFL);

        AccNumberLBL.setText("Account Number:");
        getContentPane().add(AccNumberLBL);
        getContentPane().add(AccNumberFL);

        BalanceLBL.setText("Balance:");
        getContentPane().add(BalanceLBL);
        getContentPane().add(BalanceFL);

        InterestRateLBL.setText("Interest Rate:");
        getContentPane().add(InterestRateLBL);
        getContentPane().add(InterestRateFL);

        TransactionfeeLBL.setText("Transaction Fee:");
        getContentPane().add(TransactionfeeLBL);
        getContentPane().add(TransactionfeeFL);

        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        getContentPane().add(okBtn);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
       this.dispose();
    }//GEN-LAST:event_okBtnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccNumberFL;
    private javax.swing.JLabel AccNumberLBL;
    private javax.swing.JLabel AccTypeFL;
    private javax.swing.JLabel AccTypeLBL;
    private javax.swing.JLabel BalanceFL;
    private javax.swing.JLabel BalanceLBL;
    private javax.swing.JLabel FnameFL;
    private javax.swing.JLabel FnameLbl;
    private javax.swing.JLabel InterestRateFL;
    private javax.swing.JLabel InterestRateLBL;
    private javax.swing.JLabel LnameFL;
    private javax.swing.JLabel LnameLBL;
    private javax.swing.JLabel TransactionfeeFL;
    private javax.swing.JLabel TransactionfeeLBL;
    private javax.swing.JButton okBtn;
    // End of variables declaration//GEN-END:variables
}
