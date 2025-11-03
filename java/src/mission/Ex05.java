package mission;

import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

public class Ex05 {
	
	public static void Menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("********** 치킨 메뉴판 **********");
		System.out.println("1. 황금올리브 반반한 치킨");
		System.out.println("2. 뿌잉클 치킨");
		System.out.println("3. 처갓집에서 호식이가 만든 치킨");
		System.out.println("0. 종료");
		System.out.print("********** 번호 : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
	}
	
	public static void main(String[] args) {
//do while 을 사용하여 메뉴를 불러오고 반복하기
	}

}
