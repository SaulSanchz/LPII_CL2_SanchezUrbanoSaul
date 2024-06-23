<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Productos</title>
</head>
<body bgcolor="#c5dec9">

	<h1 align="center">Registrar Producto</h1>
	
	<form action="ControladorProducto" method="post">
		<table border="2" align="center">
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td>Precio de Venta:</td>
				<td><input type="number" name="precioventa"></td>
			</tr>
			<tr>
				<td>Precio de Compra:</td>
				<td><input type="number" name="preciocomp"></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><input type="text" name="estado"></td>
			</tr>
			<tr>
				<td>Descripci�n:</td>
				<td><input type="text" name="descrip"></td>
			</tr>
			<tr>
				<td colspan="2"  align="center" >
				<input type="submit" value="Registrar">
				</td>
			</tr>
		</table>
	</form>

	<h1  align="center">Listado de Productos Registrados en BD</h1>

	<table border="2" align="center">

		<tr>
			<td>C�digo</td>
			<td>Nombre</td>
			<td>Precio Venta</td>
			<td>Precio Compra</td>
			<td>Estado</td>
			<td>Descripci�n</td>
		</tr>

	<%
	List<TblProductocl2> listadoproducto=(List<TblProductocl2>)request.getAttribute("listadodeproductos");
	//aplicamos una condicion..
	if(listadoproducto!=null){
		//aplicamos un bucle for..
		for(TblProductocl2 lis:listadoproducto){
	%>
		<tr>
			<td><%=lis.getIdproductocl2() %></td>
			<td><%=lis.getNombrecl2() %></td>
			<td><%=lis.getPrecioventacl2() %></td>
			<td><%=lis.getPreciocompl2() %></td>
			<td><%=lis.getEstadocl2() %></td>
			<td><%=lis.getDescripcl2() %></td>		
		</tr>
		
		
		<%	
		}   //fin del bucle for...
		%>
		<%
	}  //fin de la condicion ...

	%>
	</table>
</body>

</html>