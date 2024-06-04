package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DuckRacer {

    private final int id;
    private String name;
    private int wins;
    private Collection<Reward>rewards = new ArrayList<>();


    public DuckRacer(int id, String name) {
        this.id = id;
        setName(name);
    }


    public void win(Reward reward){
        rewards.add(reward);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return rewards.size();
    }

    public Collection<Reward>getRewards(){
        return Collections.unmodifiableCollection(rewards);
       /* We do an unmodifiable collection so you cant add rewards on the client side. Now you can't add rewards to the rewards collection*/
    }

    @Override
    public String toString(){
        return String.format("%s: id=%s , name=%s, wins=%s, rewards=%s",getClass().getSimpleName(),getId(),getName(),getWins(),getRewards());
    }
}
