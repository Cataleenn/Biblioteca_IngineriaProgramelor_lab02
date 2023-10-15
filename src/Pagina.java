public class Pagina {
    int pagina;
    String continut;
    public Pagina(int i, String continut) {

        this.pagina = i;
        this.continut = continut;
    }

    public String getContinut() {
        return continut;
    }

    public int getPagina() {
        return pagina;
    }
}
