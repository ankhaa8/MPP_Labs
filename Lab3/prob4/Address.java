package Lab3.prob4;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	
	Address(String stre, String c, String sta, String z){
		street = stre;
		city = c;
		state = sta;
		zip = z;
	}
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
}
