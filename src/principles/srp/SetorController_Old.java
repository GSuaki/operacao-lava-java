/**
 * 
 */
package principles.srp;

import java.io.Serializable;

/**
 * @author GSuaki
 *
 */
public class SetorController_Old {

	private EntityRepository repository;


	public Setor incluir(String nome, Integer ordem, String descricao, Long grupoId) {

		UserDetails usuarioLogado = SecurityContext.getUsuarioLogado();
		GrupoSetor grupo = repository.load(GrupoSetor.class, grupoId);

		Setor setor = new Setor(nome, ordem, descricao, usuarioLogado.getUsuId(), usuarioLogado.getNome(), grupo);
		setor.setAtivo(true);

		Serializable id = repository.save(setor);
		setor.setId((Long) id);

		return setor;
	}

	public Setor alterar(Long id, String nome, Integer ordem, String descricao, Long grupoId) {

		UserDetails usuarioLogado = SecurityContext.getUsuarioLogado();
		GrupoSetor grupo = repository.load(GrupoSetor.class, grupoId);
		Setor setor = repository.load(Setor.class, id);

		setor.setNome(nome);
		setor.setOrdem(ordem);
		setor.setGrupo(grupo);
		setor.setDescricao(descricao);
		setor.setUsuarioId(usuarioLogado.getUsuId());
		setor.setUsuarioNome(usuarioLogado.getNome());

		return setor;
	}

}
