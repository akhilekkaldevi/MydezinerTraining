

public class Generics {
	public static void main(String[] args) {
		MultipleTypes<String> str=new MultipleTypes<String>("Hello");
		MultipleTypes<Integer> i=new MultipleTypes<Integer>(2);
		MultipleTypes<Boolean> b=new MultipleTypes<Boolean>(true);
		System.out.println("String "+str.getData()+"\nInteger "+i.getData()+"\nBoolean "+b.getData());
	}
}
class MultipleTypes<G>{
	G g;
	public MultipleTypes(G g) {
		this.g=g;
	}
	
	public  G getData() {
		return g;
	}
}
