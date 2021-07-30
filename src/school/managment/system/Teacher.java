package school.managment.system;

public class Teacher {
    private int id;
    private  String name;
    private int salary;
    private int salaryEarned;
    public Teacher(int id, String name,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.salaryEarned = 0;
    }

    @Override
    public String toString() {
        return "Name:"+name+
                "\nSalary earned:"+salaryEarned;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * adds to the salry of the teacher
     * removes from the total money earned by IBM
     * @param salary
     */
    public void receivePaycheck(int salary){
        salaryEarned = salaryEarned + salary;
        School.updateTotalMoneySpent(salary);
    }

    public int getSalaryEarned() {
        return salaryEarned;
    }
}
