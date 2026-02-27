package contactservice;

public class Contact {
	// create unique contact ID 
	private String contactID;
	
	private String firstName;
	
	private String lastName;
	
	private String phone;
	
	private String address;
	
	/**
	 * create a new contact
	 * checks that contactID, firstName, lastName, phone, and address meet requirements
	 * @param contactID the contact ID - cannot be null or longer than 10 characters
	 * @param firstName the contact's first name - cannot be null or longer than 10 characters
	 * @param lastName the contact's last name - cannot be null or longer than 10 characters
	 * @param phone the contact's phone number - must be exactly 10 digits, cannot be null
	 * @param address the contact's address - cannot be null or longer than 30 characters
	 * @throws IllegalArgumentException if any validation fails
	 */
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		// name cant be null or more than 10 characters 
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		// contactID cant be null or more than 10 characters
		if (contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (phone == null || !phone.matches("\\d{10}")) {
		    throw new IllegalArgumentException("Invalid phone must be exactly 10 digits");
		}
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		// if valid, set values
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// get contact id
	public String getContactID() {
		return contactID;
	}
	
	// get user first name 
	public String getFirstName() {
		return firstName;
	}
	
	// get user last name
	public String getLastName() {
		return lastName;
	}
	
	// get phone number 
	public String getPhone() {
		return phone;
	}
	
	//get address
	public String getAddress() {
		return address;
	}
}
