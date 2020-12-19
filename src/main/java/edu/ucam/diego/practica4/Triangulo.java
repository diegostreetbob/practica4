package edu.ucam.diego.practica4;

public class Triangulo implements Poligono{
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;	
	}
    //
	@Override
	public double getArea() {
		return (base*altura)/2;
	}
	@Override
	public double getPerimetro() {
		return base+altura+Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
	}
	@Override
	public int getLados() {
		return 3;
	}
}
