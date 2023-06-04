package io.codelex.classesandobjects.practice.videostore;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;

public class VideoStore {
    private static Video[] videoArray = new Video[0];

    public static void addVideo(String movieTitle, double rating) {
        Video newVideo = new Video(movieTitle, rating);
        videoArray = ArrayUtils.add(videoArray, newVideo);

    }

    public static void rentVideo(String movieTitle) {

        for (Video video : videoArray) {
            if (video.isRented() && video.getTitle().equals(movieTitle)) {
                System.out.println("Sorry this movie is already rented\n");
                return;
            } else if (video.getTitle().equals(movieTitle)) {
                video.rentOutVideo();
                System.out.println("Thanks for renting from last Blockbuster in world\n");
                return;
            }
        }
        System.out.println("There is no such movie in store\n");
    }

    public static void returnVideo(String movieTitle) {
        Scanner keyboard = new Scanner(System.in);
        for (Video video : videoArray) {
            if (!video.isRented() && video.getTitle().equals(movieTitle)) {
                System.out.println("This movie was already returned, you can keep this one.\n");
                return;
            } else if (video.getTitle().equals(movieTitle)) {
                video.returnVideo();
                System.out.println("Thanks for returning movie.\nDo you want to rent another one?\nYes\\No");
                String userResponse = keyboard.next();
                if (userResponse.equals("Yes")) {
                    VideoStoreTest.rentVideo(keyboard);
                }

                return;
            }
        }
        System.out.println("There is no such movie in store\n");
    }

    public static void rateVideo(String movieTitle, int rating) {
        for (Video video : videoArray) {
            if (video.getTitle().equals(movieTitle)) {
                if (rating >= 1 && rating <= 10) {
                    video.rateVideo(rating);
                } else {
                    System.out.println("Invalid rating input.");
                }
                System.out.println("Rating updated for the movie: " + movieTitle);
                return;
            }
        }
        System.out.println("Movie not found in the store.");
    }


    public static void printMovieListAdmin() {
        System.out.printf("| %-3s | %-15s | %-7s | %-7s | %-9s |%n", "No", "Title", "Rating", "Votes", "Is rented");
        for (int i = 0; i < videoArray.length; i++) {
            System.out.printf("| %-3d | %-15s | %-7s | %-7s | %-9s |%n",
                    i + 1,
                    videoArray[i].getTitle(),
                    videoArray[i].getAverageRating(),
                    (videoArray[i].getRatingArray() == null) ? 0 : videoArray[i].getRatingArray().length,
                    videoArray[i].isRented());
        }
    }
}


