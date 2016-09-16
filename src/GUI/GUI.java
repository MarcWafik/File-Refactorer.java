package GUI;

import Controllers.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class GUI extends javax.swing.JFrame {

	/**
	 * Creates new form GUII
	 */
	public GUI() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.cController = new GUIController(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
        setMinimumSize(new java.awt.Dimension(550, 240));

        jButton_FilePath.setText("Load");
        jButton_FilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FilePathActionPerformed(evt);
            }
        });

        jButton_Run.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/Save-as.png"))); // NOI18N
        jButton_Run.setToolTipText("Save");
        jButton_Run.setBorderPainted(false);
        jButton_Run.setContentAreaFilled(false);
        jButton_Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RunActionPerformed(evt);
            }
        });

        jLabel_Target.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Target.setText("Target");

        jLabel_Replacement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Replacement.setText("Replacement");

        jLabel_FilePath.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_FilePath.setText("File Path");

        jCheckBox_SubFolders.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_SubFolders.setText("Sub Folders");

        jCheckBox_isFiles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_isFiles.setSelected(true);
        jCheckBox_isFiles.setText("Files");

        jCheckBox_isFolder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_isFolder.setText("Folders");

        jTextField_Target.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_Replace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_FilePath.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_Demo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Demo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/Start.png"))); // NOI18N
        jButton_Demo.setToolTipText("Demo");
        jButton_Demo.setBorderPainted(false);
        jButton_Demo.setContentAreaFilled(false);
        jButton_Demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DemoActionPerformed(evt);
            }
        });

        jLabel_Action.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Action.setText("Action");

        jButton_Undo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/Undo.png"))); // NOI18N
        jButton_Undo.setToolTipText("Undo");
        jButton_Undo.setBorderPainted(false);
        jButton_Undo.setContentAreaFilled(false);
        jButton_Undo.setEnabled(false);
        jButton_Undo.setIconTextGap(0);
        jButton_Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UndoActionPerformed(evt);
            }
        });

        jComboBox_Action.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_Action.setModel(new DefaultComboBoxModel(Models.CAction.List));
        jComboBox_Action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ActionActionPerformed(evt);
            }
        });

        jCheckBox_IgnoreExtension.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_IgnoreExtension.setSelected(true);
        jCheckBox_IgnoreExtension.setText("Ignore Extension");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Target, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_FilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_FilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_Replacement)
                            .addComponent(jLabel_Action, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Target)
                            .addComponent(jTextField_FilePath)
                            .addComponent(jTextField_Replace)
                            .addComponent(jComboBox_Action, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jCheckBox_isFolder)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_Undo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Demo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Run, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox_isFiles)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox_IgnoreExtension)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox_SubFolders)
                                .addGap(0, 230, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_FilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FilePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_FilePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Target, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Target, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Replace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Replacement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Action, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Action, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_SubFolders)
                            .addComponent(jCheckBox_isFolder)
                            .addComponent(jCheckBox_isFiles)
                            .addComponent(jCheckBox_IgnoreExtension))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton_Run, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Demo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Undo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void jButton_FilePathActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_FilePathActionPerformed
   {//GEN-HEADEREND:event_jButton_FilePathActionPerformed
	   JFileChooser browse = new JFileChooser();
	   browse.setDialogTitle("Browse");
	   browse.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	   browse.setAcceptAllFileFilterUsed(false);
	   browse.setRequestFocusEnabled(rootPaneCheckingEnabled);
	   browse.setCurrentDirectory(new File("."));

	   if (browse.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
		   if (browse.getSelectedFile().toString() == null) {
			   JOptionPane.showMessageDialog(null, "can't load the path", "Error", JOptionPane.ERROR_MESSAGE);
		   } else {
			   jTextField_FilePath.setText(browse.getSelectedFile().toString());
		   }
	   }
   }//GEN-LAST:event_jButton_FilePathActionPerformed
    private void jButton_DemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DemoActionPerformed
		this.cController.demo(evt);
    }//GEN-LAST:event_jButton_DemoActionPerformed
    private void jButton_RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RunActionPerformed
		this.cController.rename(evt);
    }//GEN-LAST:event_jButton_RunActionPerformed
    private void jButton_UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UndoActionPerformed
		this.cController.undo(evt);
    }//GEN-LAST:event_jButton_UndoActionPerformed
    private void jComboBox_ActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ActionActionPerformed
		this.cController.ActionChanged(evt);
    }//GEN-LAST:event_jComboBox_ActionActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) throws IOException {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI().setVisible(true);
			}
		});
	}
	public final GUIController cController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JButton jButton_Demo = new javax.swing.JButton();
    public final javax.swing.JButton jButton_FilePath = new javax.swing.JButton();
    public final javax.swing.JButton jButton_Run = new javax.swing.JButton();
    public final javax.swing.JButton jButton_Undo = new javax.swing.JButton();
    public final javax.swing.JCheckBox jCheckBox_IgnoreExtension = new javax.swing.JCheckBox();
    public final javax.swing.JCheckBox jCheckBox_SubFolders = new javax.swing.JCheckBox();
    public final javax.swing.JCheckBox jCheckBox_isFiles = new javax.swing.JCheckBox();
    public final javax.swing.JCheckBox jCheckBox_isFolder = new javax.swing.JCheckBox();
    public final javax.swing.JComboBox<String> jComboBox_Action = new javax.swing.JComboBox<>();
    public final javax.swing.JLabel jLabel_Action = new javax.swing.JLabel();
    public final javax.swing.JLabel jLabel_FilePath = new javax.swing.JLabel();
    public final javax.swing.JLabel jLabel_Replacement = new javax.swing.JLabel();
    public final javax.swing.JLabel jLabel_Target = new javax.swing.JLabel();
    public final javax.swing.JTextField jTextField_FilePath = new javax.swing.JTextField();
    public final javax.swing.JTextField jTextField_Replace = new javax.swing.JTextField();
    public final javax.swing.JTextField jTextField_Target = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
