package Library;


import LibraryDao.BookDaoImplementation;
import LibraryDomain.Book;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("Foo", "Bar", 128);
		BookDaoImplementation bookDao = new BookDaoImplementation();
		bookDao.addBook(book);
		bookDao.removeBook(book);
	}

}
