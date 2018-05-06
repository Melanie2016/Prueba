package ar.edu.unlam.tallerweb1.probando;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;


import ar.edu.unlam.tallerweb1.probando.modelo.Empleado;
import ar.edu.unlam.tallerweb1.probando.modelo.Empresa;
import ar.edu.unlam.tallerweb1.probando.modelo.Sector;



public class testeoGeneral extends SpringTest{

	@Test
	@Transactional @Rollback(true)
	public void testQueCorroboreLaConexion() {
        assertThat(getSession().isConnected()).isTrue();

	}
	
	
	
	
	
	
	
}