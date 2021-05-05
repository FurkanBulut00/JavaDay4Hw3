package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SaleService {
	void sale(Customer customer,Game game);
	void sale(Customer customer,Game game,Campaign campaign);

}
