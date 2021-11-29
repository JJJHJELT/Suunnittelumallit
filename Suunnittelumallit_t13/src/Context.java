
public class Context implements State {
	
	private State state;
	private Visitor visitor;
	int points;
	
	public Context(Visitor visitor) {
		this.visitor = visitor;
		visitor.visit(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}

	@Override
	public void growl() {
		this.state.growl();
		points += 10;
		visitor.visit(this);		
	}

	@Override
	public void scratch() {
		this.state.scratch();
		points += 50;
		visitor.visit(this);
	}

	@Override
	public void slash() {
		this.state.slash();
		points += 100;
		visitor.visit(this);
	}
	
	public int getPoints() {
		return points;
	}

}
