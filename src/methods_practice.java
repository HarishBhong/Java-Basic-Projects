import java.util.*;
public class methods_practice {

    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter name of player: ");
        String name = n.nextLine();


        Scanner s = new Scanner(System.in);
        System.out.print("Enter score of player: ");
        int score = s.nextInt();

        int player_position = calculateHighScorePosition(score);

        calculateHighScorePosition(score);
        displayHighScorePosition(name,player_position);
        
    }   

    public static void displayHighScorePosition(String player_name, int player_position){
        System.out.println(player_name + " managed to get into position " + player_position + " on the high score list");
    }

    public static int calculateHighScorePosition(int player_score){
        if (player_score>=1000) {
            return 1;
        }
        else if (player_score<1000 && player_score>=500){
            return 2;
        }
        else if (player_score<500 && player_score>=100) {
            return 3;
        }
        return 4;
    }
}