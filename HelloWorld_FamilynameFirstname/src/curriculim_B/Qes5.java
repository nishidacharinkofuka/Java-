package curriculim_B;

public class Qes5 {

	public static void main(String[] args) {

		System.out.println(" 課題5\n\n");

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 20; j++) {

				//答えを0埋め
				String kuku = String.format("%03d", i * j);
				//iを0埋め
				String iF = String.format("%03d", i);
				//jを0埋め
				String jF = String.format("%03d", j);

				//段の最後は枠を付けない条件式
				if (j <= 19) {

					System.out.print(" " + jF + " * " + iF + " = " + kuku + " ||");

				} else {

					System.out.print(" " + jF + " * " + iF + " = " + kuku + " \n");

				}

			}
		}

		// 改行
		System.out.println();
		System.out.println();

	}
}