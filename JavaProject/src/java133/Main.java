package java133;

class Main {
	public static void main(String[] args) {
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
//		person1.print();
		car.setOwner(person1.fullName());
		System.out.println(car.getOwner());   
		person1.buy(car);
		
		
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
//		person2.print();
		bicycle.setOwner(person2.fullName());
		System.out.println(bicycle.getOwner());
		person2.buy(bicycle);
		
		
		Person.printCount();
		
		
	}
}
