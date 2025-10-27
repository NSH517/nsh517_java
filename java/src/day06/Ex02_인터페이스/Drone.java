package day06.Ex02_인터페이스;

public class Drone implements RemoteControl {
	
	int speed;

	@Override
	public void turnON() {
		System.out.println("드론의 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("드론의 전원을 끕니다.");
	}

	@Override
	public void setSpeed(int speed) {
		if( speed > MAX_SPEED ) {
			this.speed = MAX_SPEED;
			System.err.println("최대 속력!");
		} 
		else if( speed < MIN_SPEED ) {
			this.speed = MIN_SPEED;
			System.err.println("최저 속력!");
		}
		else {
			this.speed = speed;
		}
		System.out.println("현재 속도 : " + this.speed);
	}

}
