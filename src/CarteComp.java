import java.util.Comparator;

public class CarteComp implements Comparator<Carte> {
    @Override
    public int compare(Carte c1, Carte c2) {
        // Use the compareTo method of String to compare names
        if (c1.getAutor().compareTo(c2.getAutor()) == 0)
            return c1.getTitlu().compareTo(c2.getTitlu());
        else
            return c1.getAutor().compareTo(c2.getAutor());
    }

}
