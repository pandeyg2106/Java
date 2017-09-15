package chapter8;
import java.util.Scanner;

public class Question9 {

	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] token=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				token[i][j]=-1;
		}
		playTicTacToe(token);
	}
	// To trigger the play and stop it once a player wins or the game is a draw
	public static void playTicTacToe(int[][] token){
		Scanner  input =new Scanner(System.in);
		char player='X';
		do{
			System.out.println("Enter a row (0,1,2) for player "+player);
			int i=input.nextInt();
			System.out.println("Enter a col (0,1,2) for player "+player);
			int j=input.nextInt();
			if(token[i][j]==-1){
				token[i][j]=(player=='X')?0:1;
				player=player=='O'?'X':'O';}
			else
				System.out.println("Choice already played before. Play again");
		}while(!getResult(token,player));}

	//To display the result and return the status of the move
	public static boolean getResult(int[][] token,char player){
		for (int i=0;i<3;i++){
			System.out.println("_____________");
			for(int j=0;j<3;j++){
				if(token[i][j]==0||token[i][j]==1)
					System.out.print(token[i][j]==0?"| X ":"| O ");
				else
					System.out.print("|   ");
			}
			System.out.println("|");
		}
		System.out.println("_____________");
		return isWinner(token,player);
	}

	//To check the status after current move
	public static boolean isWinner(int[][] token,char player){
		if(matchDia(token)||matchHor(token)||matchVer(token)){
			System.out.println(player+" player won.");
			return true;
		}else if(!(contains(token))){
			System.out.println("This game is a Draw");
			return true;
		}else
			return false;

	}
	// check for left and right diagonal (Match)
	public static boolean matchDia(int[][] token){			
		if(token[1][1]!=-1){
			if((token[0][0]==token[1][1]&&token[1][1]==token[2][2])||(token[2][0]==token[1][1]&&token[1][1]==token[2][0]))
				return true;
			else
				return false;}
		return false;
	}

	// check for matching horizontal rows
	public static boolean matchHor(int[][] token){			
		if((token[0][0]==token[0][1]&&token[0][0]==token[0][2]&&token[0][0]!=-1)||(token[1][0]==token[1][1]&&token[1][1]==token[1][2]&&token[1][1]!=-1)||(token[2][0]==token[2][1]&&token[2][1]==token[2][2]&&token[2][2]!=-1))
			return true;
		else
			return false;
	}

	// check for matching vertical columns
	public static boolean matchVer(int[][] token){

		if((token[0][0]==token[1][0]&&token[0][0]==token[2][0]&&token[0][0]!=-1)||(token[0][1]==token[1][1]&&token[1][1]==token[2][1]&&token[0][1]!=-1)||(token[0][2]==token[1][2]&&token[1][2]==token[2][2]&&token[2][2]!=-1))
			return true;
		else
			return false;
	}

	// to check if it there is still place to fill tokens
	public static boolean contains(int[][] token){	
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				if(token[i][j]==-1)
					return true;
		}
		return false;
	}

}

