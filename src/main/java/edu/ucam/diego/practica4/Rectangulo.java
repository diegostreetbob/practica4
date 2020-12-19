package edu.ucam.diego.practica4;

public class Rectangulo implements Poligono{
	private double  llado1;
	private double llado2;
	private String nombre = null;
	private int rgbcolor[ ] = {0,0,0};
	private double area;
	
	
	public Rectangulo(double llado1, double llado2,String nombre) {
		this.llado1=llado1;
		this.llado2=llado2;
		this.nombre=nombre;
		this.area=llado1*llado2;
	}
	
	public Rectangulo(double llado1, double llado2) {
		this.llado1=llado1;
		this.llado2=llado2;
		this.area=llado1*llado2;
	}
	
	public Rectangulo(double llado1, double llado2, int rcolor, int gcolor, int bcolor) {
		this.llado1=llado1;
		this.llado2=llado2;
		this.rgbcolor[0]=rcolor;
		this.rgbcolor[1]=gcolor;
		this.rgbcolor[2]=bcolor;
	}
	
    //
	@Override
	public double getArea() {
		return llado1*llado2;
	}
	@Override
	public double getPerimetro() {
		return (llado1*2)+(llado2*2);
	}
	@Override
	public int getLados() {
		return 4;
	}
	//
	public String getNombre() {
		return nombre;
	}
	
	public Rectangulo getRectangulo() {
		return this;
	}
	
	public int[] getRgbColor() {
		return rgbcolor;
	}
	public double getLado1() {
		return llado1;
	}
	//
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setLado1(double lado1) {
		this.llado1=lado1;
	}
	public void setLado2(double lado2) {
		this.llado2=lado2;
	}
	public void setArea() {
		this.area=this.llado1*this.llado2;
	}
	

	
}
