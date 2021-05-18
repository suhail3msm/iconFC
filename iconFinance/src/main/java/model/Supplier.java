package model;

public class Supplier {

	private String Client_Code;
	private String name;
	private String address;
	private String city;
	private String state;
	private String province;
	private String country;
	private String email;
	private long mobile;
	private String credit;
	private String supplier_lmt;
	private String invoice_payment;

	public Supplier() {
		super();
	}

	public Supplier(String client_Code, String name, String address, String city, String state, String province,
			String country, String email, long mobile, String credit, String supplier_lmt, String invoice_payment) {
		super();
		Client_Code = client_Code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.province = province;
		this.country = country;
		this.email = email;
		this.mobile = mobile;
		this.credit = credit;
		this.supplier_lmt = supplier_lmt;
		this.invoice_payment = invoice_payment;
	}

	public String getClient_Code() {
		return Client_Code;
	}

	public void setClient_Code(String client_Code) {
		Client_Code = client_Code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getSupplier_lmt() {
		return supplier_lmt;
	}

	public void setSupplier_lmt(String supplier_lmt) {
		this.supplier_lmt = supplier_lmt;
	}

	public String getInvoice_payment() {
		return invoice_payment;
	}

	public void setInvoice_payment(String invoice_payment) {
		this.invoice_payment = invoice_payment;
	}

}
