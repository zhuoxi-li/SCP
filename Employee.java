public class Employee {


    protected String access;  //clearance access levels
    protected String rank; //classifications, A,B,C,D,E, levels of importance to foundation
    protected String title;

    public Employee(String access, String rank, String title) {
        this.access = access;
        this.rank = rank;
        this.title = title;
    }


    public String getAccess() {
        return access;
    }


    public void setAccess(String access) {
        this.access = access;
    }


    public String getRank() {
        return rank;
    }


    public void setRank(String rank) {
        this.rank = rank;
    }


    public String getTitle() {
        return title;
    }

    public String getAccessInfo() {//info of ranks}

        public String getRankInfo () {
        }
    }
}
