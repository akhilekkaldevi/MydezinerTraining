package Generics;

public class GenericClass<G> {
	G g;
	public GenericClass(G g) {
		this.g=g;
	}
	
	public  G getData() {
		return g;
	}
}
