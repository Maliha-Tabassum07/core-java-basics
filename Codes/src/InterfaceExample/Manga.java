package InterfaceExample;

import java.util.ArrayList;
import java.util.List;

public interface Manga {
    List<String> manga=new ArrayList<>();
    public static void findManga(){
        System.out.println("Print manga");
    }
    public Boolean mangaType(Anime anime);
    default void printManga(Anime anime){
            System.out.println(anime.getMangaAdapt());
    }

    }

