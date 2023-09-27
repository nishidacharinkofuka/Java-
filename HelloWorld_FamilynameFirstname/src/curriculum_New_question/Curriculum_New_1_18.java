package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void q1(String str, int numQ1) {
		
		String strnumQ1 = String.valueOf(numQ1);	//int⇒String型に変換
		
		System.out.println("Q1：" + "「" + str + strnumQ1 + "」");
		
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void q2(int numQ2) {
		
		System.out.println("Q2：" + (numQ2 * numQ2));
		
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void q3(int numQ3[]) {
		
		System.out.print("Q3：");
		
		for(int i: numQ3) {
			
			System.out.print(i + " ");	//配列から取り出して出力
			
		}		
		
		System.out.println();
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void q2(double  numQ2, double numQ4) {
		
		System.out.println("Q4：" + ( numQ2 + numQ4 ));
		
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] q5(int numQ5) {
		
		Random random = new Random();
		int rnd = 0;								//乱数の受け皿
		int randomArray[] = new int[numQ5];		//引数分の配列を作成
		System.out.print("Q5：");
		
		for(int i = 0; i < numQ5; i++) {		//引数分ループ
			
			rnd  = random.nextInt(101)+1;		//1-100の乱数作成
			System.out.print(rnd + " ");			//表示
			randomArray[i] = rnd;				//作った乱数を配列に格納
			
		}
		
		System.out.println();
		return randomArray;						//乱数が入った配列を返す
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double q6(int[] q6Array) {
		
		double q6Average = 0;						//平均点の受け皿
		System.out.print("Q6：");
		
		for(int q6Int:q6Array) {
			
			q6Average+=q6Int;						//Q5の返り値から要素を取り出して足して格納していく
			
		}
		
		q6Average = q6Average/q6Array.length;		//足されたq6Averageを配列の数で割って合計を出す
		System.out.println(q6Average);
		
		return q6Average;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void q7(double q6Result) {
		
		boolean q7 = q6Result > 50;					//50以上か否か
		
		System.out.println("Q7：" + q7);
		
		
	}
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
	
		//Q1
		q1("Hello JavaSE ", 11);
		
		//Q2
		q2(10);
		
		//Q3
		int numQ3Array[] = {10, 4, 6, 8};
		q3(numQ3Array);
		
		//Q4
		q2(10,10);
		
		//Q5
		int[] q5Array=q5(5);
		System.out.print("Q5の格納した値の確認：");		//提出用で格納されているか目視確認
		for(int q5Int:q5Array) {
		System.out.print(q5Int +" ");
		}
		System.out.println();
		
		//Q6
		double q6Result = q6(q5Array);
		q7(q6Result);
	}
}