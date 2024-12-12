package stage1.Home_work_1.Faculty.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Teacher teacher;
    private List<Student> students;

    public Course(String courseName, Teacher teacher){
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public String getCourseName(){
        return courseName;
    }

}
