package projectGamer.adapters;

import java.rmi.RemoteException;

import projectGamer.abstracts.GamerCheckService;
import projectGamer.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckAdapter implements GamerCheckService {

	
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),gamer.getBirthDay().getYear());
		
		} catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		if(result) {
			System.out.println("Kullanýcý Doðrulandý");
		}else {
			System.out.println("Kullanýcý Doðrulanamadý");
			
			}
		
		return result;
	}

	
}