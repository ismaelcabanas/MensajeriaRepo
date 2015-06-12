package mensauam.core.usuario;

public class Alumno extends Usuario {

	private String correo;
	
	public Alumno(String correo) {
		this.correo = correo;
	}

	public String getCorreo() {
		return correo;
	}

	
}
