/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem.view;

import javax.swing.JOptionPane;
import librarymanagementsystem.model.Book;

/**
 *
 * @author lieli
 */
public class Books extends javax.swing.JFrame {
    
    Book books = new Book();
    

    /**
     * Creates new form Books
     */
    public Books() {
        initComponents();
        books.loadBooksIntoTable(bookData);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAuthorID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookData = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnUpdateBook = new javax.swing.JButton();
        btnAddBook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBookID = new javax.swing.JTextField();
        btnDeleteBorrower1 = new javax.swing.JButton();
        cbGenre = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(215, 241, 255));

        txtTitle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtTitle.setName("txtTitle"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setText("Book Title: ");
        jLabel3.setName("lblTitle"); // NOI18N

        btnDelete.setBackground(new java.awt.Color(102, 204, 255));
        btnDelete.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnDelete.setText("Delete Book");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setBorderPainted(false);
        btnDelete.setName("btnDelete"); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel4.setText("Book Genre: ");
        jLabel4.setName("lblGenre"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Books");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setName("lblLibrarySystem"); // NOI18N

        txtAuthorID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAuthorID.setName("txtAuthorID"); // NOI18N

        bookData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Genre", "Author ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bookData.setName("tblBooks"); // NOI18N
        bookData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(bookData);

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel5.setText("Author ID: ");
        jLabel5.setName("lblAuthorID"); // NOI18N

        btnUpdateBook.setBackground(new java.awt.Color(102, 204, 255));
        btnUpdateBook.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnUpdateBook.setText("Update Book");
        btnUpdateBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateBook.setBorderPainted(false);
        btnUpdateBook.setName("btnUpdate"); // NOI18N
        btnUpdateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBookActionPerformed(evt);
            }
        });

        btnAddBook.setBackground(new java.awt.Color(102, 204, 255));
        btnAddBook.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnAddBook.setText("Add New Book");
        btnAddBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddBook.setBorderPainted(false);
        btnAddBook.setName("btnAdd"); // NOI18N
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel2.setText("Book ID: ");
        jLabel2.setName("lblBookID"); // NOI18N

        txtBookID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtBookID.setName("txtBookID"); // NOI18N

        btnDeleteBorrower1.setBackground(new java.awt.Color(51, 204, 255));
        btnDeleteBorrower1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnDeleteBorrower1.setText("Back to Dashboard");
        btnDeleteBorrower1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteBorrower1.setBorderPainted(false);
        btnDeleteBorrower1.setName("btnBack"); // NOI18N
        btnDeleteBorrower1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBorrower1ActionPerformed(evt);
            }
        });

        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Adventure", "Anthology", "Autobiography", "Biography", "Children's Fiction", "Drama", "Essay", "Fantasy", "Graphic Novel", "Historical Fiction", "History", "Horror", "Literary Fiction", "Memoir", "Mystery", "Philosophy", "Poetry", "Romance", "Science", "Science Fiction", "Self-Help", "Short Stories", "Thriller", "Travel", "True Crime", "Young Adult Fiction" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(265, 265, 265))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteBorrower1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAuthorID, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 18, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(btnUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAuthorID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateBook)
                    .addComponent(btnAddBook)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnDeleteBorrower1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAuthorID, txtBookID, txtTitle});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int bookid = Integer.parseInt(txtBookID.getText());
        books.deleteBook(bookid);
        books.loadBooksIntoTable(bookData);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBookActionPerformed
        // TODO add your handling code here:
        int bookid = Integer.parseInt(txtBookID.getText());
        String title = txtTitle.getText();
        String genre = (String) cbGenre.getSelectedItem();
        int authorid = Integer.parseInt(txtAuthorID.getText());

        books.updateBook(bookid,title, genre, authorid);
        books.loadBooksIntoTable(bookData);
    }//GEN-LAST:event_btnUpdateBookActionPerformed

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        String title = txtTitle.getText().trim();
        String genre = (String) cbGenre.getSelectedItem();
    
    // Validate title and genre
        if (title.isEmpty() || genre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Book Title and Book Genre cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate author ID
        int authorId;
        try {
            authorId = Integer.parseInt(txtAuthorID.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Author ID is required and must be a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
     
        books.addBook(title, genre, authorId);
        books.loadBooksIntoTable(bookData);
       
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void btnDeleteBorrower1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBorrower1ActionPerformed

        this.setVisible(false);
        
        Main main = new Main();
        main.setVisible(true);
    }//GEN-LAST:event_btnDeleteBorrower1ActionPerformed

    private void bookDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookDataMouseClicked

        int selectedRowIndex = bookData.getSelectedRow();

        if (selectedRowIndex != -1) {
            int bookId = (int) bookData.getValueAt(selectedRowIndex, 0);
            String title = (String) bookData.getValueAt(selectedRowIndex, 1);
            String genre = (String) bookData.getValueAt(selectedRowIndex, 2);
            int authorId = (int) bookData.getValueAt(selectedRowIndex, 3);

            txtBookID.setText(String.valueOf(bookId));
            txtTitle.setText(title);
            txtAuthorID.setText(String.valueOf(authorId));

            cbGenre.setSelectedItem(genre);
        }
    }//GEN-LAST:event_bookDataMouseClicked

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookData;
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteBorrower1;
    private javax.swing.JButton btnUpdateBook;
    private javax.swing.JComboBox<String> cbGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtAuthorID;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
