package pe.edu.cibertec.modelo;

public class Producto {

	private final String idProducto;
	private final String nombreProducto;
	private final CategoriaProducto categoriaProducto;
	private final float precio;
	private final String autor;
	private final String editorial;
	private final String idioma;
	private final String medidas;
	private final String paginas;
	private final String peso;
	private final String presentacion;
	private final String publicacion;
	private final String resenia;
	
	public Producto(String idProducto, String nombreProducto, CategoriaProducto categoriaProducto, float precio,
			String autor, String editorial, String idioma, String medidas, String paginas, String peso,
			String presentacion, String publicacion, String resenia) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.categoriaProducto = categoriaProducto;
		this.precio = precio;
		this.autor = autor;
		this.editorial = editorial;
		this.idioma = idioma;
		this.medidas = medidas;
		this.paginas = paginas;
		this.peso = peso;
		this.presentacion = presentacion;
		this.publicacion = publicacion;
		this.resenia = resenia;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public CategoriaProducto getCategoriaProducto() {
		return categoriaProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public String getIdioma() {
		return idioma;
	}

	public String getMedidas() {
		return medidas;
	}

	public String getPaginas() {
		return paginas;
	}

	public String getPeso() {
		return peso;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public String getPublicacion() {
		return publicacion;
	}

	public String getResenia() {
		return resenia;
	}
	
}
