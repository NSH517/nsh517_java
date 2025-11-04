package mission;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m =1 ;
		int arr[][] = new int [N][N];
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = m;
					m++;
				}
			} else{
				for (int j2 = arr.length-1; j2 >= 0; j2--) {
					arr[i][j2] = m;
					m++;
						
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
