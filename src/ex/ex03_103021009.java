package ex;

/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 103021009 
 */
import java.util.*;

public class ex03_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		double y;
		double x1 = Math.ceil(x / 30);
		if (x < 30) {
			y = 0;
		} else {
			if (30 <= x && x <= 120) {
				y = x1 * 30;
			} else {
				if (120 < x && x < 240) {
					y = 120+(x1-4)*40;
				} else {
					y = 280+(x1-8)*60;
				}
			}
		}System.out.println(Math.ceil(y));
	}
}
