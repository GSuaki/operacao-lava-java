/**
 * 
 */
package patterns.visitor;

/**
 * @author GSuaki
 *
 */
public class Argentina implements Visitable {

	/* (non-Javadoc)
	 * @see visitor.Visitable#accept(visitor.Visitor)
	 */
	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
