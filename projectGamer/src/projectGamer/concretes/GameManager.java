package projectGamer.concretes;

import projectGamer.abstracts.GameService;
import projectGamer.entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Sisteme Eklendi : "+game.getName()+""+game.getPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Sistemden Silindi : "+game.getName()+""+game.getPrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Bilgisi Güncellendi : "+game.getName()+""+game.getPrice());
		
	}

}
