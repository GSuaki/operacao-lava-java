/**
 * 
 */
package principles.srp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author GSuaki
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetorForm {
	
	private String nome;
	
	private String descricao;
	
	private Integer ordem;
	
	private Long grupoId;
	
}
