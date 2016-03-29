/**
 * 
 */
package patterns.visitor;

/**
 * @author GSuaki
 *
 */
public interface Visitor {
	
	public String visit(Brasil brasil);
	public String visit(Uruguai uruguai);
	public String visit(Argentina argentina);
}
