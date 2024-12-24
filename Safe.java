public class Safe extends Classified {

    public Safe(String designation, String name){
        this.designation = designation;
        this.name = name;
        this.docile = true;
        classification = "Safe";
        initReactions.add("It looks at you. It seems content in its containment.");
        initReactions.add("It approaches you. It seems curious.");
        initReactions.add("It ignores you.");
    }
}
