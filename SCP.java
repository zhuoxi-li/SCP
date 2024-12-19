public class SCP {
    protected String designation;
    protected String name;
    protected boolean docile;
    protected String classification;
    SCP(){
        designation = "SCP-XXXX";
        name = "Unnamed";
        docile = true;
        classification = "pending";

    }

    public void response(String[] reactions, int pos, int total){
        if (pos > total){
            //TODO: ADD INFO AND REACTIONS + INTERACTION COUNTER FOR PLAYER
        }
    }
}
