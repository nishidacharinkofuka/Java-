package execution;

import process.Process;

public class Execution {

	public static void main(String[] args) {
		
		Process com = new Process("日本", "寿司", "和食");
		 
		System.out.println("こんにちは！ここは" + com.country + "です！");
		System.out.println("この" + com.food + "はうまい");
		System.out.println( com.food + "は" + com.shoku + "です");
		
		Process comTime = new Process();
		
		System.out.println("今の現在日時は" + comTime.time + "です");
		
}
}
