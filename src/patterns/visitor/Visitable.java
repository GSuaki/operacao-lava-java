/**
 * 
 */
package patterns.visitor;

/**
 * @author GSuaki
 *
 */
public interface Visitable {
	
	public String accept(Visitor visitor);
}
