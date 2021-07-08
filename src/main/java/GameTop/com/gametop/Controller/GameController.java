package GameTop.com.gametop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GameTop.com.gametop.DTO.GameDTO;
import GameTop.com.gametop.Model.Game;
import GameTop.com.gametop.Service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll() {
		System.out.println("List of Games:");
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	@PostMapping
	public ResponseEntity<Game> save(@RequestBody Game game) {
		System.out.println("New Game Saved Sucessfully.");
		return ResponseEntity.ok(service.save(game));
	}
}
