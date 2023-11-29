package java130;

public class Person {
	// インスタンスフィールドを定義

	public  String name;
	public int age;
	public double height;
	public double weight;	
	public int count;
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		this.count++;
		
	}
	
	public double bmi() {
		
		  return this.weight / this.height / this.height;
		  
	}
	
	public void print() {
		
		System.out.println("\n「名前は" + this.name + "です」,");
		System.out.println("「年は" + this.age + "です」");
		System.out.println("「BMIは" + Math.floor(this.bmi()) + "です」");
		
		System.out.println("\n\n合計" + this.count+"人です");
	}
	
}