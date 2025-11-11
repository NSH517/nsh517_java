package day17.Thread.Ex04_Interrunpt;

public class SleepTest extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000); 
				// 현재 스레드를 지정한 시간 만큼 Not Runnable 상태로 변경
			} catch (InterruptedException e) {
				throw new RuntimeException();
			}
			System.out.println((i + 1) + "초");
			
		}
	}
	public static void main(String[] args) {
		SleepTest test = new SleepTest();
		test.start();
	}
	

}
