import se.yrgo.models.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Done
 */
class BookTest {

	//G
	/**
	Check 2 Book objects if equal.
	 */
	@Test
	public void test2EqualBooks() {
		Book a = new Book(1,"a","","","",0);
		Book b = new Book(1,"a","","","",0);
		assertEquals(a,b);
	}

	//G
	/**
	Check 2 Book objects if NOT equal.
	 */
	@Test
	public void test2NonEqualBooks() {
		Book a = new Book(1,"a","","","",0);
		Book b = new Book(2,"b","","","",0);
		assertNotEquals(a,b);
	}

}
