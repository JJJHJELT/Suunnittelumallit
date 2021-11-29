
public class Main {

	public static void main(String[] args) {
		ContextVisitor visitor = new ContextVisitor();
		Context character1 = new Context(visitor);
		Context character2 = new Context(visitor);
		
		System.out.println("First character: \n");
		
		for (int i = 0; i < 2; i++) {
			character1.growl();
			character1.scratch();
			character1.slash();
		}
		
		System.out.println("\nSecond character: \n");
		
		for (int i = 0; i < 3; i++) {
			character2.growl();
			character2.scratch();
			character2.slash();
		}

	}

}
