
public class ContextVisitor implements Visitor {
	
	CharizardState charizard = new CharizardState();
	CharmeleonState charmeleon = new CharmeleonState();
	CharmanderState charmander = new CharmanderState();

	@Override
	public void visit(Context character) {
		if(character.getPoints() < 100) {
			character.setState(charmander);
		} else if(character.getPoints() > 100 && character.getPoints() < 200) {
			character.setState(charmeleon);
		} else {
			character.setState(charizard);
		}
		
	}

}
