package curriculim_B;

public class Qes4 {

	public static void main(String[] args) {

		// 九九の計算

		System.out.println(" 課題4\n\n");

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				//答えを0埋め
				String kuku = String.format("%02d", i * j);
				//iを0埋め
				String iF = String.format("%02d", i);
				//jを0埋め
				String jF = String.format("%02d", j);

				//段の最後は枠を付けない条件式
				if (j <= 8) {

					System.out.print(" " + iF + " * " + jF + " = " + kuku + " ||");

				} else {

					System.out.print(" " + iF + " * " + jF + " = " + kuku);

				}

			}

			// 改行
			System.out.println();
			System.out.println();

		}

	}

}
