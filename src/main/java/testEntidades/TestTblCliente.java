package testEntidades;

import java.util.List;

import dao.ClienteImp;
import modelo.TblCliente;

public class TestTblCliente {

	public static void main(String[] args) {
		//realizamos la respectiva instancia...
		TblCliente cliente =new TblCliente();
        ClienteImp climp=new ClienteImp();
        //asignamos valores
        /*cliente.setNomcliente("Cristiando");
        cliente.setApecliente("ronaldo");
        cliente.setDnicliente("4563789");
        cliente.setEmailcliente("cristiano@gmail.com");
        cliente.setSexcliente("m");
        cliente.setNacioncliente("portugues");
        cliente.setTelfcliente("3814675");
        //invocamos al metodo
        climp.RegistrarCliente(cliente);
        System.out.println("Dato registrado en BD") ;*/
        //*****testeando el metodo actualizar..
             //actualizando el codigo nro. 2
        /*cliente.setIdcliente(2);
       cliente.setNomcliente("leo");
        cliente.setApecliente("messi");
        cliente.setDnicliente("55555");
        cliente.setEmailcliente("leo@gmail.com");
        cliente.setSexcliente("m");
        cliente.setTelfcliente("35555");
        cliente.setNacioncliente("Argentina");
         //invocamos el metodo actualizar
        climp.ActualizarCliente(cliente);
        //mensaje
        System.out.println("dato actualizado en la bd");*/
        
        //****testeando el metodo eliminar...
     /*      //codigo a eliminar...
        cliente.setIdcliente(2);
        //imprimir mensaje
        System.out.println("dato eliminado de la BD");
        */
        
        //testear el listado
       /* List<TblCliente> listado=climp.ListarCliente();
        //aplicamos un bucle for
        for(TblCliente lis:listado){
        	//imprimimos por pantalla
        	System.out.println("codigo "+lis.getIdcliente()+
        			" nombre "+lis.getNomcliente()+
        			" apellido "+lis.getApecliente()+
        			" dni "+lis.getDnicliente()+
        			" nacionalidad "+lis.getNacioncliente()+
        			" email "+lis.getEmailcliente()+
        			" telefono "+lis.getTelfcliente()+
        			" sexo "+lis.getSexcliente());
        } *///fin del bucle for...
        
        cliente.setNomcliente("Cristiando");
        cliente.setApecliente("ronaldo");
        cliente.setDnicliente("4563789");
        cliente.setEmailcliente("cristiano@gmail.com");
        cliente.setSexcliente("m");
        cliente.setNacioncliente("portugues");
        cliente.setTelfcliente("3814675");
        climp.RegistrarCliente(cliente);
        System.out.println("Dato registrado en BD");
        
        //codigo a buscar 
        cliente.setIdcliente(1);
        TblCliente buscliente = climp.BuscarCliente(cliente);
        System.out.println(" Codigo " + buscliente.getIdcliente() + " nombre " + buscliente.getNomcliente() +
        		" apellido " + buscliente.getApecliente() + " telefono " + buscliente.getTelfcliente() + 
        		" email " + buscliente.getTelfcliente());
        
	} //fin del metodo principal.....

} //fin de la clase...
