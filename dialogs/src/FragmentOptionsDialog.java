/*
*   EuroCarbDB, a framework for carbohydrate bioinformatics
*
*   Copyright (c) 2006-2009, Eurocarb project, or third-party contributors as
*   indicated by the @author tags or express copyright attribution
*   statements applied by the authors.  
*
*   This copyrighted material is made available to anyone wishing to use, modify,
*   copy, or redistribute it subject to the terms and conditions of the GNU
*   Lesser General Public License, as published by the Free Software Foundation.
*   A copy of this license accompanies this distribution in the file LICENSE.txt.
*
*   This program is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
*   or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
*   for more details.
*
*   Last commit: $Rev$ by $Author$ on $Date::             $  
*/
/*
* FragmentOptionsDialog1.java
*
* Created on June 5, 2006, 12:55 PM
*/

/**
*
* @author  aceroni
*/
public class FragmentOptionsDialog extends java.awt.Dialog {
    
    /**
     * Creates new form FragmentOptionsDialog1
     */
    public FragmentOptionsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        field_bfragments = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        field_cfragments = new javax.swing.JCheckBox();
        field_yfragments = new javax.swing.JCheckBox();
        field_zfragments = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        field_afragments = new javax.swing.JCheckBox();
        field_xfragments = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        button_cancel = new javax.swing.JButton();
        button_ok = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        field_no_crossrings = new javax.swing.JSpinner();
        field_no_cleavages = new javax.swing.JSpinner();
        field_internal_fragments = new javax.swing.JCheckBox();

        setTitle("Fragment options");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        field_bfragments.setText("B fragment");
        field_bfragments.setActionCommand("B fragments");
        field_bfragments.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        field_bfragments.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel1.setText("Fragment types");

        field_cfragments.setText("C fragments");
        field_cfragments.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        field_cfragments.setMargin(new java.awt.Insets(0, 0, 0, 0));

        field_yfragments.setText("Y fragments");
        field_yfragments.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        field_yfragments.setMargin(new java.awt.Insets(0, 0, 0, 0));

        field_zfragments.setText("Z fragments");
        field_zfragments.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        field_zfragments.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel3.setText("Cross ring fragments");

        field_afragments.setText("A fragments");
        field_afragments.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        field_afragments.setMargin(new java.awt.Insets(0, 0, 0, 0));

        field_xfragments.setText("X fragments");
        field_xfragments.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        field_xfragments.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel2.setText("Max n.o. cleavages");

        button_cancel.setText("Cancel");

        button_ok.setText("OK");

        jLabel4.setText("Max n.o. cross rings");

        field_internal_fragments.setText("Internal fragments");
        field_internal_fragments.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        field_internal_fragments.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(65, 65, 65)
                        .add(button_ok)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(button_cancel))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel1)
                            .add(jLabel2)
                            .add(jLabel4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(field_xfragments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .add(field_afragments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .add(field_zfragments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .add(field_yfragments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .add(field_cfragments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .add(field_bfragments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .add(field_internal_fragments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(field_no_crossrings))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, field_no_cleavages, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {button_cancel, button_ok}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(field_bfragments))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(field_cfragments)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(field_yfragments)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(field_zfragments)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(field_afragments))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(field_xfragments)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(field_internal_fragments)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(field_no_cleavages, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(field_no_crossrings, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(button_ok)
                    .add(button_cancel))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FragmentOptionsDialog(new java.awt.Frame(), true).setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_ok;
    private javax.swing.JCheckBox field_afragments;
    private javax.swing.JCheckBox field_bfragments;
    private javax.swing.JCheckBox field_cfragments;
    private javax.swing.JCheckBox field_internal_fragments;
    private javax.swing.JSpinner field_no_cleavages;
    private javax.swing.JSpinner field_no_crossrings;
    private javax.swing.JCheckBox field_xfragments;
    private javax.swing.JCheckBox field_yfragments;
    private javax.swing.JCheckBox field_zfragments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
}
