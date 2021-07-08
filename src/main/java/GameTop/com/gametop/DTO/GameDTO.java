package GameTop.com.gametop.DTO;

import java.time.LocalDate;

import GameTop.com.gametop.Model.Game;

public class GameDTO {

	private Long id;
	private String nome;
	private Double preco;
	private LocalDate data;
	
	private UsuarioDTO usuario;
	
	public GameDTO (){
	}
	
	public GameDTO(Long id, String nome, Double preco, LocalDate data, UsuarioDTO usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.data = data;
		this.usuario = usuario;
	}

	public GameDTO(Game entity) {
		id = entity.getId();
		nome = entity.getNome();
		preco = entity.getPreco();
		data = entity.getData();
		usuario = new UsuarioDTO(entity.getUsuario());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
}
