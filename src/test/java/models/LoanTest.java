package models;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
		Customer customer = new Customer("Mr", "Testy"
										, "McTestFace", "Test Street 1"
										, "0701231212", "test@mail.com",
										1, GenderType.MALE);
		Book book = new Book(1, "A Book", "An Author", "0000001", "A Branch", 1);
		Loan test = new Loan(1, customer, book);

		assertEquals(LocalDate.now().plusDays(14), test.getDueDate());

   }
}