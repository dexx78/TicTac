import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.List;
public class CPU {

    public static int [] getCPUmove(int [] ticTacIndex, int playerMove) {

        int getRandom = 0;
        Random random = new Random();

        List<Integer> lineState = new ArrayList<>();


        if (ticTacIndex [9] == 0){
            if (ticTacIndex [4] == 0){
                ticTacIndex [4] = 2;
            }
            if (ticTacIndex [4] == 1){
                getRandom = random.nextInt(3);
                switch (getRandom){
                    case 0:{
                        if (ticTacIndex [0] == 0){
                            ticTacIndex [0] = 2;
                        }
                        break;
                    }

                    case 1:{
                        if (ticTacIndex [2] == 0){
                            ticTacIndex [2] = 2;
                        }
                        break;
                    }

                    case 2:{
                        if (ticTacIndex [6] == 0){
                            ticTacIndex [6] = 2;
                        }
                        break;
                    }

                    case 3:{
                        if (ticTacIndex [8] == 0){
                            ticTacIndex [8] = 2;
                        }
                        break;
                    }
                }

            }
        }

        if (ticTacIndex [9] > 0){
            switch (playerMove){
                case 0:{
                    if (ticTacIndex [4] == 1) {
                        ticTacIndex[8] = 2;
                        break;
                    }
                    else{
                        if (ticTacIndex [1] == 0) {
                            ticTacIndex[1] = 2;
                            break;
                        }
                        if (ticTacIndex [2] == 0) {
                            ticTacIndex[2] = 2;
                            break;
                        }
                        if (ticTacIndex [3] == 0) {
                            ticTacIndex[3] = 2;
                            break;
                        }
                        if (ticTacIndex [6] == 0) {
                            ticTacIndex[6] = 2;
                            break;
                        }
                    }
                    break;
                }
                case 1:{
                    if (ticTacIndex [4] == 1) {
                        ticTacIndex[7] = 2;
                        break;
                    }
                    else{
                        if (ticTacIndex [0] == 0) {
                            ticTacIndex[0] = 2;
                            break;
                        }
                        if (ticTacIndex [2] == 0) {
                            ticTacIndex[2] = 2;
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    if (ticTacIndex [4] == 1){
                        ticTacIndex [6] = 2;
                        break;
                    }
                    else{
                        if (ticTacIndex [0] == 0) {
                            ticTacIndex[0] = 2;
                            break;
                        }
                        if (ticTacIndex [1] == 0) {
                            ticTacIndex[1] = 2;
                            break;
                        }
                        if (ticTacIndex [5] == 0) {
                            ticTacIndex[5] = 2;
                            break;
                        }
                        if (ticTacIndex [8] == 0) {
                            ticTacIndex[8] = 2;
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    if (ticTacIndex[4] == 1) {
                        ticTacIndex[5] = 2;
                        break;
                    }
                    else{
                        if (ticTacIndex [0] == 0) {
                            ticTacIndex[0] = 2;
                            break;
                        }
                        if (ticTacIndex [6] == 0) {
                            ticTacIndex[6] = 2;
                            break;
                        }
                    }
                    break;
                }
                //case 4: {
                //    break;
                //}
                case 5: {
                    if (ticTacIndex[4] == 1) {
                        ticTacIndex[3] = 2;
                        break;
                    }
                    else{
                        if (ticTacIndex [2] == 0) {
                            ticTacIndex[2] = 2;
                            break;
                        }
                        if (ticTacIndex [8] == 0) {
                            ticTacIndex[8] = 2;
                            break;
                        }
                    }
                    break;
                }
                case 6: {
                    if (ticTacIndex[4] == 1) {
                        ticTacIndex[2] = 2;
                        break;
                    }
                    else{
                        if (ticTacIndex [0] == 0) {
                            ticTacIndex[0] = 2;
                            break;
                        }
                        if (ticTacIndex [3] == 0) {
                            ticTacIndex[3] = 2;
                            break;
                        }
                        if (ticTacIndex [7] == 0) {
                            ticTacIndex[7] = 2;
                            break;
                        }
                        if (ticTacIndex [8] == 0) {
                            ticTacIndex[8] = 2;
                            break;
                        }
                    }
                    break;
                }
                case 7: {
                    if (ticTacIndex[4] == 1) {
                        ticTacIndex[1] = 2;
                        break;
                    }
                    else{
                        if (ticTacIndex [6] == 0) {
                            ticTacIndex[6] = 2;
                            break;
                        }
                        if (ticTacIndex [8] == 0) {
                            ticTacIndex[8] = 2;
                            break;
                        }
                    }
                    break;
                }
                case 8: {
                    if (ticTacIndex[4] == 1) {
                        ticTacIndex[0] = 2;
                        break;
                    }
                    else{
                        if (ticTacIndex [2] == 0) {
                            ticTacIndex[2] = 2;
                            break;
                        }
                        if (ticTacIndex [5] == 0) {
                            ticTacIndex[5] = 2;
                            break;
                        }
                        if (ticTacIndex [6] == 0) {
                            ticTacIndex[6] = 2;
                            break;
                        }
                        if (ticTacIndex [7] == 0) {
                            ticTacIndex[7] = 2;
                            break;
                        }
                    }
                    break;
                }
            }
        }


        System.out.println("ha ha I'm thinking...");
        return ticTacIndex;
    }
}
