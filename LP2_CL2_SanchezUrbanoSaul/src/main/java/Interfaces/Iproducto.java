package Interfaces;

import java.util.List;

import model.TblProductocl2;

public interface Iproducto {
	
	// declaramos los metodos
	public void RegistrarProducto(TblProductocl2 producto);
	public List<TblProductocl2> ListadoProducto();

}
