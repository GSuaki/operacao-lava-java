/**
 * 
 */
package patterns.visitor;

/**
 * @author GSuaki
 *
 */
public class TaxiVisitor implements Visitor {

	/* (non-Javadoc)
	 * @see visitor.Visitor#visit(visitor.Brasil)
	 */
	@Override
	public String visit(Brasil brasil) {
		return "Taxi visitando brasil";
	}

	/* (non-Javadoc)
	 * @see visitor.Visitor#visit(visitor.Uruguai)
	 */
	@Override
	public String visit(Uruguai uruguai) {
		return "Taxi visitando uruguay";
	}

	/* (non-Javadoc)
	 * @see visitor.Visitor#visit(visitor.Argentina)
	 */
	@Override
	public String visit(Argentina argentina) {
		return "Taxi visitando argentina";
	}

}
