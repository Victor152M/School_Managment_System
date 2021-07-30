package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class School {
    private static int totalMoneyEarned;
    private static int  totalMoneySpent;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned = totalMoneyEarned + moneyEarned;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent = totalMoneySpent + moneySpent;
        totalMoneyEarned = totalMoneyEarned - moneySpent;
    }

    public void addTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }
}
