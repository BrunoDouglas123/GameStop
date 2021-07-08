package GameTop.com.gametop.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GameTop.com.gametop.DTO.GameDTO;
import GameTop.com.gametop.Model.Game;
import GameTop.com.gametop.Repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameDTO> findAll() {
		List<Game>result = repository.findAll();
		return result.stream().map(x -> new 
		GameDTO(x)).collect(Collectors.toList());
	}
	public Game save(Game game) {
		Game g = repository.save(game);
		return g;
	}

}
