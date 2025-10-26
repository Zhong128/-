package Movie;

import java.util.Scanner;

public class MovieOperator {
    private Movie [] movies;

    public MovieOperator(Movie [] movies){
        this.movies = movies;
    }
    public void printAllMovies(){
        System.out.println("============全部电影信息如下==============");
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getId()+" "+movie.getName()+" "+movie.getPrice()+" "+movie.getActor());
        }

    }
    public void searchMovieById(){
        System.out.println("请输入要查询的id:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            if (id == movie.getId()){
                System.out.println(movie.getId()+" "+movie.getName()+" "+movie.getPrice()+" "+movie.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");


        }

    }

