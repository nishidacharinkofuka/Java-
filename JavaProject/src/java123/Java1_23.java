package java123;


public class Java1_23 {
	
	public static void main(String[] args) {
		
		Profile profile = new Profile();	
		
		profile.setAnimal("ライオン");
		profile.setHeight(2.1);
		profile.setSpeed(80);
		
		System.out.println("動物名：" + profile.getAnimal());
		System.out.println("体長：" + profile.getHeight() + "m");
		System.out.println("速度：" + profile.getSpeed() + "km/h");
		
	}
	

}