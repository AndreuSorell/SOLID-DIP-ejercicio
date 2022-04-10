package edu.poniperro;

import org.junit.Assert;
import org.junit.Test;

import edu.poniperro.bbdd.InventarioBBDD;
import edu.poniperro.negocio.ControladorEstoc;

public class TestControladorEstoc {

	@Test
	public void test_control_estoc() {
		ControladorEstoc controlador = new ControladorEstoc(new InventarioBBDD());
		
		Assert.assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
		Assert.assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

	}
}
