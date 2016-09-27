package ex;

/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；	
 * 600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 * 讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 1050210XX 103021009	吳庭瑋
 */
import java.util.*;

public class ex01_103021009 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float p = (float) 0.5;
		int x = scn.nextInt();
		float y = 0;
		if (x < 600) {
			y = x * p;
		} else {
			if (600 < x && x < 1200) {
				y = (float) (x * p * 0.9);
			} else {
				y = (float) (x * p * 0.79);
			}
		}
		System.out.println(y);
	}

}
