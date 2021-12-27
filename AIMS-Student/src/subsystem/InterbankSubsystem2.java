package subsystem;

import entity.payment.PaymentCard;
import entity.payment.PaymentTransaction;
import subsystem.interbank.InterbankSubsystemController;
import subsystem.interbankInterface.PayOrder;

public class InterbankSubsystem2 implements PayOrder{
	/**
	 * Represent the controller of the subsystem
	 */
	private InterbankSubsystemController ctrl;

	/**
	 * Initializes a newly created {@code InterbankSubsystem} object so that it
	 * represents an Interbank subsystem.
	 */
	public InterbankSubsystem2() {
		String str = new String();
		this.ctrl = new InterbankSubsystemController();
	}

	/**
	 * @see InterbankInterface#payOrder(entity.payment.CreditCard, int,
	 *      java.lang.String)
	 */
	public PaymentTransaction payOrder(PaymentCard card, int amount, String contents) {
		PaymentTransaction transaction = ctrl.payOrder(card, amount, contents);
		return transaction;
	}
}
