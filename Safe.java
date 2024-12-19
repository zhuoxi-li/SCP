public class Safe extends Classified {

    public Safe(String designation, String name, boolean docile){
        this.designation = designation;
        this.name = name;
        this.docile = docile;
        classification = "Safe";
    }

    public String[] initReactions = {
            designation + " looks at you. \n It seems content in its containment.",
            "It approaches you. It seems curious.",
            "It ignores you."
    };
}
