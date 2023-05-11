package Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Tipologiasexo;

public class ControllerTipologiaSexo {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("centroeducativo2");
	
	
	/**
	 * 
	 * @return
	 */
	public static List<Tipologiasexo> findAll() {

		EntityManager em = entityManagerFactory.createEntityManager();
		Query q = em.createNativeQuery("SELECT * FROM tipologiasexo;", Tipologiasexo.class);
		List<Tipologiasexo> l = (List<Tipologiasexo>) q.getResultList();

		em.close();
		return l;
		
	}
	
	
}
