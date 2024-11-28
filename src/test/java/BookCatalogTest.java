import se.yrgo.models.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	/**
	number of Books should be 1 after "addbook" function.
	 */
	@Test
	public void testAddABook() {
		assertEquals(1, bc.getNumberOfBooks());
	}

	//G
	/**
	return Book object after "findbook" function.
	 */
	@Test
	public void testFindBook() {
        try {
            assertEquals(bc.getBookArray()[0],bc.findBook("Learning Java"));
        } catch (BookNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

	//G
	/**
	-||- with insensitive case
	 */
	@Test
	public void testFindBookIgnoringCase() {
		try {
			assertEquals(bc.getBookArray()[0],bc.findBook("learning java"));
		} catch (BookNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	//G
	/**
	-||- with bonus spaces before and after specified "title" of Book obj
	 */
	@Test
	public void testFindBookWithExtraSpaces() {
		try {
			assertEquals(bc.getBookArray()[0],bc.findBook("     learning java      "));
		} catch (BookNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}
