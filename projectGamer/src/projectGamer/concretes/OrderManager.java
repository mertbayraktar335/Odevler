package projectGamer.concretes;

import projectGamer.abstracts.OrderService;
import projectGamer.entities.Game;
import projectGamer.entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order, Game game) {
		if (order.getDiscountAmount() == 0) {

			System.out.println("Sipari� Detaylar� : \n" + "\n Sipari� ID : " + order.getId() + "\n Oyuncu ID : "
					+ order.getGamerId() + "\n Oyun Ad� : " + game.getName() + "\n Adet : " + order.getCount()
					+ "\n Toplam : " + (order.getCount()) * (order.getTotalAmount()));
		} else {

			System.out.println("Sipari� Detaylar� : \n" + "\n Sipari� ID : " + order.getId() + "\n Oyuncu ID : "
					+ order.getGamerId() + "\n Oyun Ad� : " + game.getName() + "\n Kampanya Ad� : "
					+ order.getCampaignId() + "\n Adet : " + order.getCount() + "\n Toplam : "
					+ (order.getCount()) * (order.getTotalAmount()) + "\n �ndirim Miktar� : "
					+ order.getDiscountAmount() + "\n �ndirimden Sonraki Fiyat : " + order.getPaymentAfterDiscount());
		}

	}

	@Override
	public void delete(Order order) {

	}

	@Override
	public void update(Order order) {

	}

	@Override
	public void addDiscount(Order order) {
		System.out.println("Kampanya �ndirimi Eklendi : " + order.getDiscountAmount());

	}



}
