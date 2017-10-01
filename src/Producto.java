
public class Producto {
	
	public Producto() {}
	
	public int calcularProducto(int x, int y) {
		if(y==0) {
			Cero cero = new Cero();
			return cero.calcularCero();
		}
		else {
			Predecesor predecesor = new Predecesor();
			Proyeccion proyeccion = new Proyeccion(x, predecesor.calcularPredecesor(y), calcularProducto(x, predecesor.calcularPredecesor(y)));
			Suma suma = new Suma();
			return suma.calcularSuma(x, proyeccion.proyectar(3, 3));
		}
	}
}
