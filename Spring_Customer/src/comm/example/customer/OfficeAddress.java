package comm.example.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:customer.properties")
public class OfficeAddress implements Address {
	
	@Value("${office.lane}")
	private String lane;
	
	@Value("${office.phone}")
	private String phone;
	
	@Override
	public String getAddress() {
		return lane+" "+phone;
	}

}
