import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carte> books = new ArrayList<Carte>();
        Carte c = new Carte("Eminescu", "Poezii");
        c.insertPages(1, "Afară-i toamnă, frunza 'mprăştiată, Iar vântul svârlă 'n geamuri grele picuri");
        c.insertPages(2, "Şi tu citeşti scrisori din roase plicuri\n" + "Şi într'un ceas gândeşti la viaţa toată.");
        c.insertPages(3, "Pierzându-ţi timpul tău cu dulci nimicuri,\n" +
                "N'ai vrea ca nimeni 'n uşa ta să bată;");
        books.add(c);

        c = new Carte("Eminescu", "Ce te legeni");
        c.insertPages(1, "- Ce te legeni, codrule,\n" +
                "Fără ploaie, fără vânt,\n");

        c.insertPages(2, "Ziua scade, noaptea creşte\n" +
                "Şi frunzişul mi-l răreşte.\n" +
                "Bate vântul frunza-n dungă -\n");
        c.insertPages(3, "Peste vârf de rămurele\n" +
                "Trec în stoluri rândurele,\n");
        books.add(c);

        c = new Carte("Ion Creanga", "Amintiri din copilarie");
        c.insertPages(1, "A doua zi însă a venit părintele pe la noi, s-a înţeles cu\n" +
                "tata, m-au luat ei cu binişorul şi m-au dus iar la şcoală");
        c.insertPages(2, "Ce să faci, că doar numai de două ori pe an este ajunul!");
        c.insertPages(3, "Mama însă era în stare să toarcă-n furcă, şi să învăţ\n" +
                "mai departe.");
        books.add(c);

        c = new Carte("Arghezi", "Flori de mucegai");
        c.insertPages(1, "Le-am scris cu unghia pe tencuială\n" +
                "Pe un părete de firidă goală,");
        c.insertPages(2, "Care au lucrat împrejurul\n" +
                "Lui Luca, lui Marcu şi lui Ioan.");
        c.insertPages(3, "Şi de foame de scrum,\n" +
                "Stihurile de acum.");
        books.add(c);

        Collections.sort(books, new CarteComp());

        String s = "Ce să faci";
        for (Carte x : books) {
            x.searchPhrase(s);
        }
        for (Carte x : books) {
            if (x.titlu == "Amintiri din copilarie")
                x.afiseazaContinutPagina(3);
        }

    }
}