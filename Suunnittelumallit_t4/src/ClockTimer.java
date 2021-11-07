
import java.time.LocalTime;

public class ClockTimer extends Subject implements Runnable {
	
	private LocalTime time;
	
	public int getHour(){
		return time.getHour();
	}
	
	public int getMinute(){
		return time.getMinute();	
	}
	
	public int getSecond(){
		return time.getSecond();	
	}
	
	@Override
	public void run() {
		while (true) {
			time = LocalTime.now();
            try {
                Thread.sleep(1000);
                notifyChange();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }		
	}
}
