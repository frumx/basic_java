package Biblioteka_DAO;

import Biblioteka_domain.Book;

public interface BookDao {
	public void addBook(Book book);
	public void removeBook(Book book);
}
