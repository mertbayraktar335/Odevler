package day4hw2.abstracts;

import day4hw2.entities.Customer;

public abstract class  BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Veri tabanýna kaydedildi : "+ customer.getFirstName());
		
	}

}
