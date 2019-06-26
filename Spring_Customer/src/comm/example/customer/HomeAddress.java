package comm.example.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:customer.properties")
public class HomeAddress implements Address {
	
	@Value("${home.lane}")
	private String lane;
	
	@Value("${home.phone}")
	private String phone;
	
	@Override
	public String getAddress() {
		return lane+" "+phone;
	}
}
