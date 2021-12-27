package shippingFee.calculateShippingFeeStrategy;

import java.util.Random;
import java.util.logging.Logger;

import entity.order.Order;
import shippingFee.ShippingFeeCalculator;

public class Strategy2 implements ShippingFeeCalculator {
	/**
     * Just for logging purpose
     */
    private static Logger LOGGER = utils.Utils.getLogger(Strategy2.class.getName());
	@Override
    public int calculateShippingFee(Order order) {
        Random rand = new Random();
        double alterWeight = order.getHeight()*order.getLength()*order.getWidth()/6000;
        int fees = (int) ((order.getTotalWeight() + alterWeight)*( (rand.nextFloat()*10)/100 ));
        LOGGER.info("Order Amount: " + order.getAmount() + " -- Shipping Fees: " + fees);
        return fees;
    }
}
