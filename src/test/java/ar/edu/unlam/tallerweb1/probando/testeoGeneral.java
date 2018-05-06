package ar.edu.unlam.tallerweb1.probando;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.probando.modelo.Direccion;
import ar.edu.unlam.tallerweb1.probando.modelo.Farmacia;


public class testeoGeneral extends SpringTest{

	@Test
	@Transactional @Rollback(true)
	public void testQueCorroboreLaConexion() {
        assertThat(getSession().isConnected()).isTrue();

	}
//2-​ ​Hacer​ ​con​ ​junit​ ​un​ ​test​ ​que​ ​busque​ ​todas​ ​las​ ​farmacias​ ​de​ ​turno​ ​los​ ​días​ ​martes.  	
	@Test
	@Transactional @Rollback(true)
	@SuppressWarnings("unchecked")
	public void testQueBusqueFarmaciasDeTurnoDiaMartes() {
		
		Farmacia farmacia= new Farmacia();
		farmacia.setNombre("Farmacity");
		farmacia.setDiaDeTurno("Martes");
		
		Farmacia farmacia2= new Farmacia();
		farmacia2.setNombre("Farmaneta");
		farmacia2.setDiaDeTurno("Miercoles");
		
		Farmacia farmacia3= new Farmacia();
		farmacia3.setNombre("Central");
		farmacia3.setDiaDeTurno("Martes");
		
		getSession().save(farmacia);
		getSession().save(farmacia2);
		getSession().save(farmacia3);
		

		List<Farmacia> list=
				getSession().createCriteria(Farmacia.class)
				.add(Restrictions.eq("diaDeTurno", "Martes"))
				.list();
		
		assertThat(list.size()).isEqualTo(2);

	}
	
//3- Hacer​ ​con​ ​junit​ ​un​ ​test​ ​que​ ​busque​ ​todas​ ​las​ ​farmacias​ ​de​ ​una​ ​calle. 
	
	@Test
	@Transactional @Rollback(true)
	@SuppressWarnings("unchecked")
	public void testQueBusqueTodasLasFarmaciasDeUnaCalle() {
		
		Direccion direccion= new Direccion();
		direccion.setCalle("Arieta");
		
		Direccion direccion2= new Direccion();
		direccion2.setCalle("Lugones");
		
		Farmacia farmacia= new Farmacia();
		farmacia.setNombre("Farmacity");
		farmacia.setDiaDeTurno("Martes");
		farmacia.setDireccion(direccion2);
		
		Farmacia farmacia2= new Farmacia();
		farmacia2.setNombre("Farmaneta");
		farmacia2.setDiaDeTurno("Miercoles");
		farmacia2.setDireccion(direccion2);
		
		Farmacia farmacia3= new Farmacia();
		farmacia3.setNombre("Central");
		farmacia3.setDiaDeTurno("Martes");
		farmacia3.setDireccion(direccion);
		
		getSession().save(direccion);
		getSession().save(direccion2);
		
		getSession().save(farmacia);
		getSession().save(farmacia2);
		getSession().save(farmacia3);
		

		List<Farmacia> list=
				getSession().createCriteria(Farmacia.class)
				.add(Restrictions.eq("direccion", direccion2))
				.list();
		
		assertThat(list.size()).isEqualTo(2);
		
		System.out.println(list.toString());

	}
		
}