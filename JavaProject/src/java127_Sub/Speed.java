package java127_Sub;

public class Speed extends Name{
	
	public void setSpeed(String speed) {
		
		Integer speedInt = Integer.valueOf(speed);		// 型変換
		this.speed = speedInt;
		
	}
	
	public void SpeedP(){
		
		  System.out.println( "速度：" + speed + "km/h" );
		  
	}
	
}
