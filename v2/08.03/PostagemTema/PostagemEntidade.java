package PostagemTema;

import java.util.Date;
import Usuario.UsuarioEntidade;
import java.util.Set;

public class PostagemEntidade {

	private long id_postagem;

	private String titulo;

	private String conteudo;

	private Date data_publicacao;

	private UsuarioEntidade usuario;

	private String imagem;

	private long saldo_reacoes;

	private Set temaList;

	public void addReacaoPositiva() {

	}

	public void addReacaoNegativa() {

	}

}
