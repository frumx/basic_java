package Biblioteka_DAO;

import java.sql.*;


import Biblioteka_domain.Book;

public class BookDaoSqlite implements BookDao {
	private Connection connection;

	public BookDaoSqlite() {
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:library.db");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		createTable();
	}

	private void createTable() {
		String sql = "CREATE TABLE IF NOT EXISTS Books(" + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "title TEXT NOT NULL, " + "author TEXT NOT NULL, " + "pages INTEGER DEFAULT 0" + ")";
		try {
			Statement s = connection.createStatement();
			s.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addBook(Book book) {
		String author = book.getAuthor();
		String title = book.getTitle();
		int pages = book.getPages();
		String sql = "INSERT INTO Books(title, author, pages) VALUES('" + title + "', '" + author + "'," + pages + ")";
		
		String query="SELECT id FROM Books WHERE title='"+title+"'";
		
		try {
			Statement s = connection.createStatement();
			s.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		book.setId(Integer.valueOf(query));
	}

	@Override
	public void removeBook(Book book) {		
		int id = book.getId();
		String sql = "DELETE FROM Books WHERE id= "+id;
		try {
			Statement s = connection.createStatement();
			s.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
