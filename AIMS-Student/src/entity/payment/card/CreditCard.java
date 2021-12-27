package entity.payment.card;

import entity.payment.PaymentCard;

public class CreditCard extends PaymentCard {
	private String cardCode;
	private String owner;
	private int cvvCode;
	private String dateExpired;

	public CreditCard(String cardCode, String owner, int cvvCode, String dateExpired) {
		super();
		this.cardCode = cardCode;
		this.owner = owner;
		this.cvvCode = cvvCode;
		this.dateExpired = dateExpired;
	}
}
