package GameTop.com.gametop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import GameTop.com.gametop.Model.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
