package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.ICliente;
import modelo.TblCliente;

public class ClienteImp implements ICliente{

	public void RegistrarCliente(TblCliente cliente) {
		// Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		// Administrar la transaccion
		EntityManager em = emf.createEntityManager();
		try{
			//iniciamos la transaccion
			em.getTransaction().begin();
			//invocamos el metodo registrar...
			em.persist(cliente);
			//confirmamos
			em.getTransaction().commit();
		}
		catch(RuntimeException ex){
		ex.getMessage();
		}finally{
			em.close();
		} //fin del finally
		
	} //fin del metodo registrar

	public void ActualizarCliente(TblCliente cliente) {
		// 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		
		EntityManager em = emf.createEntityManager();
		try{
			em.getTransaction().begin();
			em.merge(cliente);
			em.getTransaction().commit();
			
		} catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();
		}
	} //fin del metodo actualizar

	public void EliminarCliente(TblCliente cliente) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		EntityManager em = emf.createEntityManager();
		try{
			em.getTransaction().begin();
			TblCliente codelim = em.find(TblCliente.class, cliente.getIdcliente());
			
			if(codelim!=null){
				em.remove(codelim);
				em.getTransaction().commit();
			}
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();
		}
		
	} //fin del metodo eliminar

	public List<TblCliente> ListarCliente() {
		// 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		EntityManager em = emf.createEntityManager();
		List<TblCliente> listadoCliente = null;
		try{
			em.getTransaction().begin();
			listadoCliente = em.createQuery("SELECT C FROM TblCliente c",TblCliente.class).getResultList();
			em.getTransaction().commit();
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();
		}
		return listadoCliente;
	} //fin del metodo listar

	public TblCliente BuscarCliente(TblCliente cliente) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		EntityManager em = emf.createEntityManager();
		//Buscar
		TblCliente buscarCodigo = null;
		try{
			em.getTransaction().begin();
			//Recuperar el codigo
			buscarCodigo = em.find(TblCliente.class, cliente.getIdcliente());
			em.getTransaction().commit();
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}finally{
			em.close();
		}
		return buscarCodigo;
	} //fin del metodo buscar

	
}//fin de la clase...
