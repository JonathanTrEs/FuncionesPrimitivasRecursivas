
public class Proyeccion {
	private int[] lista;
	
	public Proyeccion(int... lista) {
		this.lista = lista;
	}
	
	public int proyectar(int pos, int tamano) {
		return lista[pos-1];
	}
}
