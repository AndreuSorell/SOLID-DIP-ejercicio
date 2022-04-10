package edu.poniperro;

import org.junit.Assert;
import org.junit.Test;

import edu.poniperro.bbdd.Inventario;
import edu.poniperro.bbdd.InventarioBBDD;
import edu.poniperro.negocio.Controlador;
import edu.poniperro.negocio.ControladorEstoc;

public class TestControladorEstoc {

	@Test
	public void test_control_estoc() {
        Inventario inventario = new InventarioBBDD();
		Controlador controlador = new ControladorEstoc(inventario);
		
		Assert.assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
		Assert.assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

	}
}
