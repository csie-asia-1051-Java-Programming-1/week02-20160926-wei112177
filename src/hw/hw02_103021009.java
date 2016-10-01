package hw;

/*
 *已知男生標準體重＝(身高－80 )0.7；女生標準體重＝(身高－70)0.6；
 *試寫一個程式可以計算男生女生的標準體重。(輸入兩個數值，
 *依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/10/01
 * Author:103021009	吳庭瑋
 */
import java.util.*;

public class hw02_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		double b = scn.nextDouble();
		if (a == 1) {
			System.out.println((b - 80) * 0.7);
		} else {
			if (a == 2) {
				System.out.println((b - 70) * 0.6);
			} else {
				System.out.println(false);
			}
		}
	}

}
