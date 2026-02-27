package contactservice;

import java.util.ArrayList;

public class ContactService {
	// a list to store all contacts
	private ArrayList<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	// adding a new contact
	
	/**
	 * adds a new contact to the list
	 * checks that the ID isn't already taken first
	 * @param contact the contact to add
	 * @throws IllegalArgumentException if ID already exists
	 */
	public void addContact(Contact contact) {
		// make sure the contact ID doesnt already exist
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID().equals(contact.getContactID())) {
				throw new IllegalArgumentException("Contact ID already exists");
			}
		}
		contacts.add(contact);
	}
	
	// delete contact 
	
	/**
	 * deletes a contact by ID
	 * @param contactID the ID of the contact to remove
	 */
	
	public void deleteContact(String contactID) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID().equals(contactID)) {
				contacts.remove(i);
				return;
			}
		}
	}
	
	// update name
	
	/**
	 * changes the first name of a contact
	 * @param contactID which contact to update
	 * @param firstName the new first name
	 */
	
	public void updateFirstName(String contactID, String firstName) {
		for (int i = 0; i < contacts.size(); i++) {
			Contact contact = contacts.get(i);
			if (contact.getContactID().equals(contactID)) {
				Contact updatedContact = new Contact(
						contactID,
						firstName,
						contact.getLastName(),
						contact.getPhone(),
						contact.getAddress()
				);
				contacts.set(i,  updatedContact);
				return;
			}
		}
	}
	
	// update last name 
	
	/**
	 * changes the last name of a contact
	 * @param contactID which contact to update
	 * @param lastName the new last name
	 */
	
	public void updateLastName(String contactID, String lastName) {
		for (int i = 0; i < contacts.size(); i++) {
			Contact contact = contacts.get(i);
			if (contact.getContactID().equals(contactID)) {
				Contact updatedContact = new Contact(
						contactID,
						contact.getFirstName(),
						lastName,
						contact.getPhone(),
						contact.getAddress()
				);
				contacts.set(i,  updatedContact);
				return;
			}
		}
	}
	
	// Update phone info
	public void updatePhone(String contactID, String phone) {
		for (int i = 0; i < contacts.size(); i++) {
			Contact contact = contacts.get(i);
			if (contact.getContactID().equals(contactID)) {
				Contact updatedContact = new Contact(
						contactID,
						contact.getFirstName(),
						contact.getLastName(),
						phone,
						contact.getAddress()
				);
				contacts.set(i,  updatedContact);
				return;
			}
		}
	}
	 // Update address
	
	/**
	 * updates the address for a contact
	 * @param contactID which contact to update
	 * @param address the new address
	 */
	
    public void updateAddress(String contactID, String address) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getContactID().equals(contactID)) {
                Contact updatedContact = new Contact(
                        contactID,
                        contact.getFirstName(),
                        contact.getLastName(),
                        contact.getPhone(),
                        address
                );
                contacts.set(i, updatedContact);
                return;
            }
        }
    }
}
