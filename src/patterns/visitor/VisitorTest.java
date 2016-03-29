/**
 * 
 */
package patterns.visitor;

/**
 * @author GSuaki
 *
 */
public class VisitorTest {
	
	public static void main(String[] args) {
		
		Brasil brasil = new Brasil();
		Uruguai uruguai = new Uruguai();
		Argentina argn = new Argentina();
		
		TaxiVisitor taxi = new TaxiVisitor();
		CarVisitor car = new CarVisitor();
		
		System.out.println(brasil.accept(taxi));
		System.out.println(brasil.accept(car));

		System.out.println(uruguai.accept(taxi));
		System.out.println(uruguai.accept(car));

		System.out.println(argn.accept(taxi));
		System.out.println(argn.accept(car));
	}
}
