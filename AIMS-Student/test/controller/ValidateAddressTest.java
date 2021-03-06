package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateAddressTest {

	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"hanoi, true",
		"so 15 Hai Ba Trung Ha Noi, true",
		"$# Hanoi, false",
		", false",
	})
	void test(String address, boolean valid) {
		boolean isValid = placeOrderController.validateAddress(address);
		assertEquals(valid, isValid);
	}
}
