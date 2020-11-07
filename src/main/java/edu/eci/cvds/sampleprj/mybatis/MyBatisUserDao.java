package edu.eci.cvds.sampleprj.mybatis;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.sampleprj.UserDAO;
import edu.eci.cvds.sampleprj.mybatis.Mappers.UserMapper;

public class MyBatisUserDao implements UserDAO{
	
	@Inject
	private UserMapper	userMapper;

	@Override
	public void registrarUsuario(Usuario usuario) throws PersistenceException {
		try {
			userMapper.registrarUsuario(usuario);
		}catch(Exception e) {
			throw new PersistenceException("Usuario No Registrado");
			
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