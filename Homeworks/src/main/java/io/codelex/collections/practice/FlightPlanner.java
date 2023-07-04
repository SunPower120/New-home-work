package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static List<String> flightPaths;
    private static final Map<Integer, String> listOfCities = new HashMap<>();
    private static final Map<Integer, String> destinationList = new HashMap<>();
    private static final ArrayList<String> travelPath = new ArrayList<String>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);


        flightPaths = new ArrayList<>(Files.readAllLines(path, charset));

        getListOfCities();

        firstMenu();
        
    }

    public static void getListOfCities() {
        Set<String> cleanInput = new HashSet<>();
        int counter = 1;
        for (String flightPath : flightPaths) {

            String[] cities = flightPath.split(" -> ");
            cleanInput.add(cities[0]);
            cleanInput.add(cities[1]);

        }
        for (String singleCities : cleanInput) {
            listOfCities.put(counter, singleCities);
            counter++;
        }
    }

    public static void printList(Map<Integer, String> input) {
        for (Map.Entry<Integer, String> entry : input.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void firstMenu() {

        System.out.println("""
                What would you like to do:
                To display list of the cities press 1
                To exit program press 0
                """);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> {
                printList(listOfCities);
                System.out.println("\nTo select a city from which you would like to start input according number ");
                choseFirstDestination();
            }
            case 0 -> System.out.println("Exiting program...");
            default -> System.out.println("Invalid input");
        }
    }

    public static void choseFirstDestination() {
        int counter = 1;

        System.out.println("\nChose your first destination input according number");

        int userInput = scanner.nextInt();

        for (String possibleDestinations : flightPaths) {
            if (possibleDestinations.startsWith(listOfCities.get(userInput))) {
                destinationList.put(counter, possibleDestinations);

                counter++;
            }
        }
        travelPath.add(listOfCities.get(userInput));
        printList(destinationList);
        choseNextDestination();

    }

    public static void choseNextDestination() {
        System.out.println("\nChose your next destination input according number or press 0 to end the journey");
        int userInput = scanner.nextInt();


        if (userInput == 0) {
            System.out.println("Your journey: " + String.join(" -> ", travelPath));
            System.out.println("End of journey.");
            return;
        }

        String chosenDestination = destinationList.get(userInput);
        String[] cities = chosenDestination.split(" -> ");
        String nextCity = cities[1];


        travelPath.add(nextCity);
        destinationList.clear();

        int counter = 1;
        for (String possibleDestinations : flightPaths) {
            if (possibleDestinations.startsWith(nextCity)) {
                destinationList.put(counter, possibleDestinations);
                counter++;
            }
        }

        printList(destinationList);
        choseNextDestination();
    }
}
