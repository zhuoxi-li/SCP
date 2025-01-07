import java.util.Scanner;
public class Main extends Entities{

    /*
    * only works like this, apparently
    * purpose: Simulate a worker logging in/interacting with SCP objects listed
    * */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Entities listOfEntities = new Entities();
        listOfEntities.initSetup();
        System.out.println("Press enter to begin! - Zhuo");
        System.out.println("\u001B[2J");
        System.out.print("Username: ");
        s.nextLine();
        System.out.println("\033[3mE_Golden\033[0m");
        s.nextLine();
        System.out.println("WARNING: Impersonation of B-Class and above personnel will lead to \n"
        + "implementation of Class-F amnestics and reassignment as D-Class personnel.");
        System.out.println("If you inputted this username accidentally, you may quit now. Else, press Y.");
        String input = s.nextLine();
        while(!input.equalsIgnoreCase("y")) {
            input = s.nextLine();
        }
        System.out.print("Password: ");
        s.nextLine();
        System.out.println("\033[3mdi*******e\033[0m");
        s.nextLine();
        System.out.println("...");
        System.out.println("Welcome, Doctor Evan Golden. Press any key to continue.");
        s.nextLine();

        System.out.println("Which SCP do you plan to visit?");
        for (int l = 0; l < listOfEntities.allSCPS.length; l++) {    //Entity object access array length?
            System.out.println((l +1) + ": " + listOfEntities.allSCPS[l]);
        }
        System.out.println("0: quit (press 0)");
        int chosenSCP = s.nextInt() - 1;
        while (chosenSCP != -1){
            for (int i = 0; i < listOfEntities.allSCPS[chosenSCP].startReactions.toArray().length - 1; i++) {
                System.out.println(listOfEntities.allSCPS[chosenSCP].startReactions.get(i));
                }
            System.out.println(listOfEntities.allSCPS[chosenSCP].choices.getFirst());
            System.out.println("2. Don't.");
            int internalChoice1 = s.nextInt();
            if (internalChoice1 == 1) {
                System.out.println(listOfEntities.allSCPS[chosenSCP].startReactions.getLast());
                System.out.println(listOfEntities.allSCPS[chosenSCP].choices.getLast());
                System.out.println("2. Don't.");
                System.out.println("3. Check.");
                int internalChoice2 = s.nextInt();
                if (internalChoice2 == 1) {
                    for (int j = 0; j < listOfEntities.allSCPS[chosenSCP].negativeReactions.toArray().length; j++) {
                        System.out.println(listOfEntities.allSCPS[chosenSCP].negativeReactions.get(j));
                        s.nextLine();
                    }
                    }
                else if (internalChoice2 == 2) {
                    for (int k = 0; k < listOfEntities.allSCPS[chosenSCP].positiveReactions.toArray().length; k++) {
                        System.out.println(listOfEntities.allSCPS[chosenSCP].positiveReactions.get(k));
                        s.nextLine();
                    }
                    }
                else if (internalChoice2 == 3) {
                    int response = (int) (Math.random() * listOfEntities.allSCPS[chosenSCP].checked.toArray().length);
                    System.out.println(listOfEntities.allSCPS[chosenSCP].checked.get(response));
                    s.nextLine();
                    }
                while (internalChoice2 == 3){
                    System.out.println(listOfEntities.allSCPS[chosenSCP].startReactions.getLast());
                    System.out.println(listOfEntities.allSCPS[chosenSCP].choices.getLast());
                    System.out.println("2. Don't.");
                    System.out.println("3. Check.");
                    internalChoice2 = s.nextInt();
                    if (internalChoice2 == 1) {
                        for (int j = 0; j < listOfEntities.allSCPS[chosenSCP].negativeReactions.toArray().length; j++) {
                            System.out.println(listOfEntities.allSCPS[chosenSCP].negativeReactions.get(j));
                            s.nextLine();
                        }
                    }
                    else if (internalChoice2 == 2) {
                        for (int k = 0; k < listOfEntities.allSCPS[chosenSCP].positiveReactions.toArray().length; k++) {
                            System.out.println(listOfEntities.allSCPS[chosenSCP].positiveReactions.get(k));
                            s.nextLine();
                        }
                    }
                    else if (internalChoice2 == 3) {
                        int response = (int) (Math.random() * listOfEntities.allSCPS[chosenSCP].checked.toArray().length);
                        System.out.println(listOfEntities.allSCPS[chosenSCP].checked.get(response));
                        s.nextLine();
                        }
                    }
                }
            else if (internalChoice1 == 2){
                System.out.println("You left the room.");
                s.nextLine();
                }

            for (int l = 0; l < listOfEntities.allSCPS.length; l++) {
                System.out.println((l +1) + ": " + listOfEntities.allSCPS[l]);
                }
            System.out.println("0: quit (press 0)");
            chosenSCP = s.nextInt() - 1;

            //not int, throws InputMismatchException. Catch it!!

        }



    }
}