package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity // Indica que es una entidad JPA
@Table(name="tbl_usuario")
@NamedQuery(name="TblUsuario.findAll",query="SELECT u FROM TBUsuario u")
public class TblUsuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuario;
	@Column(name="usuario")
	private String usuario;
	@Column(name="password")
	private String password;
	
	public TblUsuario(){
	} 
	
	public TblUsuario(int idusuario, String usuario, String password) {
		//super();
		this.idusuario = idusuario;
		this.usuario = usuario;
		this.password = password;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
