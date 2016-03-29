/**
 * 
 */
package patterns.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author GSuaki
 *
 */
public class DynamicProxyDemo {
	
	public static void main(String[] args) {
		
		UsuarioServiceImp usi = new UsuarioServiceImp();
		
		AuditLogAdvice logger = new AuditLogAdvice(usi);
		
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		
		Object service = Proxy.newProxyInstance(loader , new Class[] {UsuarioService.class, EmpresaService.class} , logger);
		
		((UsuarioService) service).saveUsuario();
		((EmpresaService) service).getEmpresaName();
	}
}	
