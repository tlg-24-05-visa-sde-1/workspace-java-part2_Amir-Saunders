package com.entertainment;

import java.util.Objects;

public class Television implements Comparable<Television>{

    private String brand;
    private int volume;

    private final Tuner tuner = new Tuner();
//    You can instatiate a class inside anither object


    public Television(){

    }

    public Television(String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    public int getCurrentChannel(){
        return tuner.getChannel();
    }

    public void changeChannel(int channel){
        tuner.setChannel(channel);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public  int hashCode (){

//        return getBrand().length() + getVolume();
        return Objects.hash(getBrand(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println();
        boolean result = false;

//        if(obj instanceof Television){
//        Is-A check above
        if (this.getClass() == obj.getClass()) {

            Television other = (Television) obj;

//            result = this.getBrand().equals(other.getBrand()) &&
//                    this.getVolume() == other.getVolume();

        result = Objects.equals(this.getBrand(), other.getBrand()) &&
                this.getVolume() == other.getVolume();
        }
        return result;
    }


    @Override
    public int compareTo(Television other) {
//        return this.getBrand().compareTo(other.getBrand());
        int result = this.getBrand().compareTo(other.getBrand());
        if(result == 0){
            result = Integer.compare(this.getVolume(), other.getVolume());
        }
        return result;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + getBrand() + '\'' +
                ", volume=" + getVolume() +
                ", channel=" + getCurrentChannel() +
                '}';
    }
}
