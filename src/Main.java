import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int [] ticTacIndex = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        String [] [] ticTacTable= {
                                        {"1", "|", "2", "|", "3" },
                                        {"-", "+", "-", "+", "-" },
                                        {"4", "|", "5", "|", "6" },
                                        {"-", "+", "-", "+", "-" },
                                        {"7", "|", "8", "|", "9" },
        };

        int playerMove;
        boolean win = true;

        List<Players> players = new ArrayList<>();
        players.add(Players.ONE);
        players.add(Players.TWO);
        int whoWin = 0;
        PlayersMove playersMove = new PlayersMove();
        CPU newCPU = new CPU();

        playersMove.drawTicTacHowToPlay(ticTacIndex, ticTacTable);

        System.out.println(players.get(0));
        do{
            playerMove = playersMove.getPlayerMove(ticTacIndex);
            if (playerMove == -3) { // -3 for EXIT
                break;
            }

            playersMove.changeTicTacIndex(ticTacIndex,1,playerMove);
            whoWin = playersMove.checkForWin(ticTacIndex,1);

            if (whoWin == -1) { // -1 for user WIN
                System.out.println("You Win!");
                break;
            }

            System.out.println("");

            newCPU.getCPUmove(ticTacIndex, playerMove -1);
            playersMove.drawTicTacHowToPlay(ticTacIndex,ticTacTable);

            ticTacIndex [9]++;

            whoWin = playersMove.checkForWin(ticTacIndex,2);

            if (whoWin == -2) { // -2 for CPU WIN
                System.out.println("CPU Win!");
                break;
            }

            if (ticTacIndex [9] == 4){
                System.out.println("Draw!");
                break;
            }

            for (int i = 0; i < ticTacIndex.length; i++) {
                System.out.print(ticTacIndex [i] + " : ");
            }

         }
        while (win);

        System.out.println("The End!!!");
    }

}