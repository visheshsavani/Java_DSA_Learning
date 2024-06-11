import java.util.*;
abstract class Player{
   abstract int getGuess();
}
class HumanPlayer extends Player{
    int num;
    public int getGuess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num= sc.nextInt();
        return num;
    }
}
class ComputerPlayer extends Player{
    public int getGuess(){
        Random random = new Random();
        int x = random.nextInt(101);
        return x;
    }
}
public class Game{
    static int generateAns(){
        Random random = new Random();
        int y = random.nextInt(101);
        return y;
    }
    static void play(Player player1,Player player2){
        int ans=generateAns();
        int guess1=player1.getGuess();
        int guess2= player2.getGuess();
        checkAnswer(guess1,ans);
        checkAnswer(guess2,ans);
        System.out.println("The Correct Answer is "+ans);
    }
    static void checkAnswer(int guess, int answer) {
        if (guess == answer) {
            System.out.println("Correct guess!");
        } else if (guess < answer) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }
    public static void main(String[] args) {
    HumanPlayer h1 = new HumanPlayer();
        HumanPlayer h2 = new HumanPlayer();
        HumanPlayer h3 = new HumanPlayer();
        HumanPlayer h4 = new HumanPlayer();
        ComputerPlayer p1 = new ComputerPlayer();
        ComputerPlayer p4 = new ComputerPlayer();
        ComputerPlayer p3 = new ComputerPlayer();
        ComputerPlayer p2 = new ComputerPlayer();
        System.out.println("Welcome to Human guess vs Human guess game");
        play(h1,h2);
        play(h2,h3);
        System.out.println("Welcome to Human guess vs Computer guess game");
        play(h1,p2);
        System.out.println("Welcome to Computer guess vs Computer guess game");
        play(p1,p2);
        play(p3,p4);
    }
}
