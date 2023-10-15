import java.util.ArrayList;

public class Carte {
    String autor;
    String titlu;
    Pagina pag;
    ArrayList<Pagina> pages = new ArrayList<Pagina>();

    public Carte(String autor, String titlu) {
        this.autor = autor;
        this.titlu = titlu;

    }

    void insertPages(int i, String continut) {

        pages.add(new Pagina(i, continut));

    }

    void searchPhrase(String phrase) {

        for (Pagina p : pages) {
            int index = p.continut.indexOf(phrase);
            if (index != -1) {
                //String foundPhrase = p.continut.substring(index, index + phrase.length());
                //System.out.println(foundPhrase);
                afiseazaTitluPagina(p.pagina);
            }
        }

    }

    public String getAutor() {
        return autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public void afiseazaAutorTitlu() {
        System.out.println("Autor:" + autor + "     Titlu:" + titlu);

    }

    public void afiseazaTitluPagina(int pag) {
        System.out.println("Carte:" + titlu + "   Pagina:" + pag);
    }

    public void afiseazaContinutPagina(int pag) {
        System.out.println("Carte:" + titlu + " Pagina" + pag);
        Pagina p = pages.get(pag - 1);
        System.out.println(p.continut);
    }
}