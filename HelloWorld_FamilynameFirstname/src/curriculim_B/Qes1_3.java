package curriculim_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		/*---------------
		 * 
		 * １：はじめ
		 * 
		 ---------------*/

		// キーボード入力の準備
		Scanner scan = new Scanner(System.in);

		//じゃんけんの手
		String hands[] = { "グー", "チョキ", "パー" };

		// PCの手（0-2の乱数）を生成
		Random random = new Random();
		int pcHands = random.nextInt(3);

		//じゃんけんを行った回数
		int count = 0;

		//英数字判定
		final String nameJudge = "^[0-9a-zA-Z]+$";

		//じゃんけん判定
		final String jankenJudge = "^[0-9]+$";
		

		/*-----------------------
		 * 
		 * ２：ユーザー名チェック
		 * 
		 ----------------------*/

		System.out.println(); //見やすさの為に改行
		System.out.println("ＳＴＡＲＴ！");

		while (true) {

			String userName = scan.nextLine();

			if (userName.isEmpty()) {

				//条件　0またはnull
				System.out.println("名前を入力してください。");

			} else if (!userName.matches(nameJudge)) {

				//条件　英数字判定
				System.out.println("半角英数字のみで名前を入力してください。");

			} else if (userName.length() > 10) {

				//条件①　10文字以下
				System.out.println("名前を10文字以内にしてください。");

			} else {

				//正常入力
				System.out.println("ユーザー名「 " + userName + " 」を登録しました。");
				

			/*------------------------
			 * 
			* ３：じゃんけんチェック
			* 
			-------------------------*/

				System.out.println(); //見やすさの為に改行
				System.out.println("じゃんけんを入力してください。");

				//ユーザー名が正常なら実行
				while (true) {

					String userHandsCheck = scan.nextLine();

					if (userHandsCheck.isEmpty()) {

						//条件　0またはnull
						System.out.println("じゃんけんを入力してください。");
						continue;

					} else if (!userHandsCheck.matches(jankenJudge)) {

						//条件　数字判定
						System.out.println("数字のみで名前を入力してください。");
						continue;

					}

					//数字判定がクリアできたら整数に変換
					int userHands = Integer.parseInt(userHandsCheck);

					//0-2の数字指定
					if (userHands < 0 || userHands >= 3) {

						System.out.println("0-2の数字を入力してください。");
						continue;

					} else {

						//じゃんけん配列から取り出して表示
						System.out.println(userName + "の手は" + hands[userHands]);
						System.out.println("相手の手は" + hands[pcHands]);

					/*---------
					 * 
					* ４：勝敗
					* 
					----------*/

						if (userHands == 1 && pcHands == 0) {

							System.out.println("俺の勝ち！\r\n負けは次につながるチャンスです！\r\nネバーギブアップ！");
							count = count + 1; //回数カウント

						} else if (userHands == 2 && pcHands == 1) {

							System.out.println("俺の勝ち！\r\nたかがじゃんけん、そう思ってないですか？\r\nそれやったら、次も俺が勝ちますよ");
							count = count + 1;

						} else if (userHands == 0 && pcHands == 2) {

							System.out.println("俺の勝ち！\r\nなんで負けたか、明日まで考えといてください。\r\nそしたら何かが見えてくるはずです");
							count = count + 1;

						} else if (userHands == pcHands) {

							System.out.println("DRAW あいこ　もう一回しましょう");
							count = count + 1;

						} else {

							count = count + 1;
							System.out.println("やるやん。\r\n次は俺にリベンジさせて");
							System.out.println("勝つまでにかかった合計回数は" + count + "回です");

							//countをリセット
							count = 0;

							break; //終了

						}
						scan.close();
					}
				}
			}
		}
	}
}
