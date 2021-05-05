package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = false;
			try {
			return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),customer.getBirthDay().getYear());
			} catch (NumberFormatException e) {
				
				
			} catch (RemoteException e) {
				
			
			}

		
		return result;
	}

}
