package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {
    
    @Test
    void testContact() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(contact.getContactID().equals("123"));
        assertTrue(contact.getFirstName().equals("John"));
        assertTrue(contact.getLastName().equals("Doe"));
        assertTrue(contact.getPhone().equals("1234567890"));
        assertTrue(contact.getAddress().equals("123 Main St"));
    }
    
    @Test
    void testContactIDTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testContactIDIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "JohnathanXX", "Doe", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testFirstNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", null, "Doe", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "John", "DoeJohnsonXX", "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testLastNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "John", null, "1234567890", "123 Main St");
        });
    }
    
    @Test
    void testPhoneNotTenDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "John", "Doe", "123456789", "123 Main St");
        });
    }
    
    @Test
    void testPhoneIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "John", "Doe", null, "123 Main St");
        });
    }
    
    @Test
    void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "John", "Doe", "1234567890", "123 Main Street That Is Very Long Address");
        });
    }
    
    @Test
    void testAddressIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "John", "Doe", "1234567890", null);
        });
    }
}
