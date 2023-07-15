package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private int height;
    private final int width;
    private final int numOfCopies;
    private final int costPerCopy;


    public Poster(int fee, int height, int width, int numOfCopies, int costPerCopy) {
        super(fee);
        this.height = height;
        this.width = width;
        this.numOfCopies = numOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int cost() {
        return fee + numOfCopies * costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: " +
                "Height=" + height +
                ", Width=" + width +
                ", Number of copies=" + numOfCopies +
                ", Cost per copy=" + costPerCopy;
    }
}
