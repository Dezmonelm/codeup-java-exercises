package interfaces_abstract_lecture;

public class Custodian extends Employee{
    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {return "Maintaining the building - cleaning up messes - restocking!";}

    @Override
    public String morningMeeting() {
        return "Custodians have a direct report to the maintenace department. They schedule meetings as necessary.";
    }

    @Override
    public String lunchTime() {
        return "12:00 - 1:00PM";
    }

    @Override
    public int dailyPay() {
        return 180;
    }
}
