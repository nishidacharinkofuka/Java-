package java125_user;

import java.util.Random;

public class Status extends UserName {
	
	Random rand = new Random();
	
	
	
	final String statuses[] = {"ＨＰ　", "ＭＰ", "攻撃力", "素早さ", "防御力"};
		
	int  job = rand.nextInt(4);
	
	public void job() {
		
		System.out.println( "この次元の 「 " + userName + " 」は" + jobs[job] + "の見習いだよ！\n");
				
	}
	public void statuses(){

		for(String s : statuses) {
				
			int power = rand.nextInt(1000);
			System.out.println( "　" + s + "：" + power );
				
		}
		
	}
		
	public void close() {
			
		System.out.println("\nさあ冒険に出かけよう！");
				
	}

}
