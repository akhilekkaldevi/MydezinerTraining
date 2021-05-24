/* Generics with multiple type parameters */
class MultipleTypes<M, T, G>{
    M ob;
    T ob1;
    G ob2;
    MultipleTypes(M ob, T ob1, G ob2){
        this.ob = ob;
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    public void display(){
        System.out.println(ob);
        System.out.println(ob1);
        System.out.println(ob2);
    }
}

/* Generics with Single Parameter */
class MultipleReUse<MR>{
    MR object;
    
    MultipleReUse(MR object){
        this.object = object;
    }
    public MR display(){
        return object;
    }
    
}

public class Generics
{
	public static void main(String[] args) {
		MultipleTypes<Integer, String, Double> myObject = new MultipleTypes<Integer, String, Double>(100, "Rajesh Kumar", 4.5);
		myObject.display();
		MultipleReUse<Integer> object = new MultipleReUse<Integer>(400);
		MultipleReUse<String> object1 = new MultipleReUse<String>("CustomFurnish");
		System.out.println(object.display());
		System.out.println(object1.display());
		
	}
}
