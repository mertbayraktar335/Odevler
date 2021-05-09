package projectGamer.concretes;


import projectGamer.abstracts.GamerCheckService;
import projectGamer.abstracts.GamerService;
import projectGamer.entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;
	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)==true) {
			System.out.println("Oyuncu Eklendi : "+gamer.getFirstName()+gamer.getLastName());
			
		}
		
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Sistemden Silindi : "+ gamer.getFirstName()+gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Güncellendi"+ gamer.getFirstName()+gamer.getLastName());
		
	}
	
}


