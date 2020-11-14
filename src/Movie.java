public class Movie {
    public String nameMovie, styleMovie;
    public float ratedMovie;
    private int numMovie;
    public int timeMovie;

    public  Movie(int num){
        numMovie = num;
    }
    public int getNumMovie(){
        return numMovie;
    }
    public void setNumMovie(int num){
        numMovie = num;
    }
    public void choice(){
        System.out.println("choice movie");
    }
    public void playMovie(){
        System.out.println("play movie");
    }
    public void pauseMovie(){
        System.out.println("Pause movie.");
    }
    public void stopMovie(){
        System.out.println("Stop movie");
    }
}
