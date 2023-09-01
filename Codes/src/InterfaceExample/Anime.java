package InterfaceExample;

public class Anime {
    private String name;
    private String mangaAdapt;
    private String favouriteChar;
    private String genre;
    private int seasons;
    private int episodes;
    private double ratings;

    public Anime(String name, String mangaAdapt, String favouriteChar, String genre, int seasons, int episodes, double ratings ){
        this.name=name;
        this.mangaAdapt=mangaAdapt;
        this.favouriteChar=favouriteChar;
        this.genre=genre;
        this.seasons=seasons;
        this.episodes=episodes;
        this.ratings=ratings;
    }

    public String getName() {
        return name;
    }

    public String getMangaAdapt() {
        return mangaAdapt;
    }

    public String getFavouriteChar() {
        return favouriteChar;
    }

    public String getGenre() {
        return genre;
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public double getRatings() {
        return ratings;
    }
}

