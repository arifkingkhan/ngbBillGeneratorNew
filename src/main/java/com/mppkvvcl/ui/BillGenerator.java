//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.ui;

import com.mppkvvcl.util.GlobalResources;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class BillGenerator extends JFrame {
    private static final Logger logger = GlobalResources.getLogger(BillGenerator.class);
    private File billFilePath;
    private File outputDirectoryPath;
    private JFileChooser billFileChooser;
    private JProgressBar billGenerationProgressBar;
    private JButton btnChooseBillFile;
    private JButton btnChooseOutputDirectory;
    private JButton btnGenerate;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JLabel lblProcessedBills;
    private JLabel lblStatus;
    private JLabel lblTotalBills;
    private JFileChooser outputDirectoryChooser;

    public BillGenerator() {
        this.initComponents();
        this.billFileChooser.setFileSelectionMode(0);
        this.outputDirectoryChooser.setFileSelectionMode(1);
        this.billGenerationProgressBar.setStringPainted(true);
    }

    private void initComponents() {
        this.billFileChooser = new JFileChooser();
        this.outputDirectoryChooser = new JFileChooser();
        this.jPanel1 = new JPanel();
        this.btnChooseBillFile = new JButton();
        this.jLabel2 = new JLabel();
        this.btnChooseOutputDirectory = new JButton();
        this.jLabel1 = new JLabel();
        this.jPanel2 = new JPanel();
        this.billGenerationProgressBar = new JProgressBar();
        this.jLabel3 = new JLabel();
        this.lblStatus = new JLabel();
        this.lblTotalBills = new JLabel();
        this.jLabel6 = new JLabel();
        this.lblProcessedBills = new JLabel();
        this.jLabel8 = new JLabel();
        this.jPanel3 = new JPanel();
        this.btnGenerate = new JButton();
        this.billFileChooser.setMinimumSize(new Dimension(1000, 500));
        this.billFileChooser.setPreferredSize(new Dimension(1000, 500));
        this.outputDirectoryChooser.setMinimumSize(new Dimension(1000, 500));
        this.outputDirectoryChooser.setPreferredSize(new Dimension(1000, 500));
        this.setDefaultCloseOperation(3);
        this.setTitle("NGB PDF Bill Generator v1.1.0");
        this.setResizable(false);
        this.jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.btnChooseBillFile.setFont(new Font("Tahoma", 1, 14));
        this.btnChooseBillFile.setText("Choose");
        this.btnChooseBillFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BillGenerator.this.btnChooseBillFileActionPerformed(evt);
            }
        });
        this.jLabel2.setFont(new Font("Dialog", 1, 18));
        this.jLabel2.setText("Select Output Directory");
        this.btnChooseOutputDirectory.setFont(new Font("Tahoma", 1, 14));
        this.btnChooseOutputDirectory.setText("Choose");
        this.btnChooseOutputDirectory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BillGenerator.this.btnChooseOutputDirectoryActionPerformed(evt);
            }
        });
        this.jLabel1.setFont(new Font("Dialog", 1, 18));
        this.jLabel1.setText("Select Bill File");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jLabel2)).addGap(40, 40, 40).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.btnChooseOutputDirectory, -1, 117, 32767).addComponent(this.btnChooseBillFile, -1, -1, 32767)).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(8, 8, 8).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.btnChooseOutputDirectory, -2, 41, -2).addComponent(this.jLabel2)).addPreferredGap(ComponentPlacement.RELATED, 27, 32767).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.btnChooseBillFile, -2, 41, -2).addComponent(this.jLabel1)).addGap(19, 19, 19)));
        this.jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.billGenerationProgressBar.setFont(new Font("Dialog", 1, 18));
        this.jLabel3.setFont(new Font("Tahoma", 0, 16));
        this.jLabel3.setText("Status");
        this.lblStatus.setFont(new Font("Tahoma", 1, 16));
        this.lblStatus.setForeground(new Color(0, 153, 153));
        this.lblStatus.setHorizontalAlignment(0);
        this.lblStatus.setText("Waiting For User's Input..");
        this.lblTotalBills.setFont(new Font("Tahoma", 1, 20));
        this.lblTotalBills.setForeground(new Color(0, 102, 255));
        this.lblTotalBills.setHorizontalAlignment(0);
        this.lblTotalBills.setText("-");
        this.jLabel6.setFont(new Font("Tahoma", 0, 16));
        this.jLabel6.setText("Total Bills Found");
        this.lblProcessedBills.setFont(new Font("Tahoma", 1, 20));
        this.lblProcessedBills.setForeground(new Color(0, 153, 0));
        this.lblProcessedBills.setHorizontalAlignment(0);
        this.lblProcessedBills.setText("-");
        this.jLabel8.setFont(new Font("Tahoma", 0, 16));
        this.jLabel8.setText("Processed Bills");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.billGenerationProgressBar, -1, -1, 32767).addContainerGap()).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel8).addGap(5, 5, 5)).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.jLabel3).addGap(75, 75, 75)).addComponent(this.jLabel6, Alignment.TRAILING)).addPreferredGap(ComponentPlacement.RELATED, 28, 32767).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.lblProcessedBills, Alignment.TRAILING, -2, 216, -2).addComponent(this.lblStatus, Alignment.TRAILING, -2, 216, -2).addComponent(this.lblTotalBills, Alignment.TRAILING, -2, 216, -2)).addGap(30, 30, 30)))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3, -2, 31, -2).addComponent(this.lblStatus)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel6, -2, 31, -2).addComponent(this.lblTotalBills)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel8, -2, 31, -2).addComponent(this.lblProcessedBills)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.billGenerationProgressBar, -2, 43, -2).addContainerGap(15, 32767)));
        this.jPanel3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.btnGenerate.setFont(new Font("Tahoma", 1, 20));
        this.btnGenerate.setForeground(new Color(51, 153, 0));
        this.btnGenerate.setText("Generate PDF");
        this.btnGenerate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BillGenerator.this.btnGenerateActionPerformed(evt);
            }
        });
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.btnGenerate, -1, -1, 32767).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.btnGenerate, -2, 46, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addComponent(this.jPanel3, -1, -1, 32767).addComponent(this.jPanel1, -1, -1, 32767)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel3, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel2, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
        this.setLocationRelativeTo((java.awt.Component)null);
    }

    private void btnChooseBillFileActionPerformed(ActionEvent evt) {
        int returnVal = this.billFileChooser.showOpenDialog(this);
        if (returnVal == 0) {
            File selectedFile = this.billFileChooser.getSelectedFile();
            this.billFilePath = selectedFile;
            logger.info("Bill File: " + this.billFilePath);
        }

        this.lblProcessedBills.setText("-");
        this.lblTotalBills.setText("-");
    }

    private void btnGenerateActionPerformed(ActionEvent evt) {
        if (this.billFilePath == null) {
            JOptionPane.showMessageDialog(this, "Please choose a bill File which has to be processed", "NGB PDF Bill Generator", 0);
        } else if (this.outputDirectoryPath == null) {
            JOptionPane.showMessageDialog(this, "Please choose the output directory", "NGB PDF Bill Generator", 0);
        } else {
            this.btnChooseBillFile.setEnabled(false);
            this.btnChooseOutputDirectory.setEnabled(false);
            this.btnGenerate.setEnabled(false);
            this.lblStatus.setText("Reading and Parsing Bill File..");
            BillGeneratorWorker billGeneratorWorker = new BillGeneratorWorker(this.billFilePath, this.outputDirectoryPath, this, this.btnChooseBillFile, this.btnChooseOutputDirectory, this.btnGenerate, this.lblTotalBills, this.lblProcessedBills, this.lblStatus, this.billGenerationProgressBar);
            logger.info("Assigning task to Worker thread ..");
            billGeneratorWorker.addPropertyChangeListener(new PropertyChangeListenerImpl(this.billGenerationProgressBar));
            billGeneratorWorker.execute();
        }
    }

    private void btnChooseOutputDirectoryActionPerformed(ActionEvent evt) {
        int returnVal = this.outputDirectoryChooser.showOpenDialog(this);
        if (returnVal == 0) {
            File selectedDirectory = this.outputDirectoryChooser.getSelectedFile();
            this.outputDirectoryPath = selectedDirectory;
            logger.info("Output Directory: " + this.outputDirectoryPath);
        }

    }

    public void startPdfBillGenerator() {
        try {
            LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            java.util.logging.Logger.getLogger(BillGenerator.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            java.util.logging.Logger.getLogger(BillGenerator.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            java.util.logging.Logger.getLogger(BillGenerator.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            java.util.logging.Logger.getLogger(BillGenerator.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new BillGenerator()).setVisible(true);
            }
        });
    }
}
