package Ch08;

import java.util.*;

class DiceGame {
	int diceFace;
	int userGuess;
	
	private void RollDice() { 
		diceFace = (int)(Math.random() * 6) + 1; 
	}
	
	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in); 
		return sc.nextInt();
	}
	
	private void checkUserGuess() {
		if(diceFace == userGuess)
			System.out.println("맞았습니다");
		else
			System.out.println("틀렸습니다");
	}
	
	public void startPlaying() {
		userGuess = getUserInput("예상값을 입력하세요 : ");
		RollDice();
		checkUserGuess();
	}
}

public class DiceGameTest {

	public static void main(String[] args) {
		
		DiceGame game = new DiceGame();
		game.startPlaying();
	}

}
