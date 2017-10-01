
public class Suma {
	public Suma(){}
	
	public int calcularSuma(int x, int y){
		if(y==0) {
			Proyeccion proyeccion = new Proyeccion(x);
			return proyeccion.proyectar(1,1);
		}
		else {
			Predecesor predecesor = new Predecesor();
			Proyeccion proyeccion = new Proyeccion(x, predecesor.calcularPredecesor(y), calcularSuma(x, predecesor.calcularPredecesor(y)));
			Sucesor sucesor = new Sucesor();
			return sucesor.calcularSucesor(proyeccion.proyectar(3 , 3));
		}
	}
}
