package interfaces;

import java.util.List;

import modelo.TblCliente;

public interface ICliente {
//declaramos sus metodos...
	void RegistrarCliente(TblCliente cliente);
	void ActualizarCliente(TblCliente cliente);
	void EliminarCliente(TblCliente cliente);
	List<TblCliente> ListarCliente();
	TblCliente BuscarCliente(TblCliente cliente);
}//Fin de la interface
