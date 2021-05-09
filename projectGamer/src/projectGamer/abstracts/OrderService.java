package projectGamer.abstracts;

import projectGamer.entities.Game;
import projectGamer.entities.Order;

public interface OrderService {
	
	void add(Order order, Game game);

	void delete(Order order);

	void update(Order order);
	
	void addDiscount(Order order);

	

	

}
