package ex;

/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class ex02_103021009 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		double x1 = Math.pow(x, 2);
		double y1 = Math.pow(y, 2);
		double p = (x1 + y1);
		double p1 = Math.sqrt(p);
		if (p1 <= 100) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		System.out.println();
	}
}
