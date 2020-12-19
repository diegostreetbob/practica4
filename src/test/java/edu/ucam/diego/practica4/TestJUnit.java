package edu.ucam.diego.practica4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {

	@Test
	public void test_getArea() {
		Rectangulo rect = new Rectangulo(3,3);
		double areareal = rect.getArea();
		double areaesperada=9.0;
		assertEquals(areaesperada, areareal,0);	
	}
	
	@Test
	public void test_getLado1() {
		Rectangulo rect = new Rectangulo(3,3);
		double lado = rect.getLado1();
		double ladoEsperado=3;
		assertEquals(ladoEsperado, lado,0);	
	}
	
}
