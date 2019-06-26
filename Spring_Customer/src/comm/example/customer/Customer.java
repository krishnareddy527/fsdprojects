package comm.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:customer.properties")
public class Customer implements Human {
	
	@Value("${customerId}")
	private int customerId;
	
	@Value("${customerName}")
	private String customerName;
	
	@Autowired
	@Qualifier("homeAddress")
	//@Qualifier("officeAddress")
	private Address address;

	/*
	 * @Autowired public Customer(@Qualifier("officeAddress") Address address) {
	 * super(); this.address = address; }
	 */

	/*
	 * @Autowired public Customer(@Qualifier("homeAddress") Address address) {
	 * super(); this.address = address; }
	 */

	@Override
	public String getDetails() {
		return "customerId:"+customerId  +"   customerName:"+customerName+"  address:"+ address.getAddress();
	}
}
