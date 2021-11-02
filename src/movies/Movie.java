package movies;

import java.util.Properties;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovieName() {
        return this.name;
    }

    public String getMovieCategory() {
        return this.category;
    }


}


// get back a category
//Movie[] searchResult new Movie[0];
//for(Movie movie:library){
//        if(movie.getMovieCategory().EqualsIgnoreCase("drama")){
//        searchResult = Arrays.copyOf(searchResult,searchResult.length+1);
//        searchResult[searchResult.length-1] = movie;
//        }
//        }