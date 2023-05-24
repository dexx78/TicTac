import java.util.Random;
public class CPU {

    public static int [] getCPUmove(int [] ticTacIndex) {

        int getRandom = 0;
        Random random = new Random();

        if (ticTacIndex [4] == 0){
            ticTacIndex [4] = 2;

        }

        if (ticTacIndex [4] == 1){
            getRandom = random.nextInt(3);
            switch (getRandom){
                case 0:{
                    if (ticTacIndex [0] == 0){
                        ticTacIndex [0] = 2;}
                    break;
                    }

                case 1:{
                    if (ticTacIndex [2] == 0){
                        ticTacIndex [2] = 2;}
                    break;
                }

                case 2:{
                    if (ticTacIndex [6] == 0){
                        ticTacIndex [6] = 2;}
                    break;
                }

                case 3:{
                    if (ticTacIndex [8] == 0){
                        ticTacIndex [8] = 2;}
                    break;
                }
            }

        }
        System.out.println("ha ha I'm thinking...");
        return ticTacIndex;
    }
}
