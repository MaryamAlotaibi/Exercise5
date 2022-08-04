import java.util.Random;
import java.util.Scanner;

public class gamePlayer {
    public static final String Rock="Rock";
    public static final String Paper="Paper";
    public static final String Scissors="scissors";

public static void main( String [] args){
    System.out.println("Enter of any one");
    System.out.println("Rock");
    System.out.println("Paper");
    System.out.println("Scissors");
    System.out.println();
    String playerMove = getPlayerMove();
    String computerMove = getComputerMove();

    if(playerMove.equals(computerMove))
        System.out.println("Game is:\n");
    else if(playerMove.equals(gamePlayer.Rock))
        System.out.println(computerMove.equals());


}

public static String getComputerMove(){
    String computermove;
    Random random = new Random();
    int input = random.nextInt(3)+1;
    if(input==1)
        computermove=gamePlayer.Rock;
    else if(input==2)
        computermove=gamePlayer.Paper;
    else
        computermove=gamePlayer.Scissors;
    System.out.println("computer move is:" + computermove);
    System.out.println();
    return computermove;
}
public static String getPlayerMove(){
    Scanner in = new Scanner(System.in);
    String input =in.next();
    String playermove = input.toUpperCase();
    System.out.println("Player move is:" + playermove);
    return playermove;
}

}