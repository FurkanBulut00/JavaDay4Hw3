package Concrete;

import Abstract.CustomerService;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	
	ICustomerCheckService customerCheckService;
	public CustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Kullanici eklendi : " +customer.getUserName());
		}else {
			System.out.println("Geçerli bir kullanici giriniz :");
		}
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanici güncellendi : "+customer.getUserName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanici silindi : "+customer.getUserName());
		
	}
	
}
