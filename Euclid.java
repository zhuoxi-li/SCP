public class Euclid extends Classified{
    public Euclid(String designation, String name, boolean docile){
        this.designation = designation;
        this.name = name;
        this.docile = docile;
        classification = "Euclid";
    }

    protected String[] initReactions = {
            designation + " looks at you. \n It seems content in its containment.",
            "It approaches you. It seems curious.",
            "It ignores you."
    };
}
