package curriculim_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		System.out.println(" 課題6\n");

		// Scannerを作成
		Scanner scan = new Scanner(System.in);

		// 入力した文字列をscannerに格納
		String scanner = scan.nextLine();

		// 半角スペースで区切られた文字列を配列valuesに格納
		String[] values = scanner.split("、", 0); //＜＜①
		
		//テレビとディスプレイの時に使う
		int result = 0;		//＜＜Ａ
		
		//テレビとディスプレイが出た数をカウント
		int count = 0;
		
		for (String value : values) { //＜＜②　①に入った要素を順番に取り出す

			System.out.println();
			Random random = new Random(); //＜＜③　在庫を0～11内でランダムで作成
			int stock = random.nextInt(12);
			
			
			switch (value) { //＜＜④　②で取り出した要素を仕分ける
			
			case "パソコン":

			case "冷蔵庫":

			case "扇風機":

			case "洗濯機":

			case "加湿器":

				System.out.println(value + "の残り台数は" + stock + "です。");

				break;

			case "テレビ":

			case "ディスプレイ":
				
				//どちらか一つならランダム、二つ出たらcountして合わせて11になるよう出力
				result = count==0? stock: 11-result; 

				System.out.println(value + "の残り台数は"+result + "です。");//＜＜Ａ

				count++;
				break;
				
			default:

				System.out.println("『"+value+"』は指定の商品ではありません\n");

				break;

			}
			
			scan.close();
			
		}
	}
}
