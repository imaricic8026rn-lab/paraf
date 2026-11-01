package rs.raf.model;

public abstract class Node {

    private String ime;

    protected Node(String ime){
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }
}
