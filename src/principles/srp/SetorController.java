/**
 * 
 */
package principles.srp;

import principles.srp.Setor.SetorBuilder;

/**
 * @author GSuaki
 *
 */
public class SetorController {
	
	private EntityRepository repository;

	/**
	 * Controller method
	 * 
	 * @RequestMethod(method = POST)
	 * 
	 * @param nome
	 * @param ordem
	 * @param descricao
	 * @param grupoId
	 * 
	 * @return
	 */
	public Setor incluir(String nome, Integer ordem, String descricao, Long grupoId) {

		SetorForm form = buildForm(nome, ordem, descricao, grupoId);
		
		return gerenciar(form);
	}

	/**
	 * Controller method
	 * 
	 * @RequestMethod(method = PUT)
	 * 
	 * @param id
	 * @param nome
	 * @param ordem
	 * @param descricao
	 * @param grupoId
	 * 
	 * @return
	 */
	public Setor alterar(Long id, String nome, Integer ordem, String descricao, Long grupoId) {
		
		SetorForm form = buildForm(nome, ordem, descricao, grupoId);
		
		return gerenciar(id, form);
	}

	/**
	 * @param nome
	 * @param ordem
	 * @param descricao
	 * @return
	 */
	private SetorForm buildForm(String nome, Integer ordem, String descricao, Long grupoId) {
		return new SetorForm(nome, descricao, ordem, grupoId);
	}

	private Setor gerenciar(SetorForm form) {
		
		Setor setor = criar(form);
		
		return atualizar(setor, form);
	}

	private Setor gerenciar(Long id, SetorForm form) {
		
		Setor setor = repository.load(Setor.class, id);
		
		return atualizar(setor, form);
	}
	
	private Setor atualizar(Setor setor, SetorForm form) {
		
		GrupoSetor grupo = repository.load(GrupoSetor.class, form.getGrupoId());
		
		setor = preencher(setor, form, grupo); 
		
		repository.saveOrUpdate(setor);
		
		return setor;
	}
	
	private Setor preencher(Setor setor, SetorForm form, GrupoSetor grupo) {
		UserDetails usuarioLogado = SecurityContext.getUsuarioLogado();
		
		setor.setNome(form.getNome());
		setor.setOrdem(form.getOrdem());
		setor.setDescricao(form.getDescricao());
		setor.setUsuarioId(usuarioLogado.getUsuId());
		setor.setUsuarioNome(usuarioLogado.getNome());
		setor.setGrupo(grupo);
		
		return setor;
	}
	
	private Setor criar(SetorForm form) {
		
		SetorBuilder builder = Setor.builder()
				.ativo(Boolean.TRUE)
				.nome(form.getNome()).ordem(form.getOrdem())
				.descricao(form.getDescricao());
		
		return builder.build();
	}
}
