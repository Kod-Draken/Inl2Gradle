package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		Book book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		Book testBook = new Book(2,"TestBook","","","",0);
		bc.addBook(testBook);
		assertSame(testBook, bc.getBookArray()[1]);
		assertEquals(bc.getNumberOfBooks(), 2);
	}

	//G
	@Test
	public void testFindBook() {
        try {
            assertEquals(bc.getBookArray()[0], bc.findBook("Learning Java"), "The book exists");
        } catch (BookNotFoundException e) {
			fail();
        }
    }

	//G
	@Test
	public void testFindBookIgnoringCase() {
		try {
			assertEquals(bc.getBookArray()[0], bc.findBook("learNING jAVA"), "Case is ignored");
		} catch (BookNotFoundException e) {
			fail();
		}
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() {
		try {
			assertEquals(bc.getBookArray()[0], bc.findBook("  Learning Java   "), "Spaces are trimmed");
		} catch (BookNotFoundException e) {
			fail();
		}
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
		assertThrows(BookNotFoundException.class, () -> {bc.findBook("Doesn't exist");}, "The book doesn't exist");
	}

}
