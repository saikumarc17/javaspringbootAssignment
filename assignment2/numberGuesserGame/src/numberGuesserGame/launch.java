package numberGuesserGame;

import java.util.Scanner;

class Guesser{
	int guessNum;
	
	int guessNumber(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter number  less than or equal to 10");
		guessNum=s.nextInt();
		while(guessNum>=11) {
			
			guessNumber();
		}
		return guessNum;
	}
}

// Player 
class Player{
//	using array for storing player guessed number
	int [] playerGuessNum;
	
	int[] pguessNum(){
		System.out.println("enter number of players :  ");
		Scanner s= new Scanner(System.in);
		int playerCount=s.nextInt();
		
		playerGuessNum = new int[playerCount];
		
		for(int i=0;i<playerCount;i++) {
//			taking input from player and storing in their respected array
			System.out.println("enter player"+(i+1)+" number :");
			playerGuessNum[i]=s.nextInt();
		}
		
		return playerGuessNum;
	}
	
}

class Umpire{
	int numFromGuesser;
	int [] numFrmPlayers;
//	result is for tracking correct guessed players 
	int [] result;
	
//	for collecting guesser number
	void collectNumber() {
		Guesser g = new Guesser();
		numFromGuesser=g.guessNumber();
		System.out.println("numFromGuesser "+numFromGuesser);
		
	}
	
//	for collecting guessed number and assigning result array length
	
	void collectNumFromPlayer() {
		Player p=new Player();
		numFrmPlayers=p.pguessNum();
		result= new int[numFrmPlayers.length] ;
	}
	
//	for comparing guesser and players values
	void compare() {
		int count=0;
		for(int j=0;j<numFrmPlayers.length;j++) {
			if(numFromGuesser==numFrmPlayers[j]) {
//		if respected index+1 player guessed correctly then result of that index will be 1 else it is default value 0
				result[j]=1;
//				using count for checking if all players guessed correctly  
				count++;
			}
		}
		
//		if co0unt is equal to no of  players then game tied
		if(count==numFrmPlayers.length) {
			System.out.println("game tied! all players guessed same ");
		}else {
//			if players count not equal to players the printing players name 
			for(int i=0;i<numFrmPlayers.length;i++) {
				if(result[i]==1) {
					System.out.print("player"+(i+1)+" ");
				}
			}
			System.out.println("Won the game");
		}
		
	}
	
	
	
}


public class launch {

	public static void main(String[] args) {
		Umpire u =new Umpire();
		u.collectNumber();
		u.collectNumFromPlayer();
		u.compare();
		
	}

}
