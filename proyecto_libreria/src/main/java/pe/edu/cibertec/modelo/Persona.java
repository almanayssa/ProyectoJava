package pe.edu.cibertec.modelo;

import java.util.Date;

public class Persona {

	private final int idPersona;
	private final String nombre;
	private final String apellidoPat;
	private final String apellidoMat;
	private final Date fecNacimiento;
	private final TipoDocumento tipoDocumento;
	private final String documento;
	
	public Persona(int idPersona, String nombre, String apellidoPat, String apellidoMat, Date fecNacimiento,
			TipoDocumento tipoDocumento, String documento) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.fecNacimiento = fecNacimiento;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}
	
}
