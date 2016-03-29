/**
 * 
 */
package principles.srp;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author GSuaki
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Setor {
	
	private Long id;
	
	private String nome;
	
	private String descricao;
	
	private Integer ordem;
	
	private Long usuarioId;
	
	private String usuarioNome;
	
	@Setter(value = AccessLevel.NONE)
	private Boolean ativo;
	
	private GrupoSetor grupo;
	
	public Setor(String nome2, Integer ordem2, String descricao2, Long usuId, String nome3, GrupoSetor grupo2) {
		// TODO Auto-generated constructor stub
	}

	public void ativar() {
		this.ativo = Boolean.TRUE;
	}
	
	public void desativar() {
		this.ativo = Boolean.FALSE;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param b
	 */
	public void setAtivo(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}
