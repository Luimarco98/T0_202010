package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		setUp2();
		assertEquals(100, modelo.darTamano());
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		setUp2();
		assertEquals(100, modelo.darTamano());
		modelo.agregar(101);
		assertEquals(101, modelo.darTamano());
	}

	@Test
	public void testBuscar() {
		setUp2();
		assertSame(20, modelo.buscar(20));
		// TODO Completar la prueba
	}

	@Test
	public void testEliminar() {
		setUp2();
		assertEquals(100,modelo.darTamano());
		assertSame(20,modelo.eliminar(20));
		assertEquals(99,modelo.darTamano());
		// TODO Completar la prueba
		
	}

}
