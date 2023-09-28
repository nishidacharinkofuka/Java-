package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		//インスタンスの生成
		Dog classDogQ1= new Dog(); 
		String dogClassQ1= classDogQ1.animal;
		System.out.println("Q1：" + dogClassQ1);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog classDogQ2= new Dog(1);
		int dogClassQ2= classDogQ2.animals;
		System.out.println("Q2：" + dogClassQ2);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date exDate = new Date();   // 現在の日時を取得
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");	//パターンを指定
        System.out.println("Q3：" + sdf.format(exDate));
	}
}
