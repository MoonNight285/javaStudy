package ch4;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static int[] createLotto() {
        int lotto[] = new int[6];
        Random random = new Random();

        for (int i = 0; i < lotto.length; i++) {
            int number = random.nextInt(45) + 1;
            lotto[i] = number;
        }

        Arrays.sort(lotto);

        return lotto;
    }

    public static int[] createDistinctLotto() {
        int lotto[] = new int[6];
        Random random = new Random();
        int numberCount = 0;

        while(true) {
            int number = random.nextInt(45) + 1;

            boolean flag = false;
            for (int j = 0; j < numberCount; j++) {
                if(lotto[j] == number) {
                    flag = true;
                    break;
                }
            }

            if(flag == false) {
                lotto[numberCount++] = number;
            }

            if(numberCount == 6) {
                break;
            }
        }

        Arrays.sort(lotto);

        return lotto;
    }
}
