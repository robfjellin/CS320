package mod3;
import java.util.ArrayList;
public class ContactService {
    private final ArrayList<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList<>();
    }

    // Add a contact
    public void addContact(Contact contact) {
        // Check if contact is null
        if (contact == null) {
            throw new IllegalArgumentException("Invalid contact ID");
        }

        // Check for duplicate ID
        for (Contact existingContact : contacts) {
            if (existingContact.getContactID().equals(contact.getContactID())) {
                throw new IllegalArgumentException("Contact ID already exists");
            }
        }

        contacts.add(contact);
    }

    // Check if ID is null or empty

    public void checkContactID (String contactID) {
        if (contactID == null || contactID.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid contact ID");
        }
    }

    public void deleteContact(String contactID) {

        checkContactID(contactID);

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactID().equals(contactID)) {
                contacts.remove(i);
                return;
            }
        }
    }

    public void updateFirstName(String contactID, String firstName) {

        checkContactID(contactID);

        // Check each contact in contact array
        for (Contact contact : contacts) {
            if (contact.getContactID().equals(contactID)) {
                contact.setFirstName(firstName);
                return;
            }
        }
        throw new IllegalArgumentException("Contact ID does not exist");
    }

    public void updateLastName(String contactID, String lastName) {

        checkContactID(contactID);

        // Check each contact in contact array
        for (Contact contact : contacts) {
            if (contact.getContactID().equals(contactID)) {
                contact.setLastName(lastName);
                return;
            }
        }
        throw new IllegalArgumentException("Contact ID does not exist");
    }

    public void updatePhone(String contactID, String phone) {

        checkContactID(contactID);

        for (Contact contact : contacts) {
            if (contact.getContactID().equals(contactID)) {
                contact.setPhone(phone);
                return;
            }
        }
        throw new IllegalArgumentException("Contact ID does not exist");
    }

    public void updateAddress(String contactID, String address) {

        checkContactID(contactID);

        for (Contact contact : contacts) {
            if (contact.getContactID().equals(contactID)) {
                contact.setAddress(address);
                return;
            }
        }
        throw new IllegalArgumentException("Contact ID does not exist");
    }

}