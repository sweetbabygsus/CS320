package cs320;

public class Contact {
    private final String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    //Contact class Requirements
    public Contact(String id, String firstName, String lastName, String phone, String address) {
    	//The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. 
    	//The contact ID shall not be null and shall not be updateable.
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Contact ID must be non-null and no longer than 10 characters");
        }
        this.id = id;
        //The contact object shall have a required firstName String field that cannot be longer than 10 characters. 
        //The firstName field shall not be null.

        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must be non-null and no longer than 10 characters");
        }
        this.firstName = firstName;
        //The contact object shall have a required lastName String field that cannot be longer than 10 characters. 
        //The lastName field shall not be null.

        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must be non-null and no longer than 10 characters");
        }
        this.lastName = lastName;
        //The contact object shall have a required phone String field that must be exactly 10 digits. 
        //The phone field shall not be null.

        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be non-null and exactly 10 digits");
        }
        this.phone = phone;
      
        //The contact object shall have a required address field that must be no longer than 30 characters. 
        //The address field shall not be null.

        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must be non-null and no longer than 30 characters");
        }
        this.address = address;
    }
    //Getter method for Id
    public String getId() {
        return id;
    }
    //Getter method for first name
    public String getFirstName() {
        return firstName;
    }
    //Setter method for first name
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must be non-null and no longer than 10 characters");
        }
        this.firstName = firstName;
    }
    //Getter method for last name
    public String getLastName() {
        return lastName;
    }
    //setter method for last name
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must be non-null and no longer than 10 characters");
        }
        this.lastName = lastName;
    }
    //Getter method for phone #
    public String getPhone() {
        return phone;
    }
    //Setter method for phone #
    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be non-null and exactly 10 digits");
        }
        this.phone = phone;
    }
    //Getter method for Address
    public String getAddress() {
        return address;
    }
    //Setter method for address
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must be non-null and no longer than 30 characters");
        }
        this.address = address;
    }
}