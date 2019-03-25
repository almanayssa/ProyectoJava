package pe.edu.cibertec.modelo;

public class CategoriaProducto {

	private final int id;
	private final String nombre;
	
	public CategoriaProducto(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
