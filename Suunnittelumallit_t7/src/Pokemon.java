
public class Pokemon {
	
	private State state;
	
	public Pokemon() {
		state = null;
	}
	
	public Pokemon(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}

}
