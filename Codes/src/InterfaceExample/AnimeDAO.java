package InterfaceExample;


import java.util.ArrayList;
import java.util.Comparator;

public class AnimeDAO extends AnimeGenre implements Manga,Characters {

    static ArrayList<Anime> animeData= new ArrayList<>();
    @Override
    public Boolean mangaType(Anime anime) {
        if(anime.getMangaAdapt()!=null){
            return true;
        }
        return false;
    }
    public Anime famousGenre(ArrayList<Anime> ane){

        Anime anime = ane
                .stream()
                .max(Comparator.comparing(Anime::getRatings)).get();
        return anime;
    }

    @Override
    public String findGenre(Anime anime) {
        return anime.getGenre();
    }

    @Override
    public void print(String s) {
        System.out.println(s);
    }


    @Override
    public String characterNamess(Anime anime) {
        return anime.getFavouriteChar();
    }

    public static void populate(){
        animeData.add(new Anime("Jujutsu Kaisen","Jujutsu Kaisen","Gojo Satoru","Fantasy",2,25,5.0));
        animeData.add(new Anime("Naruto",null,"Naruto","Action",2,700,4.0));
        animeData.add(new Anime("Yona of Dawn","Akatsuki no yona","Hak","Fantasy",1,25,4.5));
        animeData.add(new Anime("Horimiya",null,"Miyamura","Romance",2,25,4.5));
    }
    public static void main(String[] args) {
        populate();
        AnimeDAO animeObj=new AnimeDAO();
        AnimeGenre genreObj=new AnimeDAO();
        Manga mangaObj=new AnimeDAO();

        for (Anime a:animeData){
            System.out.println("\nThe name of the Anime:");
            animeObj.print(a.getName());

            System.out.println("\nThe name of the Favourite Character: ");
            animeObj.print(animeObj.characterNamess(a));

            System.out.println("\nIs there a manga?");
            if(mangaObj.mangaType(a)) {
                mangaObj.printManga(a);
            }else {
                System.out.println("Manga not available");
            }

            System.out.println("\nCan you tell the genre ?");
            animeObj.print(animeObj.findGenre(a));

            System.out.println("---------------------------------");

        }
        System.out.println("\nWhat is the famous genre?");
        genreObj.famousGenre(animeData);
        System.out.println("According to Ratings:");
        Anime famAnime=animeObj.famousGenre(animeData);
        animeObj.print(animeObj.findGenre(famAnime));




    }



}
