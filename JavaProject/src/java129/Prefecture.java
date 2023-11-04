package java129;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prefecture {

	public static void main(String[] args) {
		
		java129_Sub.BaseStr baseStr = new java129_Sub.BaseStr();
		
		
		System.out.print("0-10の間で好きな数字を入力してね！"	// 入力を促す
				+ "\n【例】3,7,2..."
				+ "\n⇒");
		
		
		Scanner scn = new Scanner(System.in);
		
		String line = scn.nextLine();
		
		String[] scanStr = line.split(",");		// ","で区切る
		
		
		System.out.print("\n並びを指定してね！"		// 入力を促す
				+ "\n【例】昇順：0　降順：1"
				+ "\n⇒");
		
		String num01 = scn.nextLine();
		 
		
		if(num01.equals("0")) {
			
			Arrays.sort(scanStr);		// 昇順
			
		}else if(num01.equals("1")) {
			
			Arrays.sort(scanStr,Collections.reverseOrder());		// 降順
			
		}
		 
		
		for (String str : scanStr) {		// 要素を取り出して
			 
			int num = Integer.parseInt(str);	// intに変えて
				 
			baseStr.setNum(num);		// BaseStrクラスのsetに引数に入れる
			
			baseStr.Str();		//メソッドの呼び出し
			
			System.out.println(str);
			
		 }
		 
		 scn.close();

	}

}