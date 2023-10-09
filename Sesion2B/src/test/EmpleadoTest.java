package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;



class EmpleadoTest {
	
	private float ventasdef,horasdef;
	pkg.Empleado.TipoEmpleado vendedor,encargado,otro;
	
	
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
		vendedor = pkg.Empleado.TipoEmpleado.Vendedor;
		encargado = pkg.Empleado.TipoEmpleado.Encargado;
		otro = pkg.Empleado.TipoEmpleado.valueOf(null);
		ventasdef=1100;
		horasdef=0;
	}
	

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
		
	}

	@Test
	void testCalculoNominaBrutaEncargado() {
		float expected=2600;
		float actual= Empleado.calculoNominaBruta(encargado,ventasdef,horasdef);
		assertEquals(expected,actual);
	//Me salen fail todos los tests y no entiendo el porque, en teoria debería estar correcto...
	//Los demás tests están comentados y sin realizar para minimizar la informacion e intentar ver el fallo.
		
	}
/*
	@Test
	void testCalculoNominaBrutaVendedor() {
		fail("Not yet implemented");
	}
	@Test
	void testCalculoNominaBrutaOtro() {
		fail("Not yet implemented");
	}
	@Test
	void testCalculoNominaBrutaVentasMesNegativa() {
		fail("Not yet implemented");
	}
	void testCalculoNominaBrutaVentasMesMenor1000() {
		fail("Not yet implemented");
	}
	void testCalculoNominaBrutaventasMesEntre1000y1500() {
		fail("Not yet implemented");
	}
	void testCalculoNominaBrutaVentasMesMayor1500() {
		fail("Not yet implemented");
	}
	void testCalculoNominaBrutaHorasExtraPositivas() {
		fail("Not yet implemented");
	}
	void testCalculoNominaBrutaHorasExtraNegativas() {
		fail("Not yet implemented");
	}
	@Test
	void testCalculoNominaNetanegativa() {
		fail("Not yet implemented");
	}
	void testCalculoNominaNetaMenos2100() {
		fail("Not yet implemented");
	}
	void testCalculoNominaNetaEntre2100y2500() {
		fail("Not yet implemented");
	}
	void testCalculoNominaNetaMayor2500() {
		fail("Not yet implemented");
	}
*/

}
