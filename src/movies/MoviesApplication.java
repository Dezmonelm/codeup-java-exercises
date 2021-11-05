package movies;

import movies.Movie;
import movies.MoviesArray;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] list = MoviesArray.findAll();
        for (Movie movie : list) {
            System.out.println(movie.getMovieName());
        }

        Input input = new Input();
        boolean confirm;
        do {
//        public static void movieApp() {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("0 - exit\n1 - view all movies \n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category");
            System.out.println();
            System.out.println("Enter your choice: ");
            int userChoice = input.getInt();
            System.out.println(userChoice);
            if (userChoice == 1) {
                for (Movie movie : list) {
                    System.out.println(movie.getMovieName());
                }
            } else if (userChoice == 2) {
                Movie[] searchResult = new Movie[0];
                for (Movie movie : list) {
                    if (movie.getMovieCategory().equalsIgnoreCase("animated")) {
                        searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                        searchResult[searchResult.length - 1] = movie;
                        System.out.println(movie.getMovieName() + " - " + movie.getMovieCategory());
                    }
                }
            } else if (userChoice == 3) {
                Movie[] searchResult = new Movie[0];
                for (Movie movie : list) {
                    if (movie.getMovieCategory().equalsIgnoreCase("drama")) {
                        searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                        searchResult[searchResult.length - 1] = movie;
                        System.out.println(movie.getMovieName() + " - " + movie.getMovieCategory());
                    }
                }
            } else if (userChoice == 4) {
                Movie[] searchResult = new Movie[0];
                for (Movie movie : list) {
                    if (movie.getMovieCategory().equalsIgnoreCase("horror")) {
                        searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                        searchResult[searchResult.length - 1] = movie;
                        System.out.println(movie.getMovieName() + " - " + movie.getMovieCategory());
                    }
                }
            } else if (userChoice == 5) {
                Movie[] searchResult = new Movie[0];
                for (Movie movie : list) {
                    if (movie.getMovieCategory().equalsIgnoreCase("scifi")) {
                        searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                        searchResult[searchResult.length - 1] = movie;
                        System.out.println(movie.getMovieName() + " - " + movie.getMovieCategory());
                    }
                }
            } else if (userChoice == 0) {
                System.out.println("Thank you for your input! TTYL!!");
                break;
            } else {
                System.out.println("That was fun!");
            }
//        }
            System.out.println("You still tryna Netflix n' chill or nah? (y/n)");
            confirm = input.getString().equalsIgnoreCase("y");
        } while (confirm);

    }


}
