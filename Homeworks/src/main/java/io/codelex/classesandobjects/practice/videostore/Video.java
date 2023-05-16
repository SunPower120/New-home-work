package io.codelex.classesandobjects.practice.videostore;

import org.apache.commons.lang3.ArrayUtils;

public class Video {


    private String title;
    private boolean isRented;
    private double averageRating;
    private int[] ratingArray;

    public Video(String title, int averageRating, boolean isRented) {
        this.title = title;
        this.isRented = isRented;
        this.averageRating = averageRating;
    }

    public Video(String title, double averageRating) {
        this.title = title;
        this.averageRating = averageRating;
        isRented = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRented() {
        return isRented;
    }


    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int[] getRatingArray() {
        return ratingArray;
    }

    public void rentOutVideo() {
        isRented = true;
    }

    public void returnVideo() {
        isRented = false;
    }

    public void rateVideo(int rating) {
        ratingArray = ArrayUtils.add(ratingArray, rating);

        int sum = 0;
        for (int num : ratingArray) {
            sum += num;
        }

        double average = (double) sum / ratingArray.length;
        setAverageRating(average);
    }

    @Override
    public String toString() {
        return "Movie: " + title + ", Rating: " + averageRating;
    }

}
