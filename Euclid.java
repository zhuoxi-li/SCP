import java.util.ArrayList;

public class Euclid extends Classified{
    static ArrayList<String> desigListEuclid = new ArrayList<String>();
    public Euclid(String designation, String name, boolean docile){
        this.designation = designation;
        this.name = name;
        this.docile = docile;
        classification = "Euclid";
        desigListEuclid.add(name);
    }

    public boolean isDocile(){
         return docile;
    }

    public void setPassive(){
        docile = true;
    }

    public void setHostile(){
        docile = false;
    }
}
