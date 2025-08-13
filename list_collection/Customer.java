package list_collection;

class Customer {
	private int id;
	private String name;
	private int contact;
	private String location;
	private int items_purchased;
	private String mail;
	
	public Customer(int id, String name, int contact, String location, int items_purchased, String mail) {
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.location = location;
		this.items_purchased = items_purchased;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getContact() {
		return contact;
	}

	public String getLocation() {
		return location;
	}

	public int getItems_purchased() {
		return items_purchased;
	}

	public String getMail() {
		return mail;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer{" +
				"ID=" + id + 
				", Name =" + name +
				", Contact = "+ contact +
				", Location = " + location +
				", Items purchased= " + items_purchased +
				", Mail id = " + mail + '\'' + 
				'}';
	}
}	

