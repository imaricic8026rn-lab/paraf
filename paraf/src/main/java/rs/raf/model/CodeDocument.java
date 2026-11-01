package rs.raf.model;

public class CodeDocument extends Document{

    public CodeDocument(String ime){
        super(ime);
    }

    @Override
    public boolean isPrelamanjeRedova(){
        return false;
    }

    @Override
    public boolean isMonospace() {
        return true;
    }
}
