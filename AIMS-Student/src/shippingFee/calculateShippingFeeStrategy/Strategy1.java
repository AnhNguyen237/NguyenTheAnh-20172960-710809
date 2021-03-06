package shippingFee.calculateShippingFeeStrategy;

import java.util.Random;
import java.util.logging.Logger;

import entity.order.Order;
import shippingFee.ShippingFeeCalculator;

public class Strategy1 implements ShippingFeeCalculator {
	/**
     * Just for logging purpose
     */
    private static Logger LOGGER = utils.Utils.getLogger(Strategy1.class.getName());
	@Override
    public int calculateShippingFee(Order order) {
		Random rand = new Random();
        int fees = (int)( ( (rand.nextFloat()*10)/100 ) * order.getAmount() );
        LOGGER.info("Order Amount: " + order.getAmount() + " -- Shipping Fees: " + fees);
        return fees;
    }
}
