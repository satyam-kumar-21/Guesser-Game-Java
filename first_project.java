import java.util.Scanner;

class Guesser {
    int guessNumGuesser;

    int guessingNumByGuesser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number: ");
        guessNumGuesser = sc.nextInt();
        return guessNumGuesser;
    }
}

class player {
    int guessNumPlayer;

    int guessingNumByPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player guess the number: ");
        guessNumPlayer = sc.nextInt();
        return guessNumPlayer;
    }
}

class umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumByGuesser();
    }

    void collectNumFromPlayer() {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        numFromPlayer1 = p1.guessingNumByPlayer();
        numFromPlayer2 = p2.guessingNumByPlayer();
        numFromPlayer3 = p3.guessingNumByPlayer();
    }

    void compare() {
        if(numFromGuesser==numFromPlayer1){
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser==numFromPlayer2){
				System.out.println("Player 1 and Player2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3){
				System.out.println("Player 1 and Player3 won ");
			}
			else{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
        {
			if(numFromGuesser==numFromPlayer3){
			System.out.println("Player 2 and Player3 won the game");
			}
			else{
				System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3){
			System.out.println("Player 3 won the game");
		}
		else{
			System.out.println("Game lost! try again");
		}
	
    }
}

public class first_project {
    public static void main(String[] args) {
        System.out.println("Game started!!!");
        umpire u= new umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
