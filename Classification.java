public class Classification extends SCP{
    protected String reaction;

    Classification() {
        this.reaction = "*It seems to be dormant.*";
    }
    public void print_info(){
        System.out.println("SCP-" + designation + ", aka " + name + " is a " + classification + " class object.");
        System.out.println(reaction);
    }
    public static void main(String[] args) {
        Classification test = new Classification(); // just me testing functions
        test.print_info();

    }
}
