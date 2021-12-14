
public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Boss boss = new Boss();
		CEO ceo = new CEO();
		manager.setSuccessor(boss);
		boss.setSuccessor(ceo);
		int[] workers = new int[10];
        
        for (int i = 0; i < 9; i++) {
            workers[i] = 1 + (int)(Math.random() * 10);
        }
        
        for (int i = 0; i < 9; i++) {
            System.out.println("Worker " + (i + 1) + " requested a raise.");
            manager.processRequest(new RaiseRequest(workers[i]));
            System.out.println("\n");
        }
	}
}
