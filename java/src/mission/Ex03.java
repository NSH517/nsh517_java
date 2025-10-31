package mission;

public class Ex03 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int m = i/10;
			int n = i%10;
			
			if(((m==3)||(m==6)||(m==9))&&((n==3)||(n==6)||(n==9))) {
				System.out.println("**");
			}else if(((m==3)||(m==6)||(m==9))||((n==3)||(n==6)||(n==9))) {
				System.out.println("*");
			}else System.out.println(i);
	
		}
	}

}
