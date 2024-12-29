import java.util.ArrayList;

public class Keter extends Euclid {
    static ArrayList<String> desigListKeter = new ArrayList<String>();

    public Keter(String designation, String name, boolean docile) {
        this.designation = designation;
        this.name = name;
        this.docile = docile;
        classification = "Euclid";
        desigListKeter.add(name);
    }
}
