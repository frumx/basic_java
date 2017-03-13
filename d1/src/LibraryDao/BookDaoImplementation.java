package LibraryDao;

import java.sql.*;


import LibraryDomain.Book;

public class BookDaoImplementation implements BookDao {

	private Connection c;
	
	public BookDaoImplementation() {

		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:Lib.db");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		CreateTable();
	}

	public void CreateTable() {

		try {
			Statement stmt = c.createStatement();
			String sql ="CREATE TABLE IF NOT EXISTS Books " 
    		  			+"(id INTEGER PRIMARY KEY AUTOINCREMENT, " 
    		  			+"title TXT NOT NULL, " 
    		  			+"author TXT NOT NULL, "
    		  			+"pages INTEGER DEFAULT 0)";

					stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table created successfully");

	}

	@Override
	public void addBook(Book book) {
		String title=book.getTitle();
		String author=book.getAuthor();
		int pages=book.getPages();
		
		String add ="INSERT INTO Books(title, author, pages) VALUES('"+title+"','"+author+"', "+pages+")";
		String two ="SELECT id FROM Books WHERE title='"+title+"'";
		try {
			Statement stmt = c.createStatement();	
			stmt.executeUpdate(add);
			stmt.close();
			c.close();			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		book.setId(Integer.valueOf(two));
		System.out.println("wow");
	}

	@Override
	public void removeBook(Book book) {
		int id = book.getId();
		String rmv ="DELETE FROM Books WHERE id= "+id;
		try {
			Statement stmt = c.createStatement();	
			stmt.executeUpdate(rmv);
			stmt.close();
			c.close();			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}
}
