package data;

public class Staff extends Person {
    private int staffId;
    private Occupation occupation;

    public Staff(String name, String address, String email, int staffId, Occupation occupation) {
        super(name, address, email);
        this.staffId = staffId;
        this.occupation = occupation;
    }

    public String toString() {
        return super.toString() +
                "\tStaff id:" + this.staffId +
                "\tOccupation:" + this.occupation.getName();
    }

    public int getStaffId() {
        return staffId;
    }

    public Occupation getOccupation() {
        return occupation;
    }
}
