package io.codelex.classesandobjects.practice.Exercise4;

public class FilterMovies {

    public static void main(String[] args) {

        Movie[] movies = createMovies(
                new Movie("Casino Royale", "Eon Productions", "PG-13"),
                new Movie("Glass", "Buena Vista International", "PG"),
                new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures")
        );

        Movie[] pgMovies = Movie.getPG(movies);

        System.out.println("PG-rated movies:");
        for (Movie movie : pgMovies) {
            System.out.println(movie.toString());
        }

    }

    private static Movie[] createMovies(Movie... movies) {
        return movies;
    }
}


