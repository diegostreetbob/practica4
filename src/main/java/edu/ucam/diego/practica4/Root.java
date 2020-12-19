package edu.ucam.diego.practica4;

public class Root {
	public static void main(String[] args) {
			Poligono pol = new Rectangulo(3,4);
			System.out.println("Tengo " + pol.getLados() + " lados");
			System.out.println("Area:"+pol.getArea());
			//
			pol=new Triangulo(2,2);
			System.out.println("Tengo " + pol.getLados() + " lados");
			System.out.println("Area:"+pol.getArea());			
	}
}
