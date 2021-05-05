package gameProject;

import java.util.Date;

import Abstract.CustomerService;
import Abstract.SaleService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1, "Path Of Exile", 100);
		Game game2 = new Game(2, "Last Epoch", 100);
		Campaign campaign = new Campaign(1, "Yaz Ýndirimi", 50);
		Customer customer1 = new Customer(1,"GabreaL","FURKAN","BULUT",new Date(1996,6,27),"35908569588");
		Customer customer2= new Customer(2,"Hugir","Musa","Hýzýr",new Date(1976,4,27),"11111111111");
		System.out.println("---------------------------------------------");
		System.out.println("----Oyun ekleme çýkarma güncelleme----");
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game1);
		gameManager.update(game1);
		System.out.println("---------------------------------------------");
		System.out.println("----Kampanya ekleme çýkarma güncelleme----");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		System.out.println("---------------------------------------------");
		System.out.println("----Geçerli Geçersiz Kullanici----");
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.add(customer1);
		customerManager.add(customer2);
		System.out.println("---------------------------------------------");
		System.out.println("----Kampayasiz satis islemi----");
		SaleManager saleManager = new SaleManager();
		saleManager.sale(customer1, game1);
		System.out.println("---------------------------------------------");
		System.out.println("----Kampanyali satis islemi----");
		saleManager.sale(customer1, game2, campaign);

	}

}
