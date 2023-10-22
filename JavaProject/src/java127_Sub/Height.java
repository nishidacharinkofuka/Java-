package java127_Sub;

public class Height extends Name{
	
	public void setHeight(String height) {
		
		double heightDb = Double.parseDouble(height);		// 型変換
		
		this.height = heightDb;
	}
	
	public void HeightP() {
		
		System.out.println( "体長：" + height + "m" );
		
	}
}
