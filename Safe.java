import java.util.ArrayList;

public class Safe extends Classified {
    static ArrayList<String> desigListSafe = new ArrayList<String>();
    public Safe(String designation, String name){
        this.designation = "SCP-" + designation;
        this.name = name;
        this.docile = true;
        classification = "Safe";
        desigListSafe.add(name);
    }


}
