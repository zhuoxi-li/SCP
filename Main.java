import java.util.Scanner;

public class Main extends Entities{
    int tempUserInteraction = 0;
    int posInteraction = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Entities listOfEntities = new Entities();
        listOfEntities.initSetup();
        System.out.println("Press enter during the beginning ! - Zhuo");
        System.out.println("\f");
        System.out.println("Username: ");
        s.nextLine();
        System.out.println("\033[3mE_Golden\033[0m");
        s.nextLine();
        System.out.println("WARNING: Impersonation of B-Class and above personnel will lead to \n"
        + "implementation of Class-F amnestics and reassigned as D-Class personnel.");
        System.out.println("If you inputted this username accidentally, you may quit now. Else, press Y.");
        String input = s.nextLine();
        while(!input.equalsIgnoreCase("y")) {
            input = s.nextLine();
        }
        System.out.println("Password: ");
        s.nextLine();
        System.out.println("\033[3mdi*******e\033[0m");
        s.nextLine();
        System.out.println("...");
        System.out.println("Welcome, Doctor Evan Golden. Press any key to continue.");
        s.nextLine();
        System.out.println("Which SCP do you plan to visit?");
        for (int i = 0; i < listOfEntities.allSCPS.length; i ++) {
            System.out.println((i +1) + ": " + listOfEntities.allSCPS[i]);
        }
        System.out.println((listOfEntities.allSCPS.length + 1) + ": quit (press 0)");



    }
}