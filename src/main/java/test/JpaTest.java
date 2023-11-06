package test;

import java.io.IOException;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Cliente;

public class JpaTest {

	public static void main(String[] args) throws IOException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();

		tx.begin();
		
		Cliente cliente = new Cliente();
		cliente.setApellidoPaterno("García");
		cliente.setApellidoMaterno("Pérez");
		cliente.setNombres("Alan");	
				
		// Insertar
		manager.persist(cliente);
		
		tx.commit();

		List<Cliente> lista = manager.createQuery("from Cliente", Cliente.class).getResultList();
		for (Cliente cli : lista) {
			System.out.println(cli);
		}

	}

}
