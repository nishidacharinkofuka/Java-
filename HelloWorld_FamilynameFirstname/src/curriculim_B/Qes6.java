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

		//テレビとディスプレイの条件分岐に使用する変数を作成
		String display = "ディスプレイ"; //＜＜Ａ

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

				String result = value.equals(display) ? display + "の残り台数は" + ( 11 - stock) + "です。"
						: value + "の残り台数は" + (stock) + "です。"; //＜＜Ａで作成した文字列を元に比較し出力を分ける

				System.out.println(result);
				break;
				
			default:

				System.out.println("『"+value+"』は指定の商品ではありません\n");

				break;

			}
			
			scan.close();
			
		}
	}
}
