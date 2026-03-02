package contactservice;

public class Contact {
	private final String contactId;	//not updatable
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		this.contactId = require(contactId, "contactId", 10);
		this.firstName = require(firstName, "firstName", 10);
		this.lastName = require(lastName, "lastName", 10);
		this.phone = requirePhone(phone);
		this.address = require(address, "address", 30);
	}
	
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = require(firstName, "firstName", 10);
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = require(lastName, "lastName", 10);
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = requirePhone(phone);
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = require(address, "address", 30);
	}
	
	private static String require(String value, String fieldName, int maxLength) {
		if (value == null) {
			throw new IllegalArgumentException(fieldName + " cannot be null");
		}
		if (value.isEmpty()) {
			throw new IllegalArgumentException(fieldName + " cannot be empty");
		}
		if (value.length() > maxLength) {
			throw new IllegalArgumentException(fieldName + " cannot exceed " + maxLength + " characters");
		}
		return value;
	}
	
	private static String requirePhone(String phone) {
		if (phone == null) {
			throw new IllegalArgumentException("phone cannot be null");
		}
		if (!phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("phone must be exactly 10 digits");
		}
		return phone;
	}
}
