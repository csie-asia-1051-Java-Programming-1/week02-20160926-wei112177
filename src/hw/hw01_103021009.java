package hw;

/*
 * Topic: 假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，
 * 給了小明N元，且媽媽交待，要老闆找小明的零錢的數目要最少，
 * 而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
 * 請問老問需找多少個1元、5元、50元，其銅板數目最少。
 * (先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，且a115+ a220+ a3*30小於或等於N。
 * 列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
 * Date: 2016/10/01
 * Author:103021009	吳庭瑋
 */
import java.util.*;

public class hw01_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a1 = scn.nextInt();
		int a2 = scn.nextInt();
		int a3 = scn.nextInt();

		int x = (n - (15 * a1 + 20 * a2 + 30 * a3)) / 50;
		int y = ((n - (15 * a1 + 20 * a2 + 30 * a3)) - 50 * x) / 5;
		int z = (((n - (15 * a1 + 20 * a2 + 30 * a3)) - 50 * x) - 5 * y) / 1;

		if (15 * a1 + 20 * a2 + 30 * a3 <= n) {
			System.out.println("找小明" + z + "個1元," + y + "個5元," + x + "個50元");
		} else {
			System.out.println(0);
		}
	}

}
