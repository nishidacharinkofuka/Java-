package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Process {
	
	// フィールド変数
	public String country = "";
	public String food = "";
	public String shoku = "";
	public String time = "";
	
	public Process(String country, String food, String shoku) {
	
		this.country = country;
		this.food = food;
		this.shoku = shoku;
		
	}

	public Process() { 
		
		//現在日時取得
		Date exDate = new Date();
		SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		this.time = day.format(exDate);
	}
	}


