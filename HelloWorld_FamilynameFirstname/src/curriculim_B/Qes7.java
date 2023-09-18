package curriculim_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		
		System.out.print("\n 課題7\n生徒の人数を入力してください（2以上）：");
		
		
		//教科の定義
		String subjects[] = {"英語","数学","理科","社会"};
		
		
		//入力（生徒数）の受付
		Scanner scan = new Scanner(System.in);
		
		//この後に使用する数字判定
		final String judge = "^[0-9]+$";
		
		/*-----------------------------
		 * 
		 * １：入力のバリデーション
		 * 
		 -----------------------------*/ 
		while (true) {
			
			//生徒数を文字列型で受け入れる
			String students = scan.nextLine();
			
			if(students.isEmpty()){
				
				//空か否か
				System.out.print("\n生徒数を入力：");
				
				continue;
				
			}else if(!students.matches(judge)){
				
				//数字か否か
				System.out.print("\n半角数字のみで名前を入力：");
				continue;
			}
				
			//数字判定がクリアできたら整数に変換
			int studentsInt = Integer.parseInt(students);	
			
			if (studentsInt < 2) {
				
				//２以上か否か
				System.out.print("\n2文字以上で入力：");
				
			}else {
				
				
			/*--------------------
			 * 
			 * ２：各生徒の点数入力
			 * 
			 ---------------------*/    
				
				//人数分と4教科分の平均点を[人数][各教科]で多次元配列で作成
				int[][] averageScore = new int[studentsInt][4];
				
				//表示用の人数・averageScore配列のインデックス指定用
				int sutudent = 1;
				
				//averageScore配列のインデックス指定用
				int kyoka = 0;
				
				//必ず1回は実行
				do {
					
					//教科の数だけ入力を促す
					for(String subject: subjects) {
						
						System.out.print( "\n" +(sutudent) + "人目の『" +subject+ "』の点数を入力してください :");	
						
						//生徒毎に各教科の点数を入れる
						averageScore[sutudent-1][kyoka++] = scan.nextInt();
						
					}
					
					//2人目以降のループ用に教科のインデックスをリセット
					kyoka = 0;
					//次の生徒を計算するために人数をカウント
					sutudent++;
					System.out.println();
	
					}while(sutudent <= studentsInt) ;  //人数分ループさせる
				
				
			 /*------------------
			  * 
			 * ３：各生徒の平均点
			 * 
			 -------------------*/
				
				//生徒の平均点
				double averageEach = 0;
				
				//averageScore配列から生徒の点数を取り出して足す
		        for( sutudent=0; sutudent < studentsInt; sutudent++) {
		        	
		            for(kyoka=0; kyoka <= 3; kyoka++) {
		            	
		            	averageEach += averageScore[sutudent][kyoka];
		                
		            }
		            
		            //合計を教科数で割る
		            averageEach = averageEach/subjects.length;
		            
		            //小数点第二で表示
		            System.out.println( ( sutudent+1 )+ "人目の平均点は" +String.format("%.2f", averageEach)+ "点です。\n");
		            
		            //次の生徒の計算のために初期化
		            averageEach =0;
		        }
		       
		        
			    /*-------------------
			    * 
			    * ４：各教科の平均点 
			    * 
			    --------------------*/
		        
		        //各教科の平均点
		        double averageSubject = 0;
		        
		        //averageScore配列から各教科の点数を取り出して足す
		        for( kyoka=0; kyoka < subjects.length; kyoka++) {
		        	
		            for( sutudent=1; sutudent < studentsInt; sutudent++) {
		            	
		            	averageSubject += averageScore[sutudent-1][kyoka];
		            	
		            }
		            
		            //合計を人数で割る
		            averageSubject = averageSubject/studentsInt;
		            
		            //小数点第二で表示
		            System.out.println( subjects[kyoka]+ "の平均点は" +String.format("%.2f", averageSubject)+ "点です。\n");
		            //次の教科の計算のために初期化
		            averageSubject =0;
		            		        
		        }
		        
		        //終わり
		        break;
		}
		}}

}
