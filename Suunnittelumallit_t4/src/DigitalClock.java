
public class DigitalClock implements Observer {
	
	private ClockTimer timer;
	public DigitalClock(ClockTimer ct){
		timer = ct;
		timer.attach(this);
	}
	
	@Override
	public void update(Subject s) {
		if (s == timer){
			draw();
		}
	}
	
	private void draw(){
		System.out.println("Hours: " + timer.getHour() + ", minutes: " + timer.getMinute() + 
				", seconds: " + timer.getSecond() + ".");
	}
}