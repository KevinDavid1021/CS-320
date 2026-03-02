package contactservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
	@Test
    void addContact_uniqueId_addsSuccessfully() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Smith", "2105551234", "123 Main Street");

        service.addContact(c);

        assertNotNull(service.getContact("1"));
        assertEquals("John", service.getContact("1").getFirstName());
    }

    @Test
    void addContact_duplicateId_throws() {
        ContactService service = new ContactService();
        service.addContact(new Contact("1", "John", "Smith", "2105551234", "123 Main Street"));

        assertThrows(IllegalArgumentException.class,
                () -> service.addContact(new Contact("1", "Jane", "Doe", "2105559999", "456 Oak Ave")));
    }

    @Test
    void deleteContact_existingId_removesContact() {
        ContactService service = new ContactService();
        service.addContact(new Contact("1", "John", "Smith", "2105551234", "123 Main Street"));

        service.deleteContact("1");

        assertNull(service.getContact("1"));
    }

    @Test
    void deleteContact_missingId_throws() {
        ContactService service = new ContactService();
        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("nope"));
    }

    @Test
    void updateFields_existingId_updatesCorrectly() {
        ContactService service = new ContactService();
        service.addContact(new Contact("U1", "John", "Smith", "2105551234", "123 Main Street"));

        service.updateFirstName("U1", "Mike");
        service.updatePhone("U1", "2105557777");
        service.updateAddress("U1", "789 Pine Road");

        Contact updated = service.getContact("U1");

        assertEquals("Mike", updated.getFirstName());
        assertEquals("2105557777", updated.getPhone());
        assertEquals("789 Pine Road", updated.getAddress());
    }

    @Test
    void update_missingId_throws() {
        ContactService service = new ContactService();
        assertThrows(IllegalArgumentException.class,
                () -> service.updatePhone("missing", "2105557777"));
    }

    @Test
    void update_invalidValue_throws() {
        ContactService service = new ContactService();
        service.addContact(new Contact("1", "John", "Smith", "2105551234", "123 Main Street"));

        assertThrows(IllegalArgumentException.class,
        		() -> service.updatePhone("1", "abcdefghij"));
    }
    
    @Test
    void updateLastName_existingId_updatesSuccessfully() {
        ContactService service = new ContactService();
        service.addContact(new Contact("LN1", "John", "Smith", "2105551234", "123 Main Street"));

        service.updateLastName("LN1", "Johnson");

        Contact updated = service.getContact("LN1");
        assertEquals("Johnson", updated.getLastName());
    }
}
