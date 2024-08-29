package librarymanagementsystem.model;

import librarymanagementsystem.model.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Borrower {

    
    public void addBorrower(String username, String name, String phoneOrEmail, boolean hasLibraryCard) {
        String query = "INSERT INTO borrower (username, name, phoneoremail, haslibrarycard) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, name);
            pstmt.setString(3, phoneOrEmail);
            pstmt.setBoolean(4, hasLibraryCard);
            pstmt.executeUpdate();
            System.out.println("Borrower added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding borrower: " + e.getMessage());
        }
    }

    // Updates a borrower's information
    public void updateBorrower(int borrowerId, String username, String name, String phoneOrEmail, boolean hasLibraryCard) {
        String query = "UPDATE borrower SET username = ?, name = ?, phoneoremail = ?, haslibrarycard = ? WHERE borrowerid = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, name);
            pstmt.setString(3, phoneOrEmail);
            pstmt.setBoolean(4, hasLibraryCard);
            pstmt.setInt(5, borrowerId);
            pstmt.executeUpdate();
            System.out.println("Borrower updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating borrower: " + e.getMessage());
        }
    }

    // Deletes a borrower from the database
    public void deleteBorrower(int borrowerId) {
        String query = "DELETE FROM borrower WHERE borrowerid = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, borrowerId);
            pstmt.executeUpdate();
            System.out.println("Borrower deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Error deleting borrower: " + e.getMessage());
        }
    }

    // Populates the borrowerData JTable with data from the database
    public void loadBorrowersIntoTable(JTable borrowerData) {
        String query = "SELECT * FROM borrower";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {
            DefaultTableModel model = (DefaultTableModel) borrowerData.getModel();
            model.setRowCount(0); // Clear existing rows

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("borrowerid"),
                    rs.getString("username"),
                    rs.getString("name"),
                    rs.getString("phoneoremail"),
                    rs.getBoolean("haslibrarycard")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            System.out.println("Error loading borrowers into table: " + e.getMessage());
        }
    }
}
