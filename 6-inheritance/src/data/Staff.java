package data;

public class Staff {
    private String name, address, email;
    private int staffId;
    private Occupation occupation;

    public Staff(String name, String address, String email, int staffId, Occupation occupation) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.staffId = staffId;
        this.occupation = occupation;
    }

    public String toString() {
        return "Name:\t" + this.name +
                "Address:\t" + this.address +
                "Email:\t" + this.email +
                "Staff id:\t" + this.staffId +
                "Occupation:\t" + this.occupation.getName();
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public int getStaffId() {
        return staffId;
    }

    public Occupation getOccupation() {
        return occupation;
    }
}
