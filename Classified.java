import java.util.ArrayList;
import java.util.Scanner;

public class Classified extends SCP{
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> startReactions = new ArrayList<String>();
    ArrayList<String> choices = new ArrayList<String>();
    ArrayList<String> positiveReactions = new ArrayList<String>();
    ArrayList<String> negativeReactions = new ArrayList<String>();
    ArrayList<String> checked = new ArrayList<String>();


    public void print_info(){
        System.out.println("SCP-" + designation + ", aka " + name + " is a " + classification + " class object.");
    }
    @Override
    public String toString() {
        return designation;
    }


    public static void main(String[] args) {
        Classified test = new Classified();
        test.print_info();

    }

    public void actions(String[] inputs){ // for sake of customization
        for (int i = 0; i < inputs.length; i++){
            choices.add(inputs[i]);      ///adds indiv reactions as elements under object
        }
    }

    public void addReaction(String[] inputs){ // for sake of customization
        for (int i = 0; i < inputs.length; i++){
            startReactions.add(inputs[i]);
        }
    }
    public void addPReaction(String[] inputs){ // for sake of customization
        for (int i = 0; i < inputs.length; i++){
            positiveReactions.add(inputs[i]);
        }
    }
    public void addNReaction(String[] inputs){ // for sake of customization
        for (int i = 0; i < inputs.length; i++){
            negativeReactions.add(inputs[i]);
        }
    }

    public void check(String[] inputs){ // for sake of customization
        for (int i = 0; i < inputs.length; i++){
            checked.add(inputs[i]);
        }
    }
}
