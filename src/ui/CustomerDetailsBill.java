package ui;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dhana
 */
public class CustomerDetailsBill extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDetailsBill
     */
    public CustomerDetailsBill() {
        initComponents();
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        coutdate.setText(myFormat.format(cal.getTime()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        coutdate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(105, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search By Check-Out Date:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 118, -1, 30));

        coutdate.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        coutdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coutdateActionPerformed(evt);
            }
        });
        getContentPane().add(coutdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 119, 200, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 119, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Mobile-Number", "Nationality", "Gender", "Email", "ID-Proof", "Address", "Check-In Date", "Room-Number", "Bed", "Room Type", "Price Per Day"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 202, 1220, 312));

        jLabel12.setBackground(new java.awt.Color(105, 0, 0));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CLICK ON TABLE ROW TO OPEN BILL");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 552, 459, -1));

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Customer Details Bill.png"))); // NOI18N
        jButton4.setText("Customer Details Bill");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 253, 57));

        jButton3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 70, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bggg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coutdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coutdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coutdateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new CustomerCheckOut().setVisible(true);
        new CustomerCheckOut().setExtendedState(new CustomerCheckOut().getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String query = "select * from customer where checkout is null";
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        try {
            ConnectionProvider c = new ConnectionProvider();
            c.s.executeQuery(query);
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String date=coutdate.getText();
        String query = "select * from customer where checkout is null and checkOUT is '"+date+"'";
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        try {
            ConnectionProvider c = new ConnectionProvider();
            c.s.executeQuery(query);
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index=jTable2.getSelectedRow();
        TableModel model=jTable2.getModel();
        String id=model.getValueAt(index,0).toString();
        String path = "C:\\Users\\dhana\\OneDrive\\Desktop\\Transcripts";
    Document doc = new Document();
    
     try {
        ConnectionProvider c = new ConnectionProvider();
        
        // Query to find customer by room number
        String query = "SELECT * FROM customer WHERE id ='" + id + "' AND checkout IS NULL";
        ResultSet rs = c.s.executeQuery(query);
        String name=rs.getString("2");
        String roomno=rs.getString("12");
        String total=rs.getString("17");
        String numdays=rs.getString("16");
        String CheckOut=rs.getString("15");
        String mob=rs.getString("3");
        String email=rs.getString("6");
        
        // Check if there's data in the result set
        if (rs.next()) {
            // Update query
            String updateQuery = "UPDATE customer SET numberofdays = numberofdays + " + numdays + 
                                 ", totalAmount = '" + total + 
                                 "', checkOut = '" + CheckOut + 
                                 "' WHERE id = '" + id + "'";
            c.s.executeUpdate(updateQuery);
            
            // Update room status
            String roomUpdateQuery = "UPDATE rooms SET Status = 'Available' WHERE roomno = '" + roomno + "'";
            c.s.executeUpdate(roomUpdateQuery);
            
            // Create PDF
            PdfWriter.getInstance(doc, new FileOutputStream(path + "\\" + id + ".pdf"));
            doc.open();
            
            // Add title and date
            Paragraph title = new Paragraph("GuestVision Bill Receipt", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24, BaseColor.BLUE));
            title.setAlignment(Element.ALIGN_CENTER);
            doc.add(title);
            
            doc.add(new Paragraph("Date: " + new SimpleDateFormat("yyyy/MM/dd").format(new Date()), FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.GRAY)));
            doc.add(new Paragraph("\n"));
            
            // Customer Information
            doc.add(new Paragraph("Customer Information", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.DARK_GRAY)));
            doc.add(new Paragraph("Name: " + name, FontFactory.getFont(FontFactory.HELVETICA, 14)));
            doc.add(new Paragraph("Mobile: " + mob, FontFactory.getFont(FontFactory.HELVETICA, 14)));
            doc.add(new Paragraph("Email: " + email, FontFactory.getFont(FontFactory.HELVETICA, 14)));
            doc.add(new Paragraph("Room No: " + roomno, FontFactory.getFont(FontFactory.HELVETICA, 14)));
            doc.add(new Paragraph("\n"));

            // Bill Details Table
            doc.add(new Paragraph("Bill Details", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.DARK_GRAY)));

            // Create a table with 3 columns
            PdfPTable table = new PdfPTable(3);
            table.setWidthPercentage(100); // Set table width to 100%
            table.setSpacingBefore(10f); // Space before the table
            table.setSpacingAfter(10f); // Space after the table

            // Add table headers with background color
            PdfPCell header1 = new PdfPCell(new Phrase("Description", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));
            header1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(header1);
            
            PdfPCell header2 = new PdfPCell(new Phrase("Quantity", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));
            header2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(header2);
            
            PdfPCell header3 = new PdfPCell(new Phrase("Amount", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));
            header3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(header3);

            // Add rows to the table
            table.addCell(new Phrase("Number of Days", FontFactory.getFont(FontFactory.HELVETICA, 12)));
            table.addCell(new Phrase(numdays, FontFactory.getFont(FontFactory.HELVETICA, 12)));
            table.addCell(new Phrase("$" + total, FontFactory.getFont(FontFactory.HELVETICA, 12)));

            // Additional Charges Example
            // table.addCell(new Phrase("Room Service", FontFactory.getFont(FontFactory.HELVETICA, 12)));
            // table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.HELVETICA, 12)));
            // table.addCell(new Phrase("$10", FontFactory.getFont(FontFactory.HELVETICA, 12)));

            // Add the table to the document
            doc.add(table);
            
            // Thank you note with different font style
            doc.add(new Paragraph("Thank you for choosing our hotel!", FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 14, BaseColor.DARK_GRAY)));
            
            // Closing the document
            doc.close(); // Don't forget to close the document
        } else {
            JOptionPane.showMessageDialog(null, "No customer found with the specified room number.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_jTable2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerDetailsBill frame = new CustomerDetailsBill();
                frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField coutdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
