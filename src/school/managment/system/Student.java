package school.managment.system;

public class Student {
    private int ID;
    private String name;
    private int feesPaid;
    private int feesTotal;
    private int grade;
    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.ID=id;
        this.name=name;
        this.grade=grade;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void updateFeesPaid(int fees) {
        this.feesPaid = this.feesPaid+fees;
        School.updateTotalMoneyEarned(fees);
    }

    @Override
    public String toString() {
        return "Student's name: "+name +
                "\nTotal fees paid: " + feesPaid;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getGrade() {
        return grade;
    }
    public int getRemainingFees(){
        return this.feesTotal=feesPaid;
    }

}
