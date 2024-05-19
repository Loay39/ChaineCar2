package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculateurTest {
	Calculateur calc;

	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculateur();
	}

	@Test
	void testAjoute() {
		assertEquals(calc.ajoute("42"), "42");
		assertEquals(calc.ajoute(","), ",");
	}

}