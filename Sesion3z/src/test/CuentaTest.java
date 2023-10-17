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
	static Cuenta cta12345;
	static Cuenta cta67890;
	double aux;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas = new Cuenta("0","Alvaro",0);
		cta12345 = new Cuenta("12345", "Pepe",50);
		cta67890 = new Cuenta("67890","Juan",0);
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
		ctaPruebas.retirar(1);
		assertEquals(aux-1,ctaPruebas.getSaldo());
	}
	@Test
	void testIngresar() {
		ctaPruebas.ingresar(3000);
		assertEquals(aux+3000,ctaPruebas.getSaldo());
	}
	@Test
	void testRetirarsinSaldoSuficiente() {
		ctaPruebas.retirar(100000);
		
		assertEquals(aux,ctaPruebas.getSaldo());
	}
	@Test
	void test0014() {
		
		cta12345.retirar(200);
		
		cta67890.retirar(350);
		cta12345.ingresar(100);
		cta67890.retirar(200);
		cta67890.retirar(150);
		cta12345.retirar(200);
		cta67890.ingresar(50);
		cta67890.retirar(100);
		
		
		assertEquals(-250, cta12345.getSaldo());
		
		assertEquals(-450, cta67890.getSaldo());
		
	}

}
