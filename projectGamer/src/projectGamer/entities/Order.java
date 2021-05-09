package projectGamer.entities;

import projectGamer.abstracts.Entity;

public class Order implements Entity{
	
	private int id;
	private int gamerId;
	private int gameId;
	private int campaignId;
	private int count;
	private int totalAmount;
	private int discountAmount;
	private int amountOfPayment;
	private double paymentAfterDiscount;
	
	public Order(int id, int gamerId, int gameId, int campaignId, int count, int totalAmount, int discountAmount,
			int amountOfPayment,double paymentAfterDiscount) {
		super();
		this.id = id;
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.count = count;
		this.totalAmount = totalAmount;
		this.discountAmount = discountAmount;
		this.amountOfPayment = amountOfPayment;
		this.paymentAfterDiscount = paymentAfterDiscount;
	}

	
	

	public double getPaymentAfterDiscount() {
		return this.totalAmount-(this.totalAmount*this.discountAmount/100);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getAmountOfPayment() {
		return amountOfPayment;
	}

	public void setAmountOfPayment(int amountOfPayment) {
		this.amountOfPayment = amountOfPayment;
	}

	public Order() {
		
	}
	
	
	

}
