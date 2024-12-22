package mod3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
    void testValidContact() {
        Contact contact = new Contact("021499", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
        assertEquals("021499", contact.getContactID());
        assertEquals("Rob", contact.getFirstName());
        assertEquals("Fjellin", contact.getLastName());
        assertEquals("0123456789", contact.getPhone());
        assertEquals("Tampa, Florida", contact.getAddress());
    }

    @Test
    void testNullContactID() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Rob", "Fjellin", "0123456789", "Tampa, Florida");
        });
    }

    @Test
    void testLongContactID() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("02149912345", "Rob", "Fjellin", "0123456789", "Tampa, Florida");
        });
    }

    @Test
    void testNullFirstName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("021499", null, "Fjellin", "0123456789", "Tampa, Florida");
        });
    }

    @Test
    void testLongFirstName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("021499", "RobertJacob", "Fjellin", "0123456789", "Tampa, Florida");
        });
    }

    @Test
    void testNullLastName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("021499", "Rob", null, "0123456789", "Tampa, Florida");
        });
    }

    @Test
    void testLongLastName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("021499", "Rob", "FjellinJacobs", "0123456789", "Tampa, Florida");
        });
    }

    @Test
    void testNullPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("021499", "Rob", "Fjellin", null, "Tampa, Florida");
        });
    }

    @Test
    void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("021499", "Rob", "Fjellin", "012345", "Tampa, Florida");
        });
    }

    @Test
    void testNullAddress() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("021499", "Rob", "Fjellin", "0123456789", null);
        });
    }

    @Test
    void testLongAddress() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("021499", "Rob", "Fjellin", "0123456789", 
                "Tampa, Florida, United States of America 33600");
        });
    }
}
