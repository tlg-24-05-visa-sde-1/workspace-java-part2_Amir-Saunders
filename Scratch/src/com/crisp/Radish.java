package com.crisp;

public class Radish implements Comparable<Radish>{
    /* implements comparable is used for comparing two objects and it will compare it to Radsih so comapreable would compare wto radish objects This implments a comapre to method that is at the bottom and it gives you a natural order*/

    private String color;
    private double size;
    private double tailLength;
    private int guysOnTop;


    public Radish(String color, double size,  double tailLength, int guysOnTop) {
        setColor(color);
        setSize(size);
        setGuysOnTop(guysOnTop);
        setTailLength(tailLength);
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public int getGuysOnTop() {
        return guysOnTop;
    }

    public void setGuysOnTop(int guysOnTop) {
        this.guysOnTop = guysOnTop;
    }

    @Override
    public int compareTo(Radish other) {
        return Double.compare(this.getSize(),other.getSize());
//        Size is the key that we are using for comaprison.
//        You have to do double.compare because you are comparing doubles
    }

    @Override
    public String toString() {
        return "Radish{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", tailLength=" + tailLength +
                ", guysOnTop=" + guysOnTop +
                '}';
    }


}
