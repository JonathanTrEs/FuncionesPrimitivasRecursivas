
public class Uno {
	public Uno() {	}
	public int calcularUno() {
		Sucesor sucesor = new Sucesor();
		return sucesor.calcularSucesor(new Cero().calcularCero());
	}
}
