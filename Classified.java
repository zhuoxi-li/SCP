public class Classified extends SCP{
    protected String reaction;
    protected int positiveInteractions;
    protected int negativeInteractions;

    Classified() {
        this.reaction = "*It seems to be dormant.*";
    }

    public void print_info(){
        System.out.println("SCP-" + designation + ", aka " + name + " is a " + classification + " class object.");
        System.out.println(reaction);
    }

    public void incPositive(){
        positiveInteractions++;
    }

    public void incNegative(){
        negativeInteractions++;
    }

    public static void main(String[] args) {
        Classified test = new Classified();
        test.print_info();

    }
}
