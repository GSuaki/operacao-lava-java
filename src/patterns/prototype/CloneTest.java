/**
 * 
 */
package patterns.prototype;

/**
 * @author GSuaki
 *
 */
public class CloneTest {

	public static void main(String[] args) {
		
		CloneFactory animalMaker = new CloneFactory();
		
		Dog dhara = new Dog("Dogao", new Dono("Gabriel"));
		Dog dharaClone = (Dog) animalMaker.getClone(dhara);
		
		System.out.println(dhara);
		System.out.println(dharaClone);
		
		System.out.println("Dhara hashcode: " + System.identityHashCode(dhara));
		System.out.println("DharaClone hashcode: " + System.identityHashCode(dharaClone));
		
		System.out.println("Dhara dono hashcode: " + System.identityHashCode(dhara.getDono()));
		System.out.println("DharaClone dono hashcode: " + System.identityHashCode(dharaClone.getDono()));
	}
}
