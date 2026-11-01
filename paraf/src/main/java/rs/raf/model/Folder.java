package rs.raf.model;

import java.util.List;
import java.util.ArrayList;

public class Folder extends Node{

    private List<Node> deca;

    public Folder(String ime){
        super(ime);
        deca = new ArrayList<>();
    }

    public void dodajDete(Node dete){
        deca.add(dete);
    }

    public List<Node> getDeca(){
        return deca;
    }

}
