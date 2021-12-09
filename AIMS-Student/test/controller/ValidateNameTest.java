package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateNameTest {
	
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"nguyenlm, true",
		"nguyen01234, false",
		"$#nguyen, false",
		", false"
	})
	void test(String name, boolean valid) {
		boolean isValid = placeOrderController.validateName(name);
		assertEquals(valid, isValid);
	}
}
