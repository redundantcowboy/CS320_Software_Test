package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
    
    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        // If no exception is thrown, test passes
    }
    
    @Test
    void testAddDuplicateContact() {
        ContactService service = new ContactService();
        Contact contact1 = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        Contact contact2 = new Contact("123", "Jane", "Smith", "0987654321", "456 Oak St");
        service.addContact(contact1);
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact2);
        });
    }
    
    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        service.deleteContact("123");
        // If no exception is thrown, test passes
        // Try to delete again (should do nothing since contact is already deleted)
        service.deleteContact("123");
    }
    
    @Test
    void testUpdateFirstName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        service.updateFirstName("123", "Jane");
        // If no exception is thrown, test passes
    }
    
    @Test
    void testUpdateLastName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        service.updateLastName("123", "Smith");
        // If no exception is thrown, test passes
    }
    
    @Test
    void testUpdatePhone() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        service.updatePhone("123", "0987654321");
        // If no exception is thrown, test passes
    }
    
    @Test
    void testUpdateAddress() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        service.updateAddress("123", "456 Oak Street");
        // If no exception is thrown, test passes
    }
    
    @Test
    void testUpdateNonExistentContact() {
        ContactService service = new ContactService();
        // Try to update a contact that doesn't exist
        service.updateFirstName("999", "Jane");
        // Should do nothing (no exception)
    }
}