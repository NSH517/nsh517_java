package mission;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum1 =0;
		int sum2 = 0;
		
		for (int i = 1; i <= N; i+=2) {
			System.out.print(i);
			sum1 += i;
			if(i< N-1) {
				System.out.print("+");
			}
			
		}
		System.out.println("=" + sum1);
		
		for (int i = 2; i <= N; i+=2) {
			System.out.print(i);
			sum2 += i;
			if(i < N-1) {
				System.out.print("+");
			}
			
		}
		System.out.println("=" + sum2);
		
	
		sc.close();

	}

}
