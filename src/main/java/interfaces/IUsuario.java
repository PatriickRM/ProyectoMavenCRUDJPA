package interfaces;

import java.util.List;

import modelo.TblUsuario;

public interface IUsuario {
	void RegistrarUsuario(TblUsuario usuario);
	void ActualizarUsuario(TblUsuario usuario);
	void EliminarUsuario(TblUsuario usuario);
	List<TblUsuario> ListarUsuario();
	TblUsuario BuscarCliente(TblUsuario usuario);
}
