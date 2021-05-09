package projectGamer.concretes;

import projectGamer.abstracts.CampaignService;
import projectGamer.entities.Campaign;

public class CampaingManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Sisteme Eklendi : "+campaign.getCampaignName()+"%"+""+campaign.getDiscountRate());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Sistemden Kaldýrýldý : "+campaign.getCampaignName()+"%"+""+campaign.getDiscountRate());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi : "+campaign.getCampaignName()+"%"+""+campaign.getDiscountRate());
		
	}

}
