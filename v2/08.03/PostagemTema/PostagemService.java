package PostagemTema;

import Usuario.UsuarioService;

public class PostagemService {

	private PostagemRepository postagemRepositorio;

	private UsuarioService usuarioService;

	private TemaService temaService;

	private boolean validaPostagem(PostagemEntidade post) {
		return false;
	}

	private PostagemEntidade addTemaPostagem(PostagemEntidade post) {
		return null;
	}

	public PostagemEntidade cadastraPostagem(PostagemEntidade posEntidade, long id_usuario) {
		return null;
	}

	public PostagemEntidade put(PostagemEntidade postagem, long id_postagem, long id_Usuario) {
		return null;
	}

	private void removeTemaPost(PostagemEntidade post) {

	}

	public boolean delete(long id_postagem) {
		return false;
	}

	public PostagemEntidade save(PostagemEntidade post) {
		return null;
	}

	private void verificaTemaNaoExistente(PostagemEntidade post) {

	}

}
