package interfaces_abstract_lecture;

public class Accountant extends Employee{


    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "TPS Reports have been drafted!";
    }

    @Override
    public String morningMeeting() {
        return "Accountants have morning meetings beginning at 8:15AM to 8:45OM";
    }

    @Override
    public String lunchTime() {
        return "Accountants take their lunch when they want to.";
    }

    @Override
    public int dailyPay() {
        return 500;
    }
}
