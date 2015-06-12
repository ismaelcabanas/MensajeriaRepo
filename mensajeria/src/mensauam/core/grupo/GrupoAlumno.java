package mensauam.core.grupo;

import mensauam.core.usuario.Usuario;

public class GrupoAlumno extends Grupo {

	private String nombre;
	
	private boolean esPrivado;
	
	private boolean esModerado;
	
	private Usuario creador;

	public GrupoAlumno(String nombreGrupo, boolean esPrivado,
			boolean esModerado, Usuario creador) {
		this.nombre = nombreGrupo;
		this.esPrivado = esPrivado;
		this.esModerado = esModerado;
		this.creador = creador;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isEsPrivado() {
		return esPrivado;
	}

	public boolean isEsModerado() {
		return esModerado;
	}

	public Usuario getCreador() {
		return creador;
	}
	
	
}
