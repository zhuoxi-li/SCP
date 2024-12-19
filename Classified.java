public class Classified extends SCP{
    protected String reaction;

    Classified() {
        this.reaction = "*It seems to be dormant.*";
    }
    public void print_info(){
        System.out.println("SCP-" + designation + ", aka " + name + " is a " + classification + " class object.");
        System.out.println(reaction);
    }
    public static void main(String[] args) {
        Classified test = new Classified();
        test.print_info();

    }
}
