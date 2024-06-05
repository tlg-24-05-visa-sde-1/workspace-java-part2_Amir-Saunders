package client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television("RCA", 10);

        System.out.println(tv1);
        System.out.println(tv2);

        tv2.changeChannel(9);
        System.out.println(tv2);
        System.out.println();

        Television tvA = new Television("Sony",50);
        Television tvB = new Television("Sony",50);

        System.out.println("tvA == tvB " + (tvA.equals(tvB)));

        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        System.out.println(tvs.size());
        System.out.println(tvA.hashCode());
        System.out.println(tvB.hashCode());


    }
}
