package Com.Spring.beans;

public class Address {
 private String AddressLine1;
 private String AddressLine2;
@Override
public String toString() {
	return "Address [AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2 + "]";
}
public Address(String addressLine1, String addressLine2) {
	super();
	AddressLine1 = addressLine1;
	AddressLine2 = addressLine2;
}
public Address() {
	super();
	System.out.println("In Address Constructor");
}
public String getAddressLine1() {
	return AddressLine1;
}
public void setAddressLine1(String addressLine1) {
	System.out.println("In SetAddressLine1 Setter Method");
	AddressLine1 = addressLine1;
}
public String getAddressLine2() {
	
	return AddressLine2;
}
public void setAddressLine2(String addressLine2) {
	System.out.println("In SetAddressLine2 Setter Method");
	AddressLine2 = addressLine2;
}
 
}
