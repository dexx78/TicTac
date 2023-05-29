import java.util.Scanner;

public class PlayersMove {

    //int [] ticTacIndex = {0, 0, 0, 0, 0, 0, 0, 0, 0, 3};
    public static int getPlayerMove(int[] ticTacIndex) {
        boolean correctInput = false;
        int playerMove = 0;
        Scanner playerInput = new Scanner(System.in);
        while (!correctInput) {
            System.out.println();

            System.out.print("Make Your Choice 1-9 or EXIT game (e): ");
            String player = playerInput.next();
            if (player.equalsIgnoreCase("e")) {
                return -3;
            }
            player = player.replaceAll("\\D+", "");
            playerMove = Integer.parseInt(player.equals("") ? "-1" : player);

            if (playerMove > 0)
                if (playerMove < 10)
                    if (ticTacIndex[playerMove - 1] == 0) {
                        System.out.println("You choose place no.: " + playerMove);
                        correctInput = true;
                    } else {
                        System.out.println("Incorrect input, out of range 1-9: " + playerMove);
                    }

        }
        return playerMove;
    }

    public static String[][] drawTicTacHowToPlay(int[] ticTacIndex, String[][] ticTacTable) {
        int row;
        int column;
        for (int x = 0; x < ticTacIndex.length; x++) {
            switch (x){
                case 0:
                    row = 0;
                    column = 0;
                    convertIndexToBoard(ticTacIndex, ticTacTable, x, row, column);
                    break;

                case 1:
                    row = 0;
                    column = 2;
                    convertIndexToBoard(ticTacIndex, ticTacTable, x, row, column);
                    break;

                case 2:
                    row = 0;
                    column = 4;
                    convertIndexToBoard(ticTacIndex, ticTacTable, x, row, column);
                    break;

                case 3:
                    row = 2;
                    column = 0;
                    convertIndexToBoard(ticTacIndex, ticTacTable, x, row, column);
                    break;

                case 4:
                    row = 2;
                    column = 2;
                    convertIndexToBoard(ticTacIndex, ticTacTable, x, row, column);
                    break;

                case 5:
                    row = 2;
                    column = 4;
                    convertIndexToBoard(ticTacIndex, ticTacTable, x, row, column);
                    break;

                case 6:
                    row = 4;
                    column = 0;
                    convertIndexToBoard(ticTacIndex, ticTacTable, x, row, column);
                    break;

                case 7:
                    row = 4;
                    column = 2;
                    convertIndexToBoard(ticTacIndex, ticTacTable, x, row, column);
                    break;

                case 8:
                    row = 4;
                    column = 4;
                    convertIndexToBoard(ticTacIndex, ticTacTable, x, row, column);
                    break;
            }

        }
        for (int x = 0; x < ticTacTable.length; x++) {
            for (int y = 0; y < ticTacTable[x].length; y++) {
                System.out.print(ticTacTable[x][y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Tic Tac Toe Rulez!");
        return ticTacTable;
    }

    private static String [] [] convertIndexToBoard(int[] ticTacIndex, String[][] ticTacTable, int x, int row, int column) {
        if (ticTacIndex[x] !=0){
            if (ticTacIndex[x] == 1){
                ticTacTable[row] [column] = "O";
            }
            else {
                ticTacTable[row] [column] = "X";
            }
        }
        return ticTacTable;
    }

    public static int [] changeTicTacIndex (int ticTacIndex [], int player, int move ){
        if (player == 1){
            ticTacIndex [move-1] = 1;
        }
        else {
            ticTacIndex [move-1] = 2;
        }

        return ticTacIndex;
    }

    public static int checkForWin(int[] ticTacIndex, int playerID) {

        if (ticTacIndex[0] == playerID)
            if (ticTacIndex[1] == playerID)
                if (ticTacIndex[2] == playerID) {
                    return -playerID;
                }

        if (ticTacIndex[3] == playerID)
            if (ticTacIndex[4] == playerID)
                if (ticTacIndex[5] == playerID) {
                    return -playerID;
                }

        if (ticTacIndex[6] == playerID)
            if (ticTacIndex[7] == playerID)
                if (ticTacIndex[8] == playerID) {
                    return -playerID;
                }

        if (ticTacIndex[0] == playerID)
            if (ticTacIndex[3] == playerID)
                if (ticTacIndex[6] == playerID) {
                    return -playerID;
                }

        if (ticTacIndex[1] == playerID)
            if (ticTacIndex[4] == playerID)
                if (ticTacIndex[7] == playerID) {
                    return -playerID;
                }

        if (ticTacIndex[2] == playerID)
            if (ticTacIndex[5] == playerID)
                if (ticTacIndex[8] == playerID) {
                    return -playerID;
                }

        if (ticTacIndex[0] == playerID)
            if (ticTacIndex[4] == playerID)
                if (ticTacIndex[8] == playerID) {
                    return -playerID;
                }

        if (ticTacIndex[2] == playerID)
            if (ticTacIndex[4] == playerID)
                if (ticTacIndex[6] == playerID) {
                    return -playerID;
                }

        return 0;
    }

}
