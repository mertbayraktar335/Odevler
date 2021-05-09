package projectGamer.concretes;

import projectGamer.abstracts.OrderService;
import projectGamer.entities.Game;
import projectGamer.entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order, Game game) {
		if (order.getDiscountAmount() == 0) {

			System.out.println("Sipariþ Detaylarý : \n" + "\n Sipariþ ID : " + order.getId() + "\n Oyuncu ID : "
					+ order.getGamerId() + "\n Oyun Adý : " + game.getName() + "\n Adet : " + order.getCount()
					+ "\n Toplam : " + (order.getCount()) * (order.getTotalAmount()));
		} else {

			System.out.println("Sipariþ Detaylarý : \n" + "\n Sipariþ ID : " + order.getId() + "\n Oyuncu ID : "
					+ order.getGamerId() + "\n Oyun Adý : " + game.getName() + "\n Kampanya Adý : "
					+ order.getCampaignId() + "\n Adet : " + order.getCount() + "\n Toplam : "
					+ (order.getCount()) * (order.getTotalAmount()) + "\n Ýndirim Miktarý : "
					+ order.getDiscountAmount() + "\n Ýndirimden Sonraki Fiyat : " + order.getPaymentAfterDiscount());
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
		System.out.println("Kampanya Ýndirimi Eklendi : " + order.getDiscountAmount());

	}



}
