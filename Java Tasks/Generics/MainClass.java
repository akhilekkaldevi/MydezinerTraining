package Generics;

public class MainClass {

	public static void main(String[] args) {
		GenericClass<String> string = new GenericClass<String>("Hello");

		GenericClass<Integer> integer = new GenericClass<Integer>(2);

		GenericClass<Boolean> boolean = new GenericClass<Boolean>(true);

		GenericClass<Employee> employee = new GenericClass<Employee>(new Employee(21, "Abhinay", 20000, "Engineer"));

		GenericClass<Car> car = new GenericClass<Car>(new Car("Blue", "Ford", 2000000));

		System.out.println("String " + string.getData());
		System.out.println("\nInteger " + integer.getData());
		System.out.println("\nBoolean " + boolean.getData());
		System.out.println("\nEmployee Details\n" + employee.getData());
		System.out.println("\nCae Details\n" + car.getData());
	}
}
