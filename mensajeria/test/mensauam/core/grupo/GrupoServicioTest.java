package mensauam.core.grupo;

import mensauam.core.grupo.servicio.api.GrupoServicio;
import mensauam.core.grupo.servicio.impl.GrupoServicioImpl;
import mensauam.core.usuario.Alumno;
import mensauam.core.usuario.Usuario;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Test;

public class GrupoServicioTest {

	@Test
	public void deberia_crear_un_grupo_de_alumnos_privado_y_moderado(){
		
		// GIVEN
		GrupoServicio servicio = GrupoServicioImpl.getInstance();
		boolean esPrivado = true;
		boolean esModerado = true;
		String nombreGrupo = "grupo_test";
		Usuario creador = new Alumno("test@test.com");
		
		// WHEN
		GrupoAlumno grupoActual = servicio.crear(nombreGrupo, esPrivado, esModerado, creador);
		
		// THEN
		Assert.assertNotNull(grupoActual);
		Assert.assertThat(grupoActual.getNombre(), IsEqual.equalTo("grupo_test"));
		Assert.assertThat(grupoActual.isEsPrivado(), IsEqual.equalTo(true));
		Assert.assertThat(grupoActual.isEsModerado(), IsEqual.equalTo(true));
		Assert.assertThat(grupoActual.getCreador(), IsNull.notNullValue());
		Assert.assertThat(grupoActual.getCreador().getCorreo(), IsEqual.equalTo("test@test.com"));
		
	}
	
	@Test
	public void deberia_crear_un_grupo_de_estudio(){

		// GIVEN
		GrupoServicio servicio = GrupoServicioImpl.getInstance();
		String nombreGrupo = "grupo_test";
		String pregunta = "pregunta_test";
		Usuario creador = new Alumno("test@test.com");
		
		// WHEN
		GrupoEstudio grupoActual = servicio.crear(nombreGrupo, pregunta, creador);
		
		// THEN
		Assert.assertNotNull(grupoActual);
		Assert.assertThat(grupoActual.getNombre(), IsEqual.equalTo("grupo_test"));
		Assert.assertThat(grupoActual.getPregunta(), IsEqual.equalTo("pregunta_test"));
		Assert.assertThat(grupoActual.isEsPrivado(), IsEqual.equalTo(true));
		Assert.assertThat(grupoActual.isEsModerado(), IsEqual.equalTo(true));
		Assert.assertThat(grupoActual.getCreador(), IsNull.notNullValue());
		Assert.assertThat(grupoActual.getCreador().getCorreo(), IsEqual.equalTo("test@test.com"));
		
	}
}
