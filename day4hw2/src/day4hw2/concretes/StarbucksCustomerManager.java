package day4hw2.concretes;

import day4hw2.abstracts.BaseCustomerManager;
import day4hw2.abstracts.CustomerCheckService;
import day4hw2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  { //BaseCsutomerManager burada super
	
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
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
	
	
		
	

	
	
	
	
	
	


