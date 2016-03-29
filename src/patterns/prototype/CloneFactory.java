/**
 * 
 */
package patterns.prototype;

/**
 * @author GSuaki
 *
 */
public class CloneFactory {
	
	public Animal getClone(Animal sample) {
		return sample.makeCopy();
	}
}
