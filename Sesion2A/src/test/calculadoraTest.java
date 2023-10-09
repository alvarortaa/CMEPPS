package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.calculadora;

class calculadoraTest {
	private int value1,value2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
		value1=15;
		value2=3;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSuma() {
		int expected=18;
		int actual= calculadora.suma(value1, value2);
		assertEquals(expected,actual);
		
	}

	@Test
	void testResta() {
		int expected=12;
		int actual= calculadora.resta(value1, value2);
		assertEquals(expected,actual);
	}

	@Test
	void testMultiplica() {
		int expected=45;
		int actual= calculadora.multiplica(value1, value2);
		assertEquals(expected,actual);
	}

	@Test
	void testDivide() {
		int expected=5;
		int actual= calculadora.divide(value1, value2);
		assertEquals(expected,actual);
	}

}
