package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService {

	@Override
	public void sale(Customer customer, Game game) {
		System.out.println(game.getName()+" oyunu "+customer.getUserName()+" tarafindan "+game.getPrice()+" fiyatina alindi.");
		
	}

	@Override
	public void sale(Customer customer, Game game, Campaign campaign) {
		double afterDiscount = game.getPrice()*((double)campaign.getDiscount()/100);
		System.out.println(game.getName()+" oyunu "+customer.getUserName()+" tarafindan " +campaign.getCampaignName()+" kampanyasi kullanilarak " +"%"+(campaign.getDiscount()+"indirim uygulanarak " ) 
		+" "+ afterDiscount+ " fiyatina alindi. " );
	}

}
