package cs320;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }
    //The contact service shall be able to add contacts with a unique ID.
    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getId())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(contact.getId(), contact);
    }
    //The contact service shall be able to delete contacts per contact ID.
    public void deleteContact(String id) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        contacts.remove(id);
    }
    //The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
    public void updateFirstName(String id, String firstName) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        Contact contact = contacts.get(id);
        contact.setFirstName(firstName);
    }
    //The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
    public void updateLastName(String id, String lastName) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        Contact contact = contacts.get(id);
        contact.setLastName(lastName);
    }
    //The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
    public void updatePhone(String id, String phone) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        Contact contact = contacts.get(id);
        contact.setPhone(phone);
    }
    //The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
    public void updateAddress(String id, String address) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        Contact contact = contacts.get(id);
        contact.setAddress(address);
    }

    public Contact getContact(String id) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        return contacts.get(id);
    }

    public Map<String, Contact> getAllContacts() {
        return contacts;
    }
}


    