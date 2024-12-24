import java.util.ArrayList;
import java.util.Scanner;

public class Classified extends SCP{
    protected String reaction;
    protected int positiveInteractions;
    protected int negativeInteractions;
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> initReactions = new ArrayList<String>();
    ArrayList<String> mainReactions = new ArrayList<String>();

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
    public void initial(){
        int i = (int) (Math.random()*initReactions.toArray().length);
        System.out.println(designation + ": " + initReactions.get(i));
    }

    public void addReaction(){ // for sake of customization
        System.out.println("Add reaction: ");
        String addedReaction = scanner.nextLine();
        mainReactions.add(addedReaction);
    }

    public void listReactions(){
        for (int i = 0; i < mainReactions.size(); i++) {
            System.out.println((i + 1) + ". " + mainReactions.get(i));
        }
    }
    public void removeReactions(){ // for sake of customization
        listReactions();
        int removedReaction = scanner.nextInt();
        mainReactions.remove(removedReaction);

    }
}
