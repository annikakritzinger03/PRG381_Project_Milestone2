package librarymanagementsystem.model;

import librarymanagementsystem.model.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Book {

    
    public void addBook(String title, String genre, int authorId) {
        String query = "INSERT INTO book (title, genre, authorid) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, title);
            pstmt.setString(2, genre);
            pstmt.setInt(3, authorId);
            pstmt.executeUpdate();
            System.out.println("Book added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
    }

    
    public void updateBook(int bookId, String title, String genre, int authorId) {
        String query = "UPDATE book SET title = ?, genre = ?, authorid = ? WHERE bookid = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, title);
            pstmt.setString(2, genre);
            pstmt.setInt(3, authorId);
            pstmt.setInt(4, bookId);
            pstmt.executeUpdate();
            System.out.println("Book updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating book: " + e.getMessage());
        }
    }

   
    public void deleteBook(int bookId) {
        String query = "DELETE FROM book WHERE bookid = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, bookId);
            pstmt.executeUpdate();
            System.out.println("Book deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Error deleting book: " + e.getMessage());
        }
    }

    
    public void loadBooksIntoTable(JTable bookData) {
        String query = "SELECT * FROM book";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {
            DefaultTableModel model = (DefaultTableModel) bookData.getModel();
            model.setRowCount(0); // Clear existing rows

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("bookid"),
                    rs.getString("title"),
                    rs.getString("genre"),
                    rs.getInt("authorid")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            System.out.println("Error loading books into table: " + e.getMessage());
        }
    }
}
