/**
 * 
 */
package patterns.visitor;

/**
 * @author GSuaki
 *
 */
public class CarVisitor implements Visitor {

	/* (non-Javadoc)
	 * @see visitor.Visitor#visit(visitor.Brasil)
	 */
	@Override
	public String visit(Brasil brasil) {
		return "Car visitando brasil";
	}

	/* (non-Javadoc)
	 * @see visitor.Visitor#visit(visitor.Uruguai)
	 */
	@Override
	public String visit(Uruguai uruguai) {
		return "Car visitando uruguay";
	}

	/* (non-Javadoc)
	 * @see visitor.Visitor#visit(visitor.Argentina)
	 */
	@Override
	public String visit(Argentina argentina) {
		return "Car visitando argentina";
	}

}
