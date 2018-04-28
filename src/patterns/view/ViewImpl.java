package patterns.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import patterns.presenter.Presenter;

/**
 *
 * @author kevinmont
 */
public class ViewImpl extends javax.swing.JFrame implements View {

    private final Presenter presenter;
    
    public ViewImpl() {
        initComponents();
        this.presenter= new Presenter();
        this.presenter.setView(this);
        addEvents();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ViewImpl().setVisible(true);
        });
    }

    @Override
    public void setNumber(int number) {
        this.jTextField1.setText(String.valueOf(number));
    }

    @Override
    public void setColor(Color color) {
        this.jTextField1.setBackground(color);
    }

    @Override
    public void increase(ActionEvent evt) {
        this.presenter.increase();
    }

    @Override
    public void decrease(ActionEvent evt) {
        this.presenter.decrease();
    }

    private void addEvents() {
        jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
            decrease(evt);
        });
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            increase(evt);
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            jButton1 =(javax.swing.JButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "patterns/view.ViewImpl_jButton1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("numero");

        jButton2.setText("Decrementar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
