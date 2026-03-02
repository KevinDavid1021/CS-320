package contactservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {
	
	@Test
	void createContact_validInputs_storesValues() {
		Contact c = new Contact("A123", "John", "Smith", "2105551234", "123 Main Street");

        assertEquals("A123", c.getContactId());
        assertEquals("John", c.getFirstName());
        assertEquals("Smith", c.getLastName());
        assertEquals("2105551234", c.getPhone());
        assertEquals("123 Main Street", c.getAddress());
	}
	
	@Test
	void createContact_nullId_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact(null, "John", "Smith", "2105551234", "123 Main Street"));
    }
	
	@Test
    void createContact_idTooLong_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("12345678901", "John", "Smith", "2105551234", "123 Main Street"));
    }

    @Test
    void createContact_phoneNot10Digits_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("A123", "John", "Smith", "555", "123 Main Street"));
    }

    @Test
    void setFirstName_tooLong_throws() {
        Contact c = new Contact("A123", "John", "Smith", "2105551234", "123 Main Street");
        assertThrows(IllegalArgumentException.class, () -> c.setFirstName("ThisNameIsTooLong"));
    }
}
