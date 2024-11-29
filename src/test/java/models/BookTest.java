package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
	Book book1 = new Book(1,"A Book","An Author","123456789", "A Branch", 1);
	Book book2 = new Book(1,"A Book","An Author","123456789", "A Branch", 1);
	assertEquals(book1, book2, "The books are copies");
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1,"A Book","An Author","0000001", "A Branch", 1);
		Book book2 = new Book(2,"Another Book","Another Author","0000002", "Another Branch", 2);
		assertNotEquals(book1, book2, "The books are different");
	}

}
