import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        int [] ticTacIndex = {0, 0, 0, 0, 0, 0, 0, 0, 0, 3};

        String [] [] ticTacHowToPlay= {
                                        {"1", "|", "2", "|", "3" },
                                        {"-", "+", "-", "+", "-" },
                                        {"4", "|", "5", "|", "6" },
                                        {"-", "+", "-", "+", "-" },
                                        {"7", "|", "8", "|", "9" },
        };

        int playerMove;
        int cpuMove;
        int howManyShotsLeft;
        boolean win = true;

        List<Players> players = new ArrayList<>();
        players.add(Players.ONE);
        players.add(Players.TWO);
        int index = 0;
        PlayersMove playersMove = new PlayersMove();
        CPU newCPU = new CPU();

        playersMove.drawTicTacHowToPlay(ticTacIndex, ticTacHowToPlay);

        System.out.println(players.get(0));
        do{
            playerMove = playersMove.getPlayerMove(ticTacIndex);
            if (playerMove == -3) { // -3 for EXIT
                break;
            }

            playersMove.changeTicTacIndex(ticTacIndex,1,playerMove);
            ticTacHowToPlay = playersMove.drawTicTacHowToPlay(ticTacIndex,ticTacHowToPlay);
            playerMove = playersMove.checkForWin(ticTacIndex,1);

            if (playerMove == -1) { // -1 for user WIN
                System.out.println("You Win!");
                break;
            }

            if (playerMove == -2) { // -2 for CPU WIN
                System.out.println("CPU Win!");
                break;
            }

            for (int i = 0; i < ticTacIndex.length; i++) {
                System.out.print(ticTacIndex [i] + " : ");
            }

            System.out.println("");

            CPU.getCPUmove(ticTacIndex);
            playersMove.drawTicTacHowToPlay(ticTacIndex,ticTacHowToPlay);
            //newCPU.getCPUmove(ticTacIndex); // ? to ci zagadka...

            //System.out.println("Class Players presents: ");
            //PlayersMove.drawTicTacHowToPlay(ticTacIndex, ticTacHowToPlay);
            //check if there is blank shot
            howManyShotsLeft = 0;
        }
        while (win);

        System.out.println("The End!!!");



    }



    private static int getCpuChoose(int[] ticTacIndex) {
        int cpuMove;
        int i=0;
        boolean saver = false;
        cpuMove = (int)(Math.random() * 9);
        System.out.println("1 CPU saver: " + i + " : " + saver + " : " + "cpuMove: " + cpuMove);
        if (ticTacIndex[cpuMove] != 0) {
//            System.out.println("2 CPU saver: " + i + " : " + saver + " : " + "cpuMove: " + cpuMove);
            while (saver) {
                cpuMove = (int)(Math.random() * 9);
                System.out.println("CPU: " + cpuMove);
                if (ticTacIndex[cpuMove] == 0) saver = true;
//                for (int c = 0; c < ticTacIndex.length; c++) if (ticTacIndex [c] == 0) howManyShotsLeft++;
//                if (howManyShotsLeft == 0) saver = true;

            }
        }
        System.out.println("3 CPU saver: " + i + " : " + saver + " : " + "cpuMove: " + cpuMove);
//        System.out.println("CPU generate: " + cpuMove);
        return cpuMove;
        }
}