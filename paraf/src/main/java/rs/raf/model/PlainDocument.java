package rs.raf.model;

public class PlainDocument extends Document{

    public PlainDocument(String ime){
        super(ime);

    }

    @Override
    public boolean isPrelamanjeRedova() {
        return true;
    }

    @Override
    public boolean isMonospace() {
        return false;
    }


}
