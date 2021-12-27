package entity.payment.card;

import entity.payment.PaymentCard;

public class DomesticCreditCard extends PaymentCard{
	private String issuingBank;
    private String cardNumber;
    private String dateValid;
    private String cardHolder;

    public DomesticCreditCard(String issuingBank, String cardNumber, String dateValid, String cardHolder) {
        this.issuingBank = issuingBank;
        this.cardNumber = cardNumber;
        this.dateValid = dateValid;
        this.cardHolder = cardHolder;
    }
}
