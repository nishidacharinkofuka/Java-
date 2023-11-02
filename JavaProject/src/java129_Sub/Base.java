package java129_Sub;

public class Base {		// スーパークラス

	public String name;		// 都道府県名
	public String cap;		// 県庁所在地(capital)
	public double area;		// 面積
	
	
	public void setNum(int num) {	// 数字によって情報を分ける
		
		switch(num) {
		
		case 0:
			this.name = "北海道";
			this.cap = "札幌市";
			this.area = 38424;
			
			break;
			
		case 1:
			this.name = "青森県";
			this.cap = "青森市";
			this.area = 9646;
			
			break;
			
		case 2:
			this.name = "岩手県";
			this.cap = "盛岡市";
			this.area = 15275;
			
			break;
			
		case 3:
			this.name = "宮城県";
			this.cap = "仙台市";
			this.area = 7282;
			
			break;
			
		case 4:
			this.name = "秋田県";
			this.cap = "秋田市";
			this.area = 11638;
			
			break;
			
		case 5:
			this.name = "山形県";
			this.cap = "山形市";
			this.area = 9323;
			
			break;
			
		case 6:
			this.name = "福島県";
			this.cap = "福島市";
			this.area = 13784;
			
			break;
			
		case 7:
			this.name = "茨城県";
			this.cap = "水戸市";
			this.area = 6097;
			
			break;
			
		case 8:
			this.name = "栃木県";
			this.cap = "宇都宮市";
			this.area = 6408;
			
			break;
			
		case 9:
			this.name = "群馬県";
			this.cap = "前橋市";
			this.area = 6362;
			
			break;
			
		case 10:
			this.name = "埼玉県";
			this.cap = "さいたま市";
			this.area = 3798;
			
			break;
		
		}
	}
	
	
	public String getName() {
		
		return name;
	}
	
	public String getCap() {
		
		return cap;
	}
	
	public double getAres() {
		
		return area;
	}
}
