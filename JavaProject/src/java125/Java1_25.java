package java125;

import java.util.Scanner;

public class Java1_25 {
	
	public static void main(String[] args) {
		
		java125_user.Status status = new java125_user.Status();
		
		// Scannerを作成
		Scanner scan = new Scanner(System.in);
		
		while (true) {
		
		status.scanName();	//名前入力を促す（遊びです）
		String scanName = scan.nextLine();
		
		status.setUserName(scanName);	//入力された値をスーパークラスのuserNameに渡す
		
		if(status.getUserName().isEmpty()) {	//名前が空でなければ出力
			
			continue;
			
		}else{
			
			status.hello();	//挨拶
			
			status.job();	//職業（遊びです）
			
			status.statuses();  //ステータス
			
			status.close();		//終わり
			
			break;
			
		}
		}scan.close();
		

	}
	
}
