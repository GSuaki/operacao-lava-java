/**
 * 
 */
package patterns.dynamicProxy;

/**
 * @author GSuaki
 *
 */
public class UsuarioServiceImp implements UsuarioService, EmpresaService {

	/* (non-Javadoc)
	 * @see dynamicProxy.UsuarioService#saveUsuario()
	 */
	@Override
	public void saveUsuario() {
		System.out.println("saving usuario...");
	}

	/* (non-Javadoc)
	 * @see dynamicProxy.EmpresaService#getName()
	 */
	@Override
	public void getEmpresaName() {
		System.out.println("getting empresa name: redspark");
	}

}
