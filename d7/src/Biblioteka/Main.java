package Biblioteka;

import Biblioteka_DAO.BookDaoSqlite;
import Biblioteka_domain.Book;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("Foo", "Bar", 128);
		BookDaoSqlite bookDao = new BookDaoSqlite();
		bookDao.addBook(book);
		bookDao.removeBook(book);
	}

}
