package GameTop.com.gametop.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GameTop.com.gametop.DTO.UsuarioDTO;
import GameTop.com.gametop.Model.Usuario;
import GameTop.com.gametop.Repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<UsuarioDTO> findAll() {
		List<Usuario> result = repository.findAll();
		return result.stream().map(x -> new 
		UsuarioDTO(x)).collect(Collectors.toList());
	}
	public Usuario save(Usuario usuario) {
		Usuario u = repository.save(usuario);
		return u;
	}
}
