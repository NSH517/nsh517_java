package mission;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i]=sc.nextInt();
			}
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
		}	
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

		
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
		}	
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i]+ " ");
		}

		
		
		sc.close();
	}

}
