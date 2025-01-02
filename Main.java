import java.util.Scanner;

public class Main extends Entities{
    int tempUserInteraction = 0;
    int posInteraction = 0;;

    public createNewSCP(Entities SCP){
        Scanner scan = new Scanner(System.in);

        System.out.println("please input a [name], [species], [age], [place/setting] and either [true] or [false]");
        String aName = scan.nextLine();
        String aSpecies = scan.nextLine();
        int age = scan.nextInt();
        String habitat = scan.nextLine();
        boolean alive = scan.nextBoolean();
    }

    public intakeSCP(Entities SCP){
        listOfEntities.add(SCP);
    }

    public static void main(String[] args) {
        Entities listOfEntities = new Entities();
        listOfEntities.initSetup();



    }
}