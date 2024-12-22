package mod3;
public class Contact {

    private final String contactID; // contactID should not be updatable thus final
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {

        if (contactID == null || contactID.trim().isEmpty()) {
            throw new IllegalArgumentException("Contact ID should not be empty or null");
        } else if (contactID.length() > 10) {
            throw new IllegalArgumentException("Contact ID should be no longer than 10 characters");
        }

        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name should not be empty or null");
        } else if (firstName.length() > 10) {
            throw new IllegalArgumentException("First name should be no longer than 10 characters");
        }

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name should not be empty or null");
        } else if (lastName.length() > 10) {
            throw new IllegalArgumentException("Last name should be no more than 10 characters");
        }

        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number should not be empty or null");
        } else if (!phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number. Please enter a 10 digit number");
        }

        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address should not be empty or null");
        } else if (address.length() > 30) {
            throw new IllegalArgumentException("Address is too long. Must be 30 characters or less");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters
    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name should not be empty or null");
        } else if (firstName.length() > 10) {
            throw new IllegalArgumentException("First name should be no longer than 10 characters");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name should not be empty or null");
        } else if (lastName.length() > 10) {
            throw new IllegalArgumentException("Last name should be no more than 10 characters");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number should not be empty or null");
        } else if (!phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number. Please enter a 10 digit number");
        }
        this.phone = phone;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address should not be empty or null");
        } else if (address.length() > 30) {
            throw new IllegalArgumentException("Address is too long. Must be 30 characters or less");
        }
        this.address = address;
    }
}