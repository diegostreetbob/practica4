package edu.ucam.diego.practica4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class JUnitTestRectangulo {
	// Rectángulo sin nombre
	private static Rectangulo rect = null;
	// Rectángulo con nombre
	private static Rectangulo rect2 = null;
	// Rectangulo sin nombre con color
	private static Rectangulo rect3 = null;
	// Rectangulo sin nombre con color
	private static Rectangulo rect4 = null;
	
	@BeforeClass
	public static void testBefore() {
		rect = new Rectangulo(3, 3);
		rect2 = new Rectangulo(3, 3, "rect2");
		rect3 = new Rectangulo(3, 3, 127, 255, 255);
		rect4= new Rectangulo(3, 3);
		System.out.println("Creados los objetos necesarios para el test");
	}
	
	@AfterClass
	public static void testAfter() {
		rect = null;
		rect2 = null;
		rect3 = null;
		rect4=null;
		System.out.println("Borrados los objetos necesarios para el test");
	}

	@Test
	public void testGetArea() {
		double areareal = rect.getArea();
		double areaesperada=9.0;
		assertEquals(areaesperada, areareal,0);
	}

	@Test
	public void test2GetArea() {
		double areareal = rect.getArea();
		double areaesperada=9.0;
		assertTrue(areaesperada==areareal);
	}

	@Test
	public void test3GetArea() {
		double areareal = rect.getArea();
		double areaesperada=9.0;
		assertFalse(areaesperada==areareal);
	}

	@Test
	public void testGetNombre() {
		assertNotNull(rect2.getNombre());
	}
	
	@Test
	public void test2GetNombre() {
		assertNotNull(rect.getNombre());
	}
	
	@Test
	public void testGetRectangulo(){
		assertSame(rect, rect2);
	}
	
	@Test
	public void test2GetRectangulo(){
		assertNotSame(rect, rect2);
	}
	
	@Test
	public void testGetRgbColor() {
		assertArrayEquals(rect.getRgbColor(),rect3.getRgbColor());
	}
	//* Caso de prueba c1: setNombre(),setLado1(),setLado2(),setArea()
   @Test
   public void testCasoC1() {
	   String nombre="rect_c1";
	   double lado1=2.0;
	   double lado2=2.0;
	   //
	   rect.setNombre(nombre);
	   rect.setLado1(lado1);
	   rect.setLado2(lado2);
	   rect.setArea();
	   assertEquals(nombre,rect.getNombre());
	   assertEquals(lado1,rect.getLado1(),0);
	   assertEquals(lado1*lado2,rect.getArea(),0);   
   }
	//* Caso de prueba c2: setNombre(), setArea, setLado1(),setLado2()
   @Test
   public void testCasoC2() {
	   String nombre="rect_c2";
	   double lado1=6.0;
	   double lado2=6.0;
	   //
	   rect.setNombre(nombre);
	   rect.setArea();
	   rect.setLado1(lado1);
	   rect.setLado2(lado2);
	   //assertEquals(nombre,rect4.getNombre());
	   assertEquals(lado1,rect4.getLado1(),0);
	   assertEquals(lado1*lado2,rect4.getArea(),0);   
   }
	
	
	
}
