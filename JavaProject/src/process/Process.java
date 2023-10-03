package process;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		LocalDateTime exDate = LocalDateTime.now();
		DateTimeFormatter day = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:SS");
		this.time = day.format(exDate);
	}
	}


