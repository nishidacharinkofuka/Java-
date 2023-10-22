package Java127;

import java.util.Scanner;

public class Java_127 {
	public static void main(String[] args) {
		
		java127_Sub.Name name = new java127_Sub.Name();
		java127_Sub.Height height = new java127_Sub.Height();
		java127_Sub.Speed speed = new java127_Sub.Speed();
		
		 Scanner scn = new Scanner(System.in);
		 String line = scn.next();
		 
		 
		 String[] scanStr = line.split(",");	// ","で区切る
		 
		 
		 for (String str : scanStr) {		// ","で区切った要素を取り出して
			 
			String[] idi = str.split(":"); // ":"で区切る
				 
			name.setName(idi[0]);
			height.setHeight(idi[1]);		// 各項目をsetに与える
			speed.setSpeed(idi[2]);
				 
			 name.NameP();					// 出力
			 height.HeightP();
			 speed.SpeedP();
			 name.AnimalP();
			 
		 }
		 
		 scn.close();
	 
		 }
	}
