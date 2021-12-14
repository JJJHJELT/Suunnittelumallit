
public class Main {   
    public static void main(String[] args) {
        Converter c = new Converter(new StrategyA());
        System.out.println("First strategy: \n");
        c.addToList("First");
        c.addToList("Second");
        c.addToList("Third");
        c.addToList("Fourth");
        c.addToList("Fifth");
        c.addToList("Sixth");
        c.addToList("Seventh");
        c.addToList("Eighth");
        c.addToList("Ninth");
        c.printList();
        System.out.println("\n");
        c.setStrategy(new StrategyB());  
        System.out.println("Second strategy: \n");
        c.printList();
        System.out.println("\n");
        c.setStrategy(new StrategyC());
        System.out.println("Third strategy: \n");
        c.printList();
    }
}