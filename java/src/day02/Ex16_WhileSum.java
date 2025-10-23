package day02;

public class Ex16_WhileSum {
	
	public static void main(String[] args) {
		//1 부터 100까지 합계를 구하시오.
		// 1+2+3+....+99+100 = ???
		
		int a = 1;
		int sum = 0;
		
		while(a<=100) {
			//방법1
			//sum = a + sum;
			//a++;
			
			//방법2
			//sum = sum + a++;
			
			//방법3
			sum += a++;	
		}
		System.out.println(sum);
	}
}
