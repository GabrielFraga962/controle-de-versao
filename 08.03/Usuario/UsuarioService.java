package Usuario;

import PostagemTema.UsuarioLogin;

public class UsuarioService {

	private static String EMAIL_PATTERN;

	private static Pattern pattern;

	private UsuarioRepository usuarioRepository;

	private boolean validaEmail(char email) {
		return false;
	}

	private boolean validaNome(char nome) {
		return false;
	}

	public UsuarioEntidade cadastraUsuario(UsuarioEntidade usuario) {
		return null;
	}

	public UsuarioLogin login(UsuarioEntidade Usuario) {
		return null;
	}

	public void logout(UsuarioEntidade usuario) {

	}

}
