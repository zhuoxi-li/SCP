public class Safe extends Classified {

    public Safe(String designation, String name, boolean docile){
        this.designation = designation;
        this.name = name;
        this.docile = docile;
        classification = "Safe";
    }

    private String[] initReactions = {
            "It looks at you. \n     It seems content in its containment.",
            "It approaches you. It seems curious.",
            "It ignores you."
    };

    public void initial(){
        int i = (int) (Math.random()*3);
        System.out.println(designation + ": " + initReactions[i]);
    }
}
