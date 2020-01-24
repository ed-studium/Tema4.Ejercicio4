package es.Studium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlancaTest4 {

	@Test
	void testCamino1() {
		String resultadoEsperado = "No has introducido un �nico car�cter.";
		String resultadoReal= EsVocal.esVocal("Javier");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCamino2() {
		String resultadoEsperado = "El car�cter no es una letra.";
		String resultadoReal= EsVocal.esVocal("1");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCamino3() {
		String resultadoEsperado = "El car�cter es una vocal.";
		String resultadoReal= EsVocal.esVocal("e");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCamino4() {
		String resultadoEsperado = "El car�cter a veces es una vocal y a veces es una consonante.";
		String resultadoReal= EsVocal.esVocal("y");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCamino5() {
		String resultadoEsperado = "El car�cter es una consonante.";
		String resultadoReal= EsVocal.esVocal("j");
		assertEquals(resultadoEsperado, resultadoReal);
	}

}