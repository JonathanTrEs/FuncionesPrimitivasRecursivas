
public class Potencia {
	
	public Potencia() {}
	
	public int calcularPotencia(int x, int y) {
		if(y == 0) {
			Uno uno = new Uno();
			return uno.calcularUno();
		}
		else {
			Predecesor predecesor = new Predecesor();
			Proyeccion proyeccion = new Proyeccion(x, predecesor.calcularPredecesor(y), calcularPotencia(x, predecesor.calcularPredecesor(y)));
			Producto producto = new Producto();
			return producto.calcularProducto(x, proyeccion.proyectar(3, 3));
		}
	}
}
