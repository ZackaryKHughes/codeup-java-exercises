package movies;

import util.Input;

public class MoviesApplication {
    private static String getMovies(Movie[] movies, String category) {
        String movieList = "";
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category)) {
                movieList = String.format("%s%s - %s%n", movieList, movie.getName(), movie.getCategory());
            }
        }
        return movieList;
    }

    private static String getMovies(Movie[] movies) {
        String movieList = "";
        for (Movie movie : movies) {
            movieList = String.format("%s%s - %s%n", movieList, movie.getName(), movie.getCategory());
        }
        return movieList;
    }

    private static void runApp() {
        Movie[] movies = MoviesArray.findAll();
        System.out.println("Welcome to Movie Plex Industries!\n\n" +
                "What would you like to do?\n\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        Input in = new Input();
        System.out.println("Please enter your selection");
        int userChoice = in.getInt(0, 5);
        switch (userChoice) {
            case 0:
                System.out.println("Farewell! Thank you for using Movie Plex Industries!");
                break;
            case 1:
                System.out.println(getMovies(movies));
                runApp();
                break;
            case 2:
                System.out.println(getMovies(movies, "animated"));
                runApp();
                break;
            case 3:
                System.out.println(getMovies(movies, "drama"));
                runApp();
                break;
            case 4:
                System.out.println(getMovies(movies, "horror"));
                runApp();
                break;
            case 5:
                System.out.println(getMovies(movies, "scifi"));
                runApp();
                break;
        }

    }

    public static void main(String[] args) {
        runApp();
    }
}
