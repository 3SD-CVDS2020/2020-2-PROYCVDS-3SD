package edu.eci.cvds.sampleprj.mybatis;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.sampleprj.UserDAO;
import edu.eci.cvds.sampleprj.mybatis.Mappers.UsuarioMapper;

public class MyBatisUserDao implements UserDAO{
	
	@Inject
	private UsuarioMapper usuarioMapper;

	@Override
	public void registrarUsuario(int carnet,String correo,String clave,String nombre,String apellido,String cargo) throws PersistenceException {
		try {
			usuarioMapper.registrarUsuario(carnet,correo,clave,nombre,apellido,cargo);
		}catch(Exception e) {
			throw new PersistenceException("Usuario No Registrado",e);
			
		}
		
	}

	@Override
	public void modificar(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listar(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
