package Movie;

public class Test {
    public static void main(String[] args) {
        Movie [] movies = new Movie[6];
        movies[0] = new Movie(1,"唐顿庄园",19.9,"罗宾");
        movies[1] = new Movie(2,"速度与激情7",39.9,"Hank");
        movies[2] = new Movie(3,"谋杀2",19.9,"张颂文");
        movies[3] = new Movie(4,"唐顿庄园",19.9,"罗宾");
        movies[4] = new Movie(5,"唐顿庄园",19.9,"罗宾");
        movies[5] = new Movie(6,"唐顿庄园",19.9,"罗宾");

        MovieOperator operator = new MovieOperator(movies);
        operator.printAllMovies();
        operator.searchMovieById();



    }
}
