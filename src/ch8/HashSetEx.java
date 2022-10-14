package ch8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("mybatis");

        int size = set.size();
        System.out.println("HashSet에 저장된 수 : " + size);

        // iterator를 사용하면 장점 => 리스트, 배열, set, map같은 컬렉션중 어떤걸 사용하더라도 iterator를 이용해 데이터를 가져오는것은 동일함.
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("mybatis");

        System.out.println("HashSet에 저장된 수 : " + set.size());

        iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if(set.isEmpty()) {
            System.out.println("HashSet이 비어있음");
        }

        System.out.println("\n");
        Set<Member> set2 = new HashSet<>();

        set2.add(new Member("홍길동", 30));
        set2.add(new Member("홍길동", 30));

        System.out.println("총 객체 수 : " + set2.size());
    }
}
