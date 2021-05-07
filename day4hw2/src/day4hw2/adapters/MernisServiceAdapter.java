package day4hw2.adapters;

import java.rmi.RemoteException;

import day4hw2.abstracts.CustomerCheckService;
import day4hw2.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		
		} catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
}
