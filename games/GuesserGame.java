package games;

import java.util.Scanner;

public class GuesserGame {
    static String winner ="";
    static String winner1 ="";
    
    //Guessing game with Two Levels
    //Guesser Number is validated with certain Range. Any number of Players can participate.
    
	public static void main(String[] args) {
		String[] list = null;
		String[] list1 = null;
		int length = 0;
		int length1 = 0;
		int[] playersDetail;
		int[] finalPlayers;
											
		for(int j=0;j<2;j++) {
			
			if(length == 0) {
				System.out.println("Level 1 Starts Now!!!");
			    Umpire ump1 = new Umpire();
			    ump1.collectGuessNum();
			    playersDetail = ump1.collectPlayers();
			    int pCount = playersDetail.length;
			    winner = ump1.compare(playersDetail,pCount);
			    
			    if(winner != "") {
				    list = winner.split(",");
				    length = list.length;
				    System.out.println("\n*****Player " + winner + " guessed correctly in Game Level 1!*****");
			    } else{		 
				    System.out.println("\nNo one guessed correctly!");
			    }
			 }
			else if(length > 1) { 
			  System.out.println("\nLevel 2 Starts Now!!!");
			  Umpire ump2 = new Umpire();
			  ump2.collectGuessNum();
			  finalPlayers = ump2.collectPlayers(list, length);
			  winner1 = ump2.compare(finalPlayers,length);
			  
			  if(winner1 != "") {				 
				 list1 = winner1.split(",");
				 length1 = list.length;
				 System.out.println("\n*****Player " + winner1 + " guessed correctly in Game Level 2!*****");
			  } else{		 
				 System.out.println("\n*****No one guessed correctly!*****");
			  }
			}
		}
	}
}


class Guesser{
	int num;
	int guessNum;
	
	public void guessNumberInput(){
		System.out.print("\nProvide the guesser Numer :");
		Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        guessNumValidate();
	}
	
	public int guessNumValidate() {
		if(num > 0 && num<=15) {
			guessNum = num;
		}else {
			System.out.println("Entered guess Number is not in Range 1 to 15. Pls Correct it!");
			guessNumberInput();
		}
		return guessNum;
	}
        
}

class Umpire{
	int guessNum;
	int pCount;
	int []pGuessNum;
	int []pFinalistGuessNum;
	int num;
	int count =0;
	String success="";
	int finalistCount=0;
	
	public void collectGuessNum() {
		Guesser guess = new Guesser();
	    guess.guessNumberInput();
	    guessNum = guess.guessNumValidate();
	}
	
	public int[] collectPlayers() {
	    if(guessNum > 0) {		
		    Player playerGuessNum = new Player();
		    pCount = playerGuessNum.playerCount;
		    pGuessNum = playerGuessNum.players();
		    pCount = playerGuessNum.playerCount;		    		    
	    }
	    return pGuessNum;
	}
	
	public int[] collectPlayers(String[] playersList,int listCount) {
		
		finalistCount = listCount;
		if(finalistCount >0) {
		   Player finalistGuessNum = new Player();		   
		   pFinalistGuessNum =finalistGuessNum.levelfinalist(playersList, finalistCount);		   
		}
		return pFinalistGuessNum;
	}
	
	public String compare(int[] pGuessNum,int playersCount) {

		  for(int k=0;k<playersCount;k++) {
			  if(guessNum == pGuessNum[k]) {
				 count++;				
				 success = (success!="")? success + "," + (k+1) : success +(k+1);
			  }
		  }
		  return success;
	}	
}

class Player{	
	int playerCount;
	int finalistCount;
	
	public int[] players() {
		System.out.print("Enter the number of Players: ");
		Scanner sc = new Scanner(System.in);
	    playerCount = sc.nextInt();
		int playerGuessNum[] = new int[playerCount];
		
		for(int i=0;i<playerCount;i++) {
			System.out.print("Guess the Number by Player "+(i+1) + ":");
			Scanner scan = new Scanner(System.in);
			playerGuessNum[i] = scan.nextInt();			
		}
		return playerGuessNum;
	}
	
	public int[] levelfinalist(String[] playersList,int listCount) {
	    finalistCount = listCount;
		int finalistGuessNum[] = new int[finalistCount];
		
		for(int h=0;h<finalistCount;h++) {			   
			   System.out.print("Guess the Number by Player " + playersList[h] + ":");
			   Scanner scan = new Scanner(System.in);
			   finalistGuessNum[h] = scan.nextInt();
		}
		return finalistGuessNum;
	}
}
