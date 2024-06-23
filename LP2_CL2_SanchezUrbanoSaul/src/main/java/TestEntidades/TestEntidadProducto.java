package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {

		//realizamos la respectiva instancia de las clases...
		TblProductocl2 productocl2=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
				
		//testeamos el metodo listado
		List<TblProductocl2> listado=crud.ListadoProducto();
		//aplicamos un bucle for...
		for(TblProductocl2 lis:listado){
					
		//imprimimos por pantalla
		System.out.println("Nombre: "+lis.getNombrecl2()+
							" Precio de venta: "+lis.getPrecioventacl2()+" Precio de compra: "+lis.getPreciocompcl2()
							+" Estado: "+lis.getEstadocl2()+" Descripción: "+lis.getDescripcl2());
		}


	}

}
