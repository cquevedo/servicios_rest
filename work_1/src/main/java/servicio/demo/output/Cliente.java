package servicio.demo.output;

public class Cliente {
	
	private String dni;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;	
	private String ruc;
	private String direccion;
	private String telefono;
	
	public Cliente(){
		super();
	}
	
	public Cliente(String dni, String nombres, String apellidoPaterno, String apellidoMaterno, String ruc,
			String direccion, String telefono) {
		super();
		this.dni = dni;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.ruc = ruc;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNombres() {
		return nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", ruc=" + ruc + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}	
}
