import java.util.List;

import com.customer.Customer;
import com.customer.CustomerDAO;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		CustomerDAO cdb=new CustomerDAO();

		Customer c=new Customer("ww", "rr", "rr", "22", "qq");
		cdb.insertDetails(c);
		
//		Customer cusDetails= cdb.validate("k96","123");
//		if(cusDetails!=null) {
//			
//			System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","email","phone no","user name");
//			System.out.format("%-5s %-5s %-15s %-10s %s\n",cusDetails.getId(),cusDetails.getName(),cusDetails.getEmail(),cusDetails.getPhone(),cusDetails.getUserName());
//			System.out.println(cusDetails.getId()+"      "+cusDetails.getName());
//		}
//		else {
//			System.out.println("No such user is presenbhbt");
//		}
//	}
	

}
	}