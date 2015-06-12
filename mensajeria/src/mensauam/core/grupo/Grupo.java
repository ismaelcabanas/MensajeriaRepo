package mensauam.core.grupo;

import mensauam.core.usuario.Usuario;

public abstract class Grupo {

	protected String nombre;
	
	protected boolean esPrivado;
	
	protected boolean esModerado;
	
	protected Usuario creador;
	
	public Grupo(String nombreGrupo, boolean esPrivado, boolean esModerado, Usuario creador) {
		this.nombre = nombreGrupo;
		this.esPrivado = esPrivado;
		this.esModerado = esModerado;
		this.creador = creador;
	}

	protected String getNombre() {
		return nombre;
	}

	protected boolean isEsPrivado() {
		return esPrivado;
	}

	protected boolean isEsModerado() {
		return esModerado;
	}

	protected Usuario getCreador() {
		return creador;
	}
	
}
