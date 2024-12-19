public class Employee {


    protected int access;  //clearance access levels
    protected String rank; //classifications, A,B,C,D,E, levels of importance to foundation
    protected String ID;
    protected String job; //job, ID could be name/number. Title could be in other.role add to others too. method info for user for available positions for the rank.

    //protected interact  //interact as if-else statement

    // e.g. "Level 2 B-rank
    public Employee(int access, String rank, String ID) {
        this.access = access;
        this.rank = rank;
        this.ID = ID;
    }

    public Employee(int access, String rank, String name, String ID, String job) {
        this.access = access;
        this.rank = rank;
        this.ID = ID;
        this.job = job;
    }

    public Employee() {

    }

//
// GETTERS & SETTERS
//
    //can change level security clearance access to info
    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    //level of employee importance
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    //if is important, or !(E||D) rank, then they might have a title, like guard, agent, Doctor
    public String getID() {
        return ID;
    }
    //vv might be less used, but in the event they get transferred or dsomething
    public void setID(String ID){
        this.ID = ID;
    }

///
// OTHER METHODS
///
    public String toString(){
        return "\t\t~~~Emloyee:~~~\n" + this.rank + "-class \nID: " + this.ID + "\nClearance: Level " + this.access + "\nRole: " + this.job;
    }

    public static String getAccessInfo() {/*info of security ranks*/
        String info; //or empty method??
        //scanner
        //if{}
       //else if{
            info ="\tLevel 0, or Official Use Only, clearance is normally granted to non-essential personnel, such \n\tas logistical, administrative, or janitorial positions. However, these personnel are only given \n\tthis access if they work in a facility that holds little to no anomalous objects or data, \n\totherwise they are granted Level 1. This clearance is also given to allied GoI visitors of SCP \n\tFoundation facilities.\n" +
                    "\n" +
                    "\tThis clearance grants the bare minimum of access, with no documentation or sensitive data \n\tbeing granted to this class of personnel. Keycards are not granted to any member possessing \n\tthis level of clearance.";
       //}
        return info;
    }
    public String getRankInfo() { return "Ranks: E, D, C, B, A";}


    public static void main(String[] args) {

        Employee d123 = new Employee(1, "D", "123");

        System.out.println(d123);
        System.out.println();
        System.out.println(Employee.getAccessInfo());
    }
}

//worked on info, and worked out uses of SCP and interactions. THis will be included after.
