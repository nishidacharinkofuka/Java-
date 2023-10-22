package java127_Sub;

public class Name {
	
	
	public String animal;
	public String name;
	public double height;
	public int speed;
	
	/*
	 *  動物名
	 */
	public String getName() {
		
		return name;
		
	}
	
	
	/*
	 *　学名
	 */
	public void setName(String animal) {
	
		switch(animal) {
		
			case "ライオン":
				this.animal = "パンテラ レオ";
				break;
				
			case "ゾウ":
				this.animal  = "ロキソドンタ・サイクロティス";
				break;
				
			case "パンダ":
				this.animal  = "アイルロポダ・メラノレウカ";
				break;
				
			case "チンパンジー":
				this.animal = "パン・トゥログロディテス";
				break;
				
			case "シマウマ":
				this.animal = "チャップマンシマウマ";
				break;
				
			case "インコ":
				this.animal = "不明";
				break;
			
		}
		
		this.name = animal;		// 仮引数できた動物名は」そのまま返す
		
	}
	
	public void NameP(){
		
		System.out.println( "\n　動物名：" + name);
		
	}
	
	public void AnimalP(){
		
		System.out.println( "学名：" + animal + "\n");
		
	}
	
	
	
	
}
