package shippingFee;

import entity.order.Order;

public interface ShippingFeeCalculator {
	int calculateShippingFee(Order order);
}
