/**
 * 
 */
package patterns.prototype;

/**
 * @author GSuaki
 *
 */
public class Dog implements Animal {
		
	private String nome;
	
	private Dono dono;
	
	public Dog(String nome, Dono dono) {
		this.setNome(nome);
		this.setDono(dono);
		System.out.println("Dog está sendo criado.");
	}
	
	/* (non-Javadoc)
	 * @see prototype.Animal#getClone(prototype.Animal)
	 */
	@Override
	public Animal makeCopy() {
		
		Dog dog = null;
				
		try {
			dog = (Dog) super.clone();
			System.out.println("Dog está criado.");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return dog;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog au au au";
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the dono
	 */
	public Dono getDono() {
		return dono;
	}

	/**
	 * @param dono the dono to set
	 */
	public void setDono(Dono dono) {
		this.dono = dono;
	}
}
