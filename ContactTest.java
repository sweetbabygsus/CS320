package cs320;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ContactTest {
    
	@Test
	public void testCreateContact() {
	    Contact contact = new Contact("10930", "Joseph", "Valle", "8456628118", "6025 Blvd East");
	    assertEquals("10930", contact.getId());
	    assertEquals("Joseph", contact.getFirstName());
	    assertEquals("Valle", contact.getLastName());
	    assertEquals("8456628118", contact.getPhone());
	    assertEquals("6025 Blvd East", contact.getAddress());
	}

	//Test for invalid id length
	@Test
	public void testContactIdLength() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact("123456789012", "Joseph", "Valle", "8456628118", "6025 Blvd East"));
	}

	//Test for contact with a null first name
	@Test
	public void testFirstNameNotNull() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact("10930", null, "Valle", "8456628118", "6025 Blvd East"));
	}

	//Test for null last name
	@Test
	public void testLastNameNotNull() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact("10930", "Joseph", null, "8456628118", "6025 Blvd East"));
	}

	//Test for invalid phone # length
	@Test
	public void testPhoneLength() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact("10930", "Joseph", "Valle", "84566281188", "6025 Blvd East"));
	}

	// Test for null address
	@Test
	public void testAddressNotNull() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact("10930", "Joseph", "Valle", "8456628118", null));
	}
}
