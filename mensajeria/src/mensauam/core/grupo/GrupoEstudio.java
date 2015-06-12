package mensauam.core.grupo;

import mensauam.core.usuario.Usuario;

public class GrupoEstudio extends Grupo {

	private String pregunta;

	public GrupoEstudio(String nombreGrupo, String pregunta, Usuario creador) {
		super(nombreGrupo, true, true, creador);
		this.pregunta = pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}
	
	
}
