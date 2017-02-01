import java.util.Random;

public class Dice {
	
	private int sides = 6;


	public int roll(){
		return new Random().nextInt(sides)+1;
	}

	public static void main(String[] args){
		Dice ourDice = new Dice();
		System.out.println("Hello, you rolled a " + ourDice.roll() + ". If you got a 1 or a 6 you are very lucky.");
	}
}