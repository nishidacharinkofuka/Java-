package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		/*------------------------------------------------------
		 * 
		 * Q1：変数宣言
		 * 
		 ------------------------------------------------------*/
		
		byte int1;				//バイト型
		short int2;			//短整数型
		int int3;			//整数型
		long int4;			//長整数型
			
		float int5;			//単精度浮動小数点数型
		double int6;			//倍精度浮動小数点数型
		
		char str1;			//文字型
		
		String str2;		//文字列型
			
		boolean data;		//ブーリアン型
		
		
		/*------------------------------------------------------
		 * 
		 * Q2：初期化
		 * 
		 ------------------------------------------------------*/
		int1 = 0;				//バイト型
		int2 = 0;			//短整数型
		int3 = 0;			//整数型
		int4= 0L;			//長整数型
			
	    int5 = 0.0F;			//単精度浮動小数点数型
		int6 = 0.0d;			//倍精度浮動小数点数型
		
		str1 = '\000';			//文字型
		
		str2 = null;		//文字列型
			
		data = false;		//ブーリアン型
		
		/*------------------------------------------------------
		 * 
		 * Q3：代入
		 * 
		 ------------------------------------------------------*/
		 
		int1 = 10;				//バイト型
		int2 = 100;			//短整数型
		int3 = 1000;			//整数型
		int4 = 10000L;			//長整数型
			
		int5 = 9.5F;			//単精度浮動小数点数型
		int6 = 10.5;			//倍精度浮動小数点数型
		
		str1 = 'a';			//文字型
		
		str2 = "ハロー";		//文字列型
			
		data = true;		//ブーリアン型
		
		
		/*-------------------------------------------------------
		 * 
		 * Q4：コンソール出力
		 * 
		 ------------------------------------------------------*/
		
		//①大きい方の型変えて宣言
		long printInt = ( int1 + int2 + int3 + int4); 	
		System.out.println (printInt);
		
		//１０×２
		System.out.println(int1 * 2); 					
		
		//文字列の連結
		String printStr = (str1 + str2 + data);				
		System.out.println(printStr);
		
		//①の結果も利用して大きい方の型変えて宣言、整数にして表示
		double printInt2 = (printInt + int5 + int6);
		System.out.println((int)printInt2);	
		
		//掛け算
		long printInt3 = ( int1 * int2 * int3 * int4);
		System.out.println (printInt3);
		
		//割り算
		int printInt4 = (int1 - 100);
		System.out.println (printInt4);
		
		
		/*------------------------------------------------------
		 * 
		 * Q5：正しくする
		 * 
		 ------------------------------------------------------*/
		 
		String num = "20";
		int num1 = 23;
		//String型にして出力
		System.out.println((String) "ハローJAVA" + ( num + num1));
		
		
		/*------------------------------------------------------
		 * 
		 * Q6：変数宣言して連結
		 * 
		 ------------------------------------------------------*/
		
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2; 
		String food = "寿司"; 
		
		System.out.println("「初めまして"+ name +"です」");
		System.out.println("「年齢は"+ age +"歳です」");
		System.out.println("「身長は"+ height +"cmです」");
		System.out.println("「体重は"+ weight +"kgです」");
		System.out.println("「好きな食べ物は"+ food +"です」");

		
		/*------------------------------------------------------
		 * 
		 * Q7：BMI
		 * 
		 ------------------------------------------------------*/
		
		//cmをmにする
		double bmiHeight = height/100;
		//体重 / 身長 2乗
		double bmi = weight / Math.pow( bmiHeight, 2 );
		//小数点第二で四捨五入するためにbmiに10を掛けて
		//roundメソッドで四捨五入してdouble型にキャストして再度10で割る
		System.out.println("「BMIは"+ ((double)Math.round (bmi * 10))/10 +"です」");
		
		/*------------------------------------------------------
		 * 
		 * Q8：Q6を再代入
		 * 
		 ------------------------------------------------------*/
		
		//再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2; 
		food = "オムライス";
		bmiHeight = height/100;
		bmi = weight / Math.pow( bmiHeight, 2 );
		
		System.out.println("「初めまして"+ name +"です」");
		System.out.println("「年齢は"+ age +"歳です」");
		System.out.println("「身長は"+ height +"cmです」");
		System.out.println("「体重は"+ weight +"kgです」");
		System.out.println("「好きな食べ物は"+ food +"です」");
		System.out.println("「BMIは"+ ((double)Math.round (bmi * 10))/10 +"です」");
		
		/*------------------------------------------------------
		 * 
		 * Q9：Q8を和算で自己代入
		 * 
		 ------------------------------------------------------*/
		
		age *= 2;
		height *= 2;
		weight *= 2;
		
		bmiHeight = height/100;
		bmi = weight / Math.pow( bmiHeight, 2 );
		
		System.out.println("「初めまして"+ name +"です」");
		System.out.println("「年齢は"+ age +"歳です」");
		System.out.println("「身長は"+ height +"cmです」");
		System.out.println("「体重は"+ weight +"kgです」");
		System.out.println("「好きな食べ物は"+ food +"です」");
		System.out.println("「BMIは"+ ((double)Math.round (bmi * 100))/100 +"です」");
		
		/*------------------------------------------------------
		 * 
		 * Q10：Q8で使用した年齢が25歳以上ならtrueが出力
		 * 
		 ------------------------------------------------------*/
		
		//trueを格納
		boolean isResult = true;
		//変数に条件を代入
		isResult = age >= 25;
		//表示
		System.out.println(isResult);
		
		/*------------------------------------------------------
		 * 
		 * Q11：型変換+連結（数値→文字列）
		 * 
		 ------------------------------------------------------*/
		
		//Q9で再代入された数値を戻す
		String a = String.valueOf(age/=2);
		String h = String.valueOf(height/=2);
		String w = String.valueOf(weight/=2);
		
		//連結
		System.out.println( a + h + w );
		
		/*------------------------------------------------------
		 * 
		 * Q12：型変換（文字列→整数）
		 * 
		 ------------------------------------------------------*/
		
		int a2 = Integer.parseInt(a);
		double h2 = Double.parseDouble(h);
		
		System.out.println( a2 );
		System.out.println( h2 );
		
		/*------------------------------------------------------
		 * 
		 * Q12：Q11で使用した年齢が
		 * 25歳以上もしくは身長が160以上ならtrueが出力
		 * 
		 ------------------------------------------------------*/
		
		//trueを格納
		boolean isResult2 = true;
		//変数に条件を代入
		isResult2 = a2 >= 25 || h2>160;
		//表示
		System.out.println(isResult2);
		
		
		
		
		char c = '\u0078';
		System.out.println(c);
		
	}

}
