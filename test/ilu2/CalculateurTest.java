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
	void test1() {
		assertEquals(calc.ajoute("42"), "42");
	}

	@Test
	void test2() {
		assertEquals(calc.ajoute(""), "0");
	}

	@Test
	void test3() {
		assertEquals(calc.ajoute("1,2"), "3");
	}

	@Test
	void test4() {
		assertEquals(calc.ajoute("1,2,3"), "6");
	}

	@Test
	void test5() {
		assertEquals(calc.ajoute("1,1000,2000,2"), "3");
		assertEquals(calc.ajoute("1000,1,2000"), "1");
		assertEquals(calc.ajoute("1000"), "0");
	}

	@Test
	void test6() {
		assertEquals(calc.ajoute("1,2, 3"), "6");
		assertEquals(calc.ajoute(" "), "0");
	}

	@Test
	void test7() {
		assertEquals(calc.ajoute("-666"), "erreur");
		assertEquals(calc.ajoute("7,-5"), "erreur");
		assertEquals(calc.ajoute("-1,-2,-3"), "erreur");
	}

	@Test
	void test8() {
		assertEquals(calc.ajoute("1, 2, 3, "), "erreur");
		assertEquals(calc.ajoute("1, ,2"), "erreur");
		assertEquals(calc.ajoute("1, "), "erreur");
		assertEquals(calc.ajoute(","), "erreur");

	}
}
