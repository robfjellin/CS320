package mod3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	   
	   @Test
	   void testAddContact() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	   }
	   
	   @Test
	   void testAddNullContact() {
	       ContactService contactService = new ContactService();
	       assertThrows(IllegalArgumentException.class, () -> {
	           contactService.addContact(null);
	       });
	   }
	   
	   @Test 
	   void testAddDuplicateContact() {
	       ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       Contact contact2 = new Contact("021499", "Bob", "Smith", "9876543210", "Miami, Florida");
	       
	       contactService.addContact(contact1);
	       assertThrows(IllegalArgumentException.class, () -> {
	           contactService.addContact(contact2);
	       });
	   }

	   @Test
	   void testDeleteContact() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	       contactService.deleteContact("021499");
	   }
	   
	   @Test
	   void testDeleteInvalidContactID() {
	       ContactService contactService = new ContactService();
	       assertThrows(IllegalArgumentException.class, () -> {
	           contactService.deleteContact(null);
	       });
	   }

	   @Test
	   void testUpdateFirstName() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	       contactService.updateFirstName("021499", "Robert");
	   }
	   
	   @Test
	   void testUpdateFirstNameInvalidID() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	       assertThrows(IllegalArgumentException.class, () -> {
	           contactService.updateFirstName("999999", "Robert");
	       });
	   }

	   @Test
	   void testUpdateLastName() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	       contactService.updateLastName("021499", "Smith");
	   }
	   
	   @Test
	   void testUpdateLastNameInvalidID() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	       assertThrows(IllegalArgumentException.class, () -> {
	           contactService.updateLastName("999999", "Smith");
	       });
	   }

	   @Test
	   void testUpdatePhone() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	       contactService.updatePhone("021499", "9876543210");
	   }
	   
	   @Test
	   void testUpdatePhoneInvalidID() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	       assertThrows(IllegalArgumentException.class, () -> {
	           contactService.updatePhone("999999", "9876543210");
	       });
	   }

	   @Test
	   void testUpdateAddress() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	       contactService.updateAddress("021499", "Miami, Florida");
	   }
	   
	   @Test
	   void testUpdateAddressInvalidID() {
	       ContactService contactService = new ContactService();
	       Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
	       contactService.addContact(contact);
	       assertThrows(IllegalArgumentException.class, () -> {
	           contactService.updateAddress("999999", "Miami, Florida");
	       });
	   }
	}
