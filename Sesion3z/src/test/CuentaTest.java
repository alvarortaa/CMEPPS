package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	static Cuenta ctaPruebas;
	double aux;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas=new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		aux=ctaPruebas.getSaldo();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testRetirar() {
		ctaPruebas.retirar(3000);
		assertEquals(aux-3000,ctaPruebas.getSaldo());
	}
	@Test
	void testIngresar() {
		ctaPruebas.ingresar(3000);
		assertEquals(aux+3000,ctaPruebas.getSaldo());
	}
	@Test
	void testRetirarsinSaldoSuficiente() {
		ctaPruebas.retirar(3000);
		assertEquals(aux,ctaPruebas.getSaldo());
	}

}
