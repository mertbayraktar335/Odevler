package day4hw2.concretes;

import day4hw2.abstracts.BaseCustomerManager;
import day4hw2.abstracts.CustomerCheckService;
import day4hw2.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
		
	}
		
		@Override
		public void save(Customer customer) {
			
			if(customerCheckService.CheckIfRealPerson(customer)) {
				
		    super.save(customer);
				
			}else {
				
				System.out.println("Uygun kullanýcý deðil!");
			}

}
		
}
