package java125_user;

public class UserName {
	
	public String userName;
	
	public String getUserName() {
		
		return this.userName;	// メインに返す
		
	}
	
	public void setUserName(String name) {
		
		this.userName = name;	// scanの値を受け取る
		
	}
	
	public void scanName() {
		
		System.out.print("\n名前を決めよう！⇒");
			
	}
	
	public void hello() {
		
		System.out.println("\n\nこんにちは 「 " +  userName + " 」 さん");
			
	}

	final String jobs[] = {"戦士", "魔法使い", "格闘家", "勇者"};
	
}
