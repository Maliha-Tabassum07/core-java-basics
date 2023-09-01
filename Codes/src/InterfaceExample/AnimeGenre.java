package InterfaceExample;

import java.util.ArrayList;
import java.util.Objects;

public abstract class AnimeGenre {
    public Anime famousGenre(ArrayList<Anime> ane){
        System.out.println("The most famous genre of Anime is action");
        return null;
    }
    public abstract String findGenre(Anime anime);
    public abstract void print(String o);
}
