package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iproducto;
import model.TblProductocl2;

public class ClassProductoImp implements Iproducto{

	public void RegistrarProducto(TblProductocl2 producto) {

		//establecer conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL2_SanchezUrbanoSaul");
		//permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(producto);
		//emitimos mensaje por consola
		System.out.println("Producto registrado en la BD correctamente");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion
		em.close();
	}

	public List<TblProductocl2> ListadoProducto() {

		//establecemos la conexion con la unidad de persistencia
        EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LP2_CL2_SanchezUrbanoSaul");
        //gestionamos las entidads
        EntityManager em=fabr.createEntityManager();
        //iniciamos la transaccion
        em.getTransaction().begin();
        //recuperamos los productos  de la base de datos
        //***********utilizando jpql
        List<TblProductocl2> listadoproducto=em.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();
        //confirmamos la transaccion
        em.getTransaction().commit();
        //cerramos
        em.close();
		return listadoproducto;
	}

	
}
