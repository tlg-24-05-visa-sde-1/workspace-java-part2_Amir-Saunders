package com.duckrace;

import java.util.Collection;

public class DuckRacerTest {

    public static void main(String[] args) {

        DuckRacer racer1 = new DuckRacer(1,"Amir");

        racer1.win(Reward.DEBIT_CARDS);
        racer1.win(Reward.DEBIT_CARDS);
        racer1.win(Reward.PRIZES);
        racer1.win(Reward.DEBIT_CARDS);

        System.out.println(racer1);
        System.out.println(racer1.getRewards());

        Collection<Reward> rewards = racer1.getRewards();


        racer1.win(Reward.PRIZES);
        System.out.println(rewards);


    }
}
