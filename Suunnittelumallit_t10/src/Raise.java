
public abstract class Raise {
	protected static final int RAISE = 1;
    protected Raise successor;
    
    abstract protected double maxRaise();
    abstract protected String getRole();
    
    public void setSuccessor(Raise successor) {
        this.successor = successor;
    }
    
    public void processRequest(RaiseRequest request) {
        if (request.getRequest() <= this.maxRaise()) {
            System.out.println(this.getRole() + " accepted " + request.getRequest() + "% raise.");
        }else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
