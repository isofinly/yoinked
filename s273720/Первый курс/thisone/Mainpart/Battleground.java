import ru.ifmo.se.pokemon.*;
public class Battleground {
	
	public static void main(String[] args) {
		Battle field  =new Battle();
		field.addAlly(new Basculin("fish",1));
		field.addAlly(new Cubchoo("small bear",5));
		field.addAlly(new Beartic("big bear",10));
		field.addFoe(new Fletchling("tiny bird", 1));
		field.addFoe(new Fletchinder("mid bird", 5));
		field.addFoe(new Talonflame("big bird", 10));
		field.go();
	}
}