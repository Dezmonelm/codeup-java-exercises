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
//        do {
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit\n1 - view all movies \n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category");
        System.out.println();
        System.out.println("Enter your choice: ");
        int userChoice = input.getInt();
        System.out.println(userChoice);
        if (userChoice == 1) {
            System.out.println(Arrays.toString(MoviesArray.findAll()));
        } else if(userChoice == 2) {

        }
//            Movie[] movie = new Movie[0];
//            for(Movie movies:list){
//                if(movie.getMovieCategory().EqualsIgnoreCase("drama")){
//                    searchResult = Arrays.copyOf(searchResult,searchResult.length+1);
//                    searchResult[searchResult.length-1] = movie;
//                }
//            }

//        } while ()

    }


}
