/**
 * 
 */
package patterns.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author GSuaki
 *
 */
public class AuditLogAdvice implements InvocationHandler {
	
	private Object target;
	
	/**
	 * 
	 */
	public AuditLogAdvice(Object target) {
		this.target = target;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("Logging the action...");
		
		Object result = method.invoke(target, args); 
		
		return result;
	}

}
