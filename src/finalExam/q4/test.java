package finalExam.q4;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class test {
    public static void main(String[] args) {

        String[] str1 = {"HuangXi", "LisaZhao", "Cristina Mat"};
        List<String> actorsOfMovie1 = Arrays.asList(str1);

        String[] str2 = {"Philly Parker", "Angela Elisa", "Zhifan Wang"};
        List<String> directorOfMovie1 = Arrays.asList(str2);

        Movie movie1 = new Movie(
                "lookout",
                new GregorianCalendar(2002, Calendar.FEBRUARY, 11).getTime(),
                actorsOfMovie1,
                directorOfMovie1);


        String[] str3 = {"Alice Grand", "Kris Liu", "Allen Xing", "Ashish Ashish", "Bing Fan"};
        List<String> actorsOfMovie2 = Arrays.asList(str3);

        String[] str4 = {"Carl Lil", "April Alexander", "Luck Hu"};

        List<String> directorOfMovie2 = Arrays.asList(str4);
        Movie movie2 = new Movie(
                "Seeing you",
                new GregorianCalendar(2021, Calendar.JANUARY, 25).getTime(),
                actorsOfMovie2,
                directorOfMovie2);


        String[] str5 = {"Lina Tikael", "Jack Chen", "Angel Xiu", "Ellen Wu", "TongXi Fan"};
        List<String> actorsOfMovie3 = Arrays.asList(str5);

        String[] str6 = {"Jay Chou", "An Li"};
        List<String> directorOfMovie3 = Arrays.asList(str6);

        Movie movie3 = new Movie(
                "Me kill me",
                new GregorianCalendar(1983, Calendar.MARCH, 3).getTime(),
                actorsOfMovie3,
                directorOfMovie3);


        String[] str7 = {"Tia Andrale", "Jacky Chen", "Angela Sia", "Sliexuro Koow", "Nina Li"};
        List<String> actorsOfMovie4 = Arrays.asList(str5);

        String[] str8 = {"Haobi Peng", "Kelsey Yi"};
        List<String> directorOfMovie4 = Arrays.asList(str6);

        Movie movie4 = new Movie(
                "Matrix",
                new GregorianCalendar(1999, Calendar.DECEMBER, 11).getTime(),
                actorsOfMovie4,
                directorOfMovie4);


        List<Movie> genre1 = new ArrayList<>();
        genre1.add(movie1);
        genre1.add(movie2);
        genre1.add(movie3);
        genre1.add(movie4);
        Genre loveMovies = new Genre(genre1);

        List<Movie> genre2 = new ArrayList<>();
        genre2.add(movie3);
        genre2.add(movie4);
        Genre thrillMovie = new Genre(genre2);

        Date date2000 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date date1990 = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        List<Genre> finalList = new ArrayList<>();
        finalList.add(loveMovies);

        Netflix netflix = new Netflix(finalList);

        //For all movies released before 2000, add the string "(Classic)" to the title of the movie using flatMap.
        System.out.println("get all movies released before 2000");
        netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getReleaseDate().before(date2000))
                .map(movie -> {
                    String name = movie.getTitle();
                    movie.setTitle("classical" + name);
                    return movie;
                }).forEach(System.out::println);
        System.out.println("****************************************************");

        //Get the latest 3 movies released using .limit() method of stream.
        System.out.println("System.out.println(Get the latest 3 movies released using .limit()");
        genre1.stream()
                .limit(3)
                .forEach(m -> System.out.println(m.getTitle()));

        // Create a predicate for release date before 2000 and a predicate for release date before 1990
        //and then Chain the predicates for finding movies between 1990 and 2000.
        Predicate<Movie> p1 = movie -> movie.getReleaseDate().before(date2000);
        Predicate<Movie> p2 = movie -> movie.getReleaseDate().after(date1990);

        genre1.stream()
                .filter(p1.and(p2))
                .forEach(movie -> System.out.println(movie.getTitle() + " " + movie.getReleaseDate()));
        System.out.println("****************************************************");



        // Write a method which that will add release year in the title of the movie and return the title and
        //then use this method for all the movies.

        Function<Movie, String> func = (m1) -> {
            String preTitle = m1.getTitle();
            return m1.getReleaseDate().toString() + m1.getTitle();
        };

        genre2.stream()
                .map(movie -> {
                    String preName = movie.getTitle();
                    movie.setTitle(movie.getReleaseDate().toString() + preName);
                    return movie;
                })
                .forEach(System.out::println);


       // Sorting on one of the feature(Ex: Released year or title) which will use comparator.

        genre1.sort((m1, m2) ->{
            return m1.getTitle().compareTo(m2.getTitle());
        });
    }
}
