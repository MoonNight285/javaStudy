package ch8;

import java.util.*;

public class HashSetEx_Sol1 {
    public static void main(String[] args) {
        // 문제 1 - HashSet을 사용하여 로또 번호 7개를 생성하는 프로그램을 작성하세요.
        Set<Integer> lotto = new HashSet<>();

        while(lotto.size() < 7) {
            Random random = new Random(System.currentTimeMillis());
            lotto.add(random.nextInt(45) + 1);
        }

        LinkedList<Integer> sortedLotto = new LinkedList<>(lotto);
        Collections.sort(sortedLotto);

        Iterator<Integer> iterator = sortedLotto.iterator();
        System.out.print("생성된 번호 : ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
