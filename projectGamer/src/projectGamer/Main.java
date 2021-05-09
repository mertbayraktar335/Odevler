package projectGamer;

import java.time.LocalDate;

import projectGamer.adapters.MernisCheckAdapter;
import projectGamer.concretes.GamerManager;
import projectGamer.concretes.OrderManager;
import projectGamer.entities.Game;
import projectGamer.entities.Gamer;
import projectGamer.entities.Order;

public class Main {

	public static void main(String[] args) {
		
		
		Gamer gamer = new Gamer();
		
		gamer.setId(1);
		gamer.setFirstName("Mert");
		gamer.setLastName("Bayraktar");
		gamer.setBirthDay(LocalDate.of(1995, 8, 10));
		gamer.setNationalityId("53875133410");
		
		
		GamerManager gamerManager = new GamerManager(new MernisCheckAdapter());
		
		gamerManager.add(gamer);
		
		Game game1 = new Game();
		game1.setName("DOTA");
				
		
		
		Order order1 =new Order();
		
		order1.setId(1);
		order1.setGamerId(1);
		order1.setGameId(1);
		order1.setCount(2);
		order1.setTotalAmount(25000);
		order1.setDiscountAmount(59);
		order1.setCampaignId(1);
		
		
		
		
		OrderManager orderM = new OrderManager();
			
		orderM.add(order1, game1);
		
	
		
	
				
		
	

	}

}
