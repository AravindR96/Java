package Com.Spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Com.Spring.beans.Address;

@Configuration
public class MyConfiguration {
	@Bean(name="address")
	public Address address() {
		Address address=new Address();
	       address.setAddressLine1("tambaram");
	        address.setAddressLine2("chennai");
            return address;
	}

}
