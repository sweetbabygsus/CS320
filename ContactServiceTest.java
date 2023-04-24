package cs320;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
        contactService.addContact(new Contact("1", "Joseph", "Valle", "1234567890", "6025 JFK BLVD E"));
    }

    @Test
    //test add contact
    public void testAddContact() {
        Contact contact = new Contact("3", "Triple", "H", "0987654321", "Route 46 1881");
        contactService.addContact(contact);
        Contact addedContact = contactService.getContact("3");
        Assertions.assertEquals(contact, addedContact);
    }

    @Test
    //test delete contact
    public void testDeleteContact() {
        contactService.deleteContact("1");
        Assertions.assertThrows(IllegalArgumentException.class, () -> contactService.getContact("1"));
    }

    @Test
    //test update of first name
    public void testUpdateFirstName() {
        contactService.updateFirstName("1", "Lyndsey");
        Contact updatedContact = contactService.getContact("1");
        Assertions.assertEquals("Lyndsey", updatedContact.getFirstName());
    }

    @Test
    //test update of last name
    public void testUpdateLastName() {
        contactService.updateLastName("1", "Broadfield");
        Contact updatedContact = contactService.getContact("1");
        Assertions.assertEquals("Broadfield", updatedContact.getLastName());
    }
    
    @Test
    //test  update of phone
    public void testUpdatePhone() {
    	contactService.updatePhone("1", "9999999999");
    	Contact updatedPhone = contactService.getContact("1");
    	Assertions.assertEquals("9999999999", updatedPhone.getPhone());
    }
    
    @Test
    //test update of address
    public void testUpdateAddress() {
    	contactService.updateAddress("1", "99 Lackawanna Dr");
    	Contact updatedAddress = contactService.getContact("1");
    	Assertions.assertEquals("99 Lackawanna Dr", updatedAddress.getAddress());
    }
}
    
