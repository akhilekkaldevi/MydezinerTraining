package Generics;

public class MainClass {

	public static void main(String[] args) {
		GenericClass<String> str = new GenericClass<String>("Hello");

		GenericClass<Integer> i = new GenericClass<Integer>(2);

		GenericClass<Boolean> b = new GenericClass<Boolean>(true);

		GenericClass<Employee> e = new GenericClass<Employee>(new Employee(21, "Abhinay", 20000, "Engineer"));

		GenericClass<Car> c = new GenericClass<Car>(new Car("Blue", "Ford", 2000000));

		System.out.println("String " + str.getData());
		System.out.println("\nInteger " + i.getData());
		System.out.println("\nBoolean " + b.getData());
		System.out.println("\nEmployee Details\n" + e.getData());
		System.out.println("\nCae Details\n" + c.getData());
	}
}
