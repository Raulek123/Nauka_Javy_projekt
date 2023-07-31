package Kolekcje.SprytneSortowanie;


import java.util.*;

public class MovieDatabase {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Movie> moviesList = createMoviesList();
        Comparator<Movie> sortAlgorithm = getSortAlgorithm();
//        moviesList(sortAlgorithm);
        moviesList.sort(sortAlgorithm);
        print(moviesList);

    }

    private static List<Movie> createMoviesList() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Jumanji", "Johnston Joe", 1995, 6.8));
        movies.add(new Movie("The Shawshank Redemption", "Johnston Joe", 1994, 8.75));
        movies.add(new Movie("The Green Mile", "Darabont Frank", 1999, 8.61));
        movies.add(new Movie("Spider Man", "Raimi Sam", 2002, 6.7));
        movies.add(new Movie("Transformers", "Bay Michael", 2007, 7.3));
        movies.add(new Movie("Alien", "Scott Ridley", 1979, 7.8));
        movies.add(new Movie("Home Alone", "Columbus Chris", 1979, 7.1));
        return movies;
    }

    private static Comparator<Movie> getSortAlgorithm() {
        SortOption sortOption = null;
        getSortOption();
        String option = sc.nextLine();
        for (SortOption displayName : SortOption.values()) {
            if(displayName.getDescription().equalsIgnoreCase(option)){
                 sortOption = displayName;
            }
        }
        switch (sortOption){
            case TITLE:
                return Comparator.comparing(Movie::getTitle);
            case RATING:
                return Comparator.comparing(Movie::getRating);
            case YEAR:
                return Comparator.comparing(Movie::getYear).reversed();
            default:
               throw new IllegalArgumentException();
        }
    }

    private static void print(List<Movie> movies) {
        System.out.println("Lista filmów:");
        movies.forEach(System.out::println);
    }

    private static void getSortOption() {
        System.out.println("Wybierz kryterium sortowania:");
        System.out.println("    >Title");
        System.out.println("    >Rating");
        System.out.println("    >Year");
    }
}