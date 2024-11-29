import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.models.Book;
import se.yrgo.models.Customer;
import se.yrgo.models.Loan;
import se.yrgo.utilities.GenderType;

import java.time.LocalDate;

/**
 * Done
 */
public class LoanTest {

	//VG
	/**
	 * DueDate equals expected loan duration.
	 */
	@Test
	public void testDueDate() {
		Book a = new Book(1,"a","","","",0);
		Customer customer = new Customer("title","fName", "lName", "addr",
				"00000000", "email", 1111, GenderType.UNKNOWN);
		Loan loan = new Loan(213, customer,a );
		assertEquals(LocalDate.now().plusDays(14), loan.getDueDate());
   }
}