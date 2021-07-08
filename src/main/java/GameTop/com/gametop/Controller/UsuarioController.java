package GameTop.com.gametop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GameTop.com.gametop.DTO.UsuarioDTO;
import GameTop.com.gametop.Model.Usuario;
import GameTop.com.gametop.Service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> findAll() {
		System.out.println("List of Users:");
		List<UsuarioDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	@PostMapping
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
		System.out.println("New User Saved Sucessfully.");
		return ResponseEntity.ok(service.save(usuario));
	}
}
