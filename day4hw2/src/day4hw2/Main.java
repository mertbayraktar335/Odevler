package day4hw2;

import java.time.LocalDate;

import day4hw2.abstracts.BaseCustomerManager;
import day4hw2.adapters.MernisServiceAdapter;
import day4hw2.concretes.NeroCustomerManager;
import day4hw2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
				Customer customer1 = new Customer();
				
				customer1.setId(1);
				customer1.setFirstName("Engin");
				customer1.setLastName("Demiroð");
				customer1.setNationalityId("28861499108");
				customer1.setDateOfBirth(LocalDate.of(1985, 1, 5));
				
				
				BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
				customerManager.save(customer1);
				
			
					}

		}
