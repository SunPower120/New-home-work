package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            System.out.println("Who are using system? ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 for Admin");
            System.out.println("Choose 2 for User");


            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> adminInterface();
                case 2 -> userInterface();
                default -> {
                }
            }

        }
    }

    private static void fillVideoStore() {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = VideoStoreTest.keyboard.next();
            System.out.println("Enter rating");
            int rating = VideoStoreTest.keyboard.nextInt();
            VideoStore.addVideo(movieName, rating);
        }
    }

    public static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        VideoStore.rentVideo(movieName);
    }

    private static void returnVideo() {
        System.out.println("Enter movie name");
        String movieName = VideoStoreTest.keyboard.next();
        VideoStore.returnVideo(movieName);
    }

    private static void adminInterface() {

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 to go back");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to print movie list");
            System.out.println("Choose 3 to rate movie");


            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> {
                    return;
                }
                case 1 -> fillVideoStore();
                case 2 -> VideoStore.printMovieListAdmin();
                case 3 -> {
                    System.out.println("Enter the movie name: ");
                    String movieName = keyboard.next();
                    System.out.println("Enter the rating: ");
                    int rating = keyboard.nextInt();
                    VideoStore.rateVideo(movieName, rating);
                }
                default -> {
                }
            }
        }
    }

    private static void userInterface() {

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 to go back");
            System.out.println("Choose 1 to rent video");
            System.out.println("Choose 2 to return video");
            System.out.println("Choose 3 to print movie list");
            System.out.println("Choose 4 to rate movie");


            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> {
                    return;
                }
                case 1 -> rentVideo(keyboard);
                case 2 -> returnVideo();
                case 3 -> VideoStore.printMovieListAdmin();
                case 4 -> {
                    System.out.println("Enter the movie name: ");
                    String movieName = keyboard.next();
                    System.out.println("Enter the rating: ");
                    int rating = keyboard.nextInt();
                    VideoStore.rateVideo(movieName, rating);
                }

                default -> {
                }
            }
        }
    }

}

