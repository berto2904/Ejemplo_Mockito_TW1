package ar.edu.unlam.tallerweb1.usuario;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import static org.assertj.core.api.Assertions.assertThat;


public class UsuarioTest extends SpringTest {


	@Test
	@Transactional
	@Rollback(true)
	public void testUsuario() {
		Usuario pablo = new Usuario();
		pablo.setPassword("sarasa");
		pablo.setEmail("berto2904@gmail.com");
		pablo.setRol("rol de loco");
		
		getSession().save(pablo);
//		guardar(pablo);
		assertThat(getSession().get(Usuario.class, pablo.getId()));
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	@Transactional
	@Rollback(true)
	public void testMuchosUsuarios() {
		for (int i = 0; i < 100; i++) {
			Usuario usuario = new Usuario();
			usuario.setEmail("email_"+i);
			usuario.setPassword("pass"+i);
			usuario.setRol("rol_"+i);

			getSession().save(usuario);
			assertThat(getSession().get(Usuario.class, usuario.getId()));
		}
		
		Usuario pepito = new Usuario();
		pepito.setEmail("email_1");
		pepito.setPassword("passEjemplo");
		getSession().save(pepito);
		assertThat(getSession().get(Usuario.class, pepito.getId()));
		
		List<Usuario> listaUsuario;
		listaUsuario = getSession().createCriteria(Usuario.class)
				.add(Restrictions.eq("email", "email_1"))
				.list();
		assertThat(listaUsuario).hasSize(2);
				
	}
	
	
}
