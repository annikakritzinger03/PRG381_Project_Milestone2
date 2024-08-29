package librarymanagementsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String JDBC_URL = "jdbc:derby://localhost:1527/LibraryDB;create=true";
    
    public static Connection getConnection() throws SQLException {
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Derby JDBC driver not found.", e);
        }

         
        return DriverManager.getConnection(JDBC_URL);
    }

    public static void createTables() {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            
            // Create Borrower table with auto-increment borrowerid
            String borrowerTable = """
                    CREATE TABLE borrower (
                        borrowerid INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
                        username VARCHAR(50),
                        name VARCHAR(100),
                        phoneoremail VARCHAR(100),
                        haslibrarycard BOOLEAN
                    )
                    """;

            // Create Book table with auto-increment bookid
            String bookTable = """
                    CREATE TABLE book (
                        bookid INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
                        title VARCHAR(100),
                        genre VARCHAR(50),
                        authorid INTEGER
                    )
                    """;

            // Execute table creation
            stmt.executeUpdate(borrowerTable);
            stmt.executeUpdate(bookTable);
            System.out.println("Tables created successfully.");
        } catch (SQLException e) {
            if (e.getSQLState().equals("X0Y32")) {
                System.out.println("Tables already exist.");
            } else {
                System.out.println("Error creating tables: " + e.getMessage());
            }
        }
    }
}
