package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(3,"Lizzy",3455);
        Teacher Melissa = new Teacher(1, "Melissa",5324);
        Teacher Doglas = new Teacher(4,"Doglas",3811);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Melissa);
        teacherList.add(Lizzy);
        teacherList.add(Doglas);
        Student Jeff = new Student(1,"Jeff",7);
        Student Elon = new Student(2,"Elon",5);
        List<Student> studentList= new ArrayList<>();
        studentList.add(Jeff);
        studentList.add(Elon);
        School IBM = new School(teacherList,studentList);
        Jeff.updateFeesPaid(5442);
        Elon.updateFeesPaid(4235);
        System.out.println("IBM has earned "+IBM.getTotalMoneyEarned());
        Lizzy.receivePaycheck(Lizzy.getSalary());
        System.out.println("IBM has paid to "+Lizzy.getName()+" and now has "+IBM.getTotalMoneyEarned());
        Doglas.receivePaycheck(Doglas.getSalary());
        System.out.println("IBM has paid to "+Doglas.getName()+" and now has "+IBM.getTotalMoneyEarned());
        System.out.println(Elon);
        System.out.println(Doglas);
    }
}
