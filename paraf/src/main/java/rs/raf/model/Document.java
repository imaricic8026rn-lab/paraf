package rs.raf.model;

public abstract class Document extends Node{

    private String tekst;

    protected Document(String ime){
        super(ime);
        this.tekst = "";
    }

    public String getTekst(){
        return tekst;
    }

    public void setTekst(String noviTekst){
        tekst = noviTekst;
    }

    public abstract boolean isPrelamanjeRedova();

    public abstract boolean isMonospace();
}
